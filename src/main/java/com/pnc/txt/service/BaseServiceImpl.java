package com.pnc.txt.service;

import java.util.ArrayList;
import java.util.List;

import com.pnc.txt.model.Message;
import com.pnc.txt.model.ServiceResponse;
import com.pnc.txt.model.Status;
import com.pnc.txt.util.MessageResourcesUtil;
import com.pnc.txt.util.ValidationUtil;
import com.pnc.txt.model.FrameworkConstants;
import com.pnc.txt.model.HttpErrorCodes;
//import com.att.sales.framework.util.MessageResourcesUtil;
//import com.att.sales.framework.util.ValidationUtil;

public class BaseServiceImpl implements IBaseService {

	/** The message mappings. */
	private java.util.Map<String, Message> messageMappings;

	ValidationUtil validationUtil = new ValidationUtil();

	public ValidationUtil getValidationUtil() {

		return this.validationUtil;
	}

	/**
	 * Gets the message mappings.
	 *
	 * @return the messageMappings.
	 */
	public java.util.Map<String, Message> getMessageMappings() {
		return this.messageMappings;
	}

	/**
	 * Sets the message mappings.
	 *
	 * @param messageMappings
	 *            the messageMappings to set.
	 */
	public void setMessageMappings(java.util.Map<String, Message> messageMappings) {
		this.messageMappings = messageMappings;
	}

	/**
	 * Gets the error status.
	 *
	 * @param msgCode
	 *            the msg code
	 * @return the error status
	 */
	public Status getErrorStatus(String msgCode) {
		List<Message> messageList = new ArrayList<Message>();
		/** The message mappings. */
		this.messageMappings = MessageResourcesUtil.getMessageMapping();
		Message message = this.messageMappings.get(msgCode);
		Status status = new Status();
		status.setCode(HttpErrorCodes.ERROR.toString());
		messageList.add(message);
		status.setMessages(messageList);
		return status;
	}

	public ServiceResponse setSuccessResponse(ServiceResponse response) {

		Status status = new Status();
		List<Message> messageList = new ArrayList<>();
		Message msg = new Message("M00000", "REQUEST_COMPLETED_SUCCESSFULLY", "REQUEST_COMPLETED_SUCCESSFULLY");
		messageList.add(msg);
		status.setCode(HttpErrorCodes.STATUS_OK.toString());
		status.setMessages(messageList);

		response.setStatus(status);

		return response;
	}

	public ServiceResponse setSuccessResponse(ServiceResponse response, String errorCode) {

		Status status = new Status();
		List<Message> messageList = new ArrayList<>();
		Message msg = MessageResourcesUtil.getMessageMapping().get(errorCode);
		messageList.add(msg);
		status.setCode(HttpErrorCodes.STATUS_OK.toString());
		status.setMessages(messageList);

		response.setStatus(status);

		return response;
	}

	public ServiceResponse setSuccessResponse(ServiceResponse response, List<String> messageCodes) {

		List<Message> messagesErrorCodes = new ArrayList<Message>();

		messageCodes.forEach((msgCd) -> {

			Message message = MessageResourcesUtil.getMessageMapping().get(msgCd);
			messagesErrorCodes.add(message);

		});

		Status status = new Status();

		status.setCode(HttpErrorCodes.STATUS_OK.toString());
		status.setMessages(messagesErrorCodes);

		response.setStatus(status);

		return response;
	}

}