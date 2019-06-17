package com.pnc.txt.model;

public final class HttpErrorCodes {

	/**
	 * Instantiates a new common constants.
	 */
	private HttpErrorCodes() {
	}

	/** OK: Success response. */
	public static final Integer STATUS_OK = 200;

	/** Unprocessable entity: This is used for sending validation errors **/
	//public static final Integer ERROR = 422;
	/**
	 * Bad Request: The client has sent a request object that the server could not
	 * parse. Often malformed JSON.
	 **/
	public static final Integer ERROR = 400;

	
	public static final Integer SERVER_ERROR = 500;
	

	
}
