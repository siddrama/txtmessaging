package com.pnc.txt.model;

public final class MessageConstants {

	private MessageConstants() {
		// default constructor
	}

	/** The constant for "status ok". */
	public static final String STATUS_OK = "200";

	/** The constant for "status fail". */
	public static final String STATUS_FAIL = "400";

	public static final int EXCEPTION = 500;

	public static final int NOT_FOUND = 404;

	/** The constant for "error". */
	public static final int ERROR = Integer.parseInt("400");

	/** The constant for "service not defined". */
	public static final String SERVICE_NOT_DEFINED = "M01014";

	public static final String PROCESS_ERROR = "M00096";

	public static final String REQUEST_COMPLETED_SUCCESSFULLY = "M00000";

	public static final String REQUEST_FAILED = "M00001";

	public static final String NO_MATCHING_RECORDS = "M00097";

	public static final String NO_DISCOUNT_REFID_FOUND = "M00098";

	public static final String HRID_CALL_FAILED = "M20001";

	public static final String MF000 = "MF000";

	public static final String FE4000 = "FE4000";

	public static final String FE4001 = "FE4001";

	public static final String FE4003 = "FE4003";

	public static final String ADDRESS_EXCEPTION = "M00103";

	public static final String PROCESS_ERROR_CODE = "M00003";

	public static final String REQUEST_PARSE_ERROR = "M00202";

	public static final String DATALOAD_FILE_NAME_EXCEPTION = "M04306";
	
	/**
	 * FILE_PROMOTION_FAILED
	 */
	public static final String FILE_PROMOTION_FAILED = "FPF30007";
	
	/**
	 * FILE_DOWNLOAD_FAILED
	 */
	public static final String FILE_DOWNLOAD_FAILED = "FPF30008";
	
	public static final String INVALID_PROMOCODE="M00104";
	
	public static final String FAILED_TO_GET_RULES="M00105";
	
	
}
