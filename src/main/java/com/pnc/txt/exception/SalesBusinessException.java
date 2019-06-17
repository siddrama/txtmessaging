package com.pnc.txt.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.pnc.txt.model.Message;
import com.pnc.txt.model.Status;
import com.pnc.txt.model.constants.FrameworkConstants;
import com.pnc.txt.model.constants.HttpErrorCodes;
import com.pnc.txt.util.MessageResourcesUtil;

/**
 * The Class SalesBusinessException.
 *
 * 
 * 
 *         SalesBusinessException is thrown for all the exception categories
 *         with suitable message code and message description.
 */

public class SalesBusinessException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The http Error Code . */
	private Integer httpErrorCode;

	
	
	/** The list of message codes */
	private List<Message> messageCodes = new ArrayList<Message>();
	
	private boolean successFlag=false;

	private String msgCode;

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	public boolean isSuccessFlag() {
		return successFlag;
	}

	public void setSuccessFlag(boolean successFlag) {
		this.successFlag = successFlag;
	}

	
	public Integer getHttpErrorCode() {
		return httpErrorCode;
	}

	public void setHttpErrorCode(Integer httpErrorCode) {
		this.httpErrorCode = httpErrorCode;
	}

	


	/**
	 * Instantiates a new sales business services exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public SalesBusinessException() {

		Message errorMessage = new Message("M00003", "PROCESS_ERROR", "Process Error!!!");
		
		this.httpErrorCode=500;
		List<Message> errorMessages = new ArrayList<Message>();
		errorMessages.add(errorMessage);

		this.setMessageCodes(errorMessages);

	}

	/**
	 * Instantiates a new sales business services exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public SalesBusinessException(String msgCode) {
		super(msgCode);
		this.msgCode=msgCode;
		if("M00003".equalsIgnoreCase(msgCode)) {
		
			this.httpErrorCode=500;
		}
		else {
		
			this.httpErrorCode=400;
		}
		
		Message message = MessageResourcesUtil.getInstance().getMessageMapping().get(msgCode);
		if(message==null) {
			
			message = new Message("M00002", "BAD_REQUEST","Exception happened while processing the request".concat(" ").concat(msgCode));
			this.httpErrorCode=400;
		}

		List<Message> messageCods = new ArrayList();
		messageCods.add(message);
		this.setMessageCodes(messageCods);

	}
	
	/**
	 * Instantiates a new sales business services exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public SalesBusinessException(String msgCode,boolean successFlag) {
		super(msgCode);
		this.msgCode=msgCode;
		
		if(successFlag==true) {
			this.httpErrorCode=200;
		}
		else {
		this.httpErrorCode=400;
		}

		Message message = MessageResourcesUtil.getInstance().getMessageMapping().get(msgCode);
		if(message==null) {
			
			message = new Message("M00002", "BAD_REQUEST","Exception happened while processing the request. ".concat(msgCode));
			this.httpErrorCode=400;
		}

		List<Message> messageCods = new ArrayList();
		messageCods.add(message);
		this.setMessageCodes(messageCods);
		this.setSuccessFlag(successFlag);

	}
	

	/**
	 * Instantiates a new sales business services exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public SalesBusinessException(List<String> messageCodes) {
		
		this.httpErrorCode=400;

		List<Message> messagesErrorCodes = new ArrayList<Message>();

		messageCodes.forEach((msgCd) -> {

			Message message = MessageResourcesUtil.getMessageMapping().get(msgCd);
			messagesErrorCodes.add(message);

		});
		this.setMessageCodes(messagesErrorCodes);

	}
	
	/**
	 * Instantiates a new sales business services exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public SalesBusinessException(List<String> messageCodes,boolean successFlag) {

		if(successFlag==true) {
			this.httpErrorCode=200;
		}
		else {
		this.httpErrorCode=400;
		}
		
		List<Message> messagesErrorCodes = new ArrayList<Message>();

		messageCodes.forEach((msgCd) -> {

			Message message = MessageResourcesUtil.getMessageMapping().get(msgCd);
			messagesErrorCodes.add(message);

		});
		this.setMessageCodes(messagesErrorCodes);

	}
	
	
	

	public SalesBusinessException(Integer httpErrorCode,List<Message> messageCodes, boolean messageFlag) {

		this.setMessageCodes(messageCodes);
		this.httpErrorCode=httpErrorCode;

	}
	
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#toString()
	 */
	@Override
	public String toString() {
		String className = getClass().getName();
		
		String messages="";
		
		for(Message message:messageCodes) {
			messages.concat(message.getDescription()).concat(" ");
			
		}
		
		return className + ": " + messages;
	}

	public List<Message> getMessageCodes() {
		return messageCodes;
	}

	public void setMessageCodes(List<Message> messageCodes) {
		this.messageCodes = messageCodes;
	}
}
