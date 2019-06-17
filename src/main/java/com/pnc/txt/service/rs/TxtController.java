package com.pnc.txt.service.rs;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestBody;

import com.pnc.txt.bean.TxtRequestData;
import com.pnc.txt.exception.SalesBusinessException;

@Path("/txt")
@Produces({ MediaType.APPLICATION_JSON })
public interface TxtController {
	
	@POST
	@Path("/sendtxtmessage")
	@Produces({ MediaType.APPLICATION_JSON })

	public Response sendTxtMessage(@RequestBody TxtRequestData txtRequestData) throws SalesBusinessException;

}
