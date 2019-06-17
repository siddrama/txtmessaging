package com.pnc.txt.service.rs;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pnc.txt.model.Message;
import com.pnc.txt.model.MessageConstants;

import com.pnc.txt.model.ServiceMetaData;
import com.pnc.txt.model.ServiceResponse;
import com.pnc.txt.model.Status;
import com.pnc.txt.model.StringConstants;
import com.pnc.txt.service.TxtManagementServiceImpl;
import com.pnc.txt.util.MessageResourcesUtil;
import com.pnc.txt.bean.TxtRequestData;
import com.pnc.txt.exception.SalesBusinessException;

/**
 * Controller added as part of Reference/Transaction flow.
 */

@Service
public class TxtManagementController implements TxtController {
	/**
	 * Reference of service layer
	 */
@Autowired
TxtManagementServiceImpl txtManagementService;
	private static final Logger LOG = LoggerFactory.getLogger(TxtManagementController.class);

	private java.util.Map<String, Message> messageMappings;
	
	@Override
	public Response sendTxtMessage(TxtRequestData txtRequestData) throws SalesBusinessException {
		ServiceResponse response = new ServiceResponse();
		LOG.info("SERVICE LOG :: ENTERING getDiscountDetails");
		Status status = new Status();
		try {
			
			
				if(txtRequestData.getPhoneNumber() != null){
				try {
					response = txtManagementService.sendTxtDetails(txtRequestData);
				} catch (IOException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				status = response.getStatus();
				}
			else {
				throw new SalesBusinessException(status.getCode());
			}

		} catch (SalesBusinessException salesBusinessException) {
			response.setStatus(txtManagementService.getErrorStatus(salesBusinessException.getMessage()));
			return handleException(response, salesBusinessException);
		}
		if (null == status) {
			//status = DiscountManagementUtil.requestProcessedSuccessfully();
			response.setStatus(status);
		} else {
			response.setStatus(status);
		}
		LOG.info("SERVICE LOG :: ENTERING getDiscountDetails");
		return Response.status(Response.Status.OK).entity(response).build();
	}
	


	public Response handleException(ServiceResponse response, SalesBusinessException exception) {

		LOG.error("Exception ...Handling Exception..");
		Status status = new Status();

		status = getErrorStatusForMessages(exception.getMessageCodes(), exception.getHttpErrorCode());

		response.setStatus(status);
		if (exception.getHttpErrorCode() == 200) {

			return Response.status(javax.ws.rs.core.Response.Status.OK).entity(response).build();
		} else if (exception.getHttpErrorCode() == 400) {

			return Response.status(javax.ws.rs.core.Response.Status.BAD_REQUEST).entity(response).build();
		} else if (exception.getHttpErrorCode() == 500) {

			return Response.status(javax.ws.rs.core.Response.Status.BAD_REQUEST).entity(response).build();
		} else {

			return Response.status(javax.ws.rs.core.Response.Status.BAD_REQUEST).entity(response).build();
		}

	}
	public Status getErrorStatusForMessages(List<Message> messageCodes, Integer httpErrorCode) {

		Status status = new Status();

		this.messageMappings = MessageResourcesUtil.getMessageMapping();
		if (httpErrorCode != null) {

			status.setCode(httpErrorCode.toString());
		}

		status.setMessages(messageCodes);

		return status;
	}



	public java.util.Map<String, Message> getMessageMappings() {
		return messageMappings;
	}



	public void setMessageMappings(java.util.Map<String, Message> messageMappings) {
		this.messageMappings = messageMappings;
	}
}
