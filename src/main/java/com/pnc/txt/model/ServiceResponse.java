package com.pnc.txt.model;

import java.io.Serializable;
import java.util.Date;

//import org.codehaus.jackson.map.annotate.JsonSerialize;




//@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ServiceResponse  implements Serializable  {
	

	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1015399252230439816L;

	/** The status. */
	
	private Status status;

	/** The request id. */
	private String transactionId;

	/** The response time. */
	private String responseTime;

	/** The timestamp. */
	private String timestamp;
	
	
	
	
	
	
	
	/**
	 * Instantiates a new service response.
	 *
	 * @inheritDoc Default constructor.
	 */
	public ServiceResponse() {
		
		Long requestStartTime=ServiceMetaData.getRequestStartTime();
		if(requestStartTime!=null) {
			this.setTimestamp(new Date(requestStartTime).toString());
		}
		
		this.setTransactionId();
	}
	
	
	/**
	 * Instantiates a new service response.
	 *
	 * @param status
	 *            the status
	 * @inheritDoc constructor.
	 */
	public ServiceResponse(Status status) {
		super();
		this.setStatus(status);
		this.setResponseTime();
	}

	/**
	 * Gets the status.
	 *
	 * @return the status.
	 */
	public final Status getStatus() {
		return this.status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status
	 *            the status to set.
	 */
	public final void setStatus(Status status) {
		this.status = status;
		this.setResponseTime();
	}

	/**
	 * Gets the TransactionId id.
	 *
	 * @return the requestId.
	 */
	public final String getTransactionId() {
		return this.transactionId;
	}
	
	

	/**
	 * Sets the request id.
	 *
	 * @param requestId
	 *            the requestId to set.
	 */
	
	private final void setTransactionId() {
		
		if(ServiceMetaData.getRequestMetaData()!=null && ServiceMetaData.getRequestMetaData().get("X-ATT-TransactionId")!=null) {
		
			this.transactionId = (String)ServiceMetaData.getRequestMetaData().get("X-ATT-TransactionId");
		}
		
	}


	/**
	 * Gets the response time.
	 *
	 * @return the responseTime.
	 */
	public final String getResponseTime() {
		return this.responseTime;
	}

	private  final void setResponseTime() {
		
		if(ServiceMetaData.getElapsedTime()!=null) {
		this.responseTime = Long.toString(ServiceMetaData.getElapsedTime());
		}
		
	}
	
	/**
	 * Sets the response time.
	 *
	 * @param responseTime
	 *            the responseTime to set.
	 */
	
	/**
	 * Gets the timestamp.
	 *
	 * @return the time stamp.
	 */
	public final String getTimestamp() {
		return this.timestamp;
	}

	/**
	 * Sets the timestamp.
	 *
	 * @param timestamp
	 *            the time stamp to set.
	 */
	public final void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	

	
	
}
