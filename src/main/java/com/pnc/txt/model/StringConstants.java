
package com.pnc.txt.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class StringConstants.
 *
 * @author sk0063 Removing offer from header and adding some more fields as part
 *         header validation.
 */
public class StringConstants {

	private StringConstants() {
		// default constructor
	}

	/** The offer. */
	/** The version. */
	public static final String VERSION = "version";

	public static final String USERNAME = "usrname";

	public static final String PASS = "password";

	public static final String ATT_SYSTEM = "X-ATT-SYSTEM";

	public static final String ATT_REQUESTID = "X-ATT-REQUEST-ID";

	public static final String CONTENT_TYPE = "Content-Type";

	public static final String NOT_FOUND_STATUS = "404";

	public static final String SYSTEM_UNAVAILABLE_STATUS = "500";

	public static final String ERROR_STATUS = "400";

	public static final String COMMON_PROVIDER = "C";

	public static final String SERVICE_NOT_DEFINED = "Service not defined : ServiceName : ";

	public static final String PROJECT_IDS = "projectIds";
	/**
	 * TRANSACTIONAL_FLOW.
	 */
	public static final String TRANSACTIONAL_FLOW = "transactionalFLow";

	/**
	 * INACTIVATE_DISCOUNT.
	 */
	public static final String INACTIVATE_DISCOUNT = "EndDateDisc";

	/**
	 * INACTIVATE_DISCOUNT_AUTH_LEVEL.
	 */
	public static final String INACTIVATE_DISCOUNT_AUTH_LEVEL = "InactiveDiscAuthLevel";
	public static final String VALIDATE_PRICE_PLAN_DATA = "validate_Price_Plan_Data";

	public static final String VALIDATE_TRANSACTION_DATA_BEID = "validateTransactionalData_Beid";

	public static final String VALIDATE_TRANSACTION_DATA_PRICE_PLAN_DATA = "validateTransactionalData_PricePlanData";

	/**
	 * ADD_DISCOUNT.
	 */
	public static final String ADD_DISCOUNT = "AddDisc";

	/**
	 * NEW_DISC_AUTH_LEVEL.
	 */
	public static final String NEW_DISC_AUTH_LEVEL = "NewDiscAuthLevel";

	/**
	 * CHANGE_DISCOUNT.
	 */
	public static final String CHANGE_DISCOUNT = "changeDisc";
	/**
	 * Apply SubGroup Processor
	 */
	public static final String APL_SUB_GROUP = "aplSubGrp";
	/**
	 * DISCOUNT_UPDATED_SUCCESSFULLY.
	 */
	public static final String REQUEST_PROCESSED_SUCCESSFULLY = "Request Processed Successfully";

	/**
	 * DISCOUNT_UPDATE_FAILED.
	 */
	public static final String DISCOUNT_UPDATE_FAILED = "Discount update failed";
	/**
	 * AVPN Product type
	 */
	public static final String PRODUCT_TYPE_AVPN = "AVPN";
	public static final String PRODUCT_TYPE_AVPNE = "AVPN_EXPRESS";

	/**
	 * PRODUCT_TYPE_NETBOND
	 */
	public static final String PRODUCT_TYPE_NETBOND = "NETBOND";

	/**
	 * DISCOUNT_REF_ID
	 */
	public static final String DISCOUNT_REF_ID = "discountRefId";

	/**
	 * REGION_CD
	 */
	public static final String REGION_CD = "regionCd";

	/**
	 * FMR_IND
	 */
	public static final String FMR_IND = "fmrInd";

	/**
	 * RATE_PLAN_ID
	 */
	public static final String RATE_PLAN_ID = "ratePlanId";
	/**
	 * PSOC RATE_PLAN_ID
	 */
	public static final String PSOC_RATE_PLAN_ID = "psocRatePlanId";

	/**
	 * AUTHORITY_LEVEL_ID
	 */
	public static final String AUTHORITY_LEVEL_ID = "authorityLevelId";

	/**
	 * TERM
	 */
	public static final String TERM = "term";
	
	/**
	 * SERVICECOVERAGETYPE
	 */
	public static final String SERVICE_COVERAGE_TYPE = "serviceCoverageType";
	
	/**
	 * TERM
	 */
	public static final String FMR_REF_ID = "fmrRefId";

	/**
	 * MARC
	 */
	public static final String MARC = "marc";

	/**
	 * COUNTRY_CODE
	 */
	public static final String COUNTRY_CODE = "countryCd";

	/**
	 * TERM_CHANGE
	 */
	public static final String TERM_CHANGE = "TermChg";

	/**
	 * MARC_CHANGE
	 */
	public static final String MARC_CHANGE = "MARCChg";

	/**
	 * FA_CHANGE
	 */
	public static final String FA_CHANGE = "FAChg";

	/**
	 * SOC_CHANGE
	 */
	public static final String SOC_CHANGE = "SOCChg";

	/**
	 * NEW
	 */
	public static final String NEW = "new";

	/**
	 * DESIGN_CHANGE
	 */
	public static final String CHANGE = "change";

	/**
	 * TDM_DISCOUNTS
	 */
	public static final String TDM_DISCS = "getTDMDiscs";

	public static final String GET_SUB_GROUP = "getsbgrps";

	/**
	 * YES
	 */
	public static final String YES = "Y";

	public static final String NO = "N";

	/**
	 * NO
	 */
	public static final String SEGMENT_GROUP = "segmentGroup";

	public static final String MMDDYYYY = "mm/dd/YYYY";
	/**
	 * ADD_DISC_FEAT
	 */
	public static final String GET_ADD_DISC_FEAT = "getAdtlFtrs";
	/**
	 * DESIGN_ELEMENT_INTEGRATED_ACCESS
	 */
	public static final String DESIGN_ELEMENT_INTEGRATED_ACCESS = "ACCESS";
	/**
	 * DESIGN_ELEMENT_Y
	 */
	public static final String DESIGN_ELEMENT_Y = "Y";
	/**
	 * PRODUCT_TYPE_AVPN_EXPRESS
	 */
	public static final String PRODUCT_TYPE_AVPN_EXPRESS = "AVPN_EXPRESS";

	/**
	 * xlsx
	 */
	public static final String XLSX = ".xlsx";

	public static final String WORKING = "Working";

	public static final String PROMOTE = "Promote";
	/**
	 * SLACE
	 */
	public static final String SLACE = "\\";
	/**
	 * ACTIVE.
	 */
	public static final String ACTIVE = "Active";

	/**
	 * WORKING.
	 */
	public static final String STAGING = "Staging";

	/**
	 * ARCHIVE.
	 */
	public static final String ARCHIVE = "Archive";

	/**
	 * MF000
	 */

	public static final String MF000 = "fileNotFound";
	/**
	 * Y
	 */

	public static final String Y = "Y";

	/**
	 * N
	 */

	public static final String N = "N";

	/**
	 * Contract Country Tab
	 */
	public static final String COUNTRY_PAGE_LOAD = "countrypageLd";

	/**
	 * US_COUNTRY
	 */
	public static final String US_COUNTRY = "US";
	/**
	 * VNIC_COMPNENT
	 */
	public static final String VNIC_COMPNENT = "ALL VNIC COMPONENTS";

	public static final String NEW_STATUS = "10";

	public static final String VNIC_CAT = "VPN Transport";

	public static final String VNIC_SUB_CAT = "Connection";

	/**
	 * SubGroups
	 */
	public static final String SUBGROUP_ADD = "SGAdd";

	public static final String ADD_SUB_GROUP = "AddSubGrp";

	public static final String REM_SUB_GROUP = "RemSubGrp";

	public static final String COPY_SUB_GROUP = "CpySubGrp";

	public static final String UPDATE_SUB_GROUP = "updateSubGroup";

	public static final String GBP_BILLER = "GBP";

	public static final String GBP_IND = "gbpInd";

	public static final String DISCOUNT_ID = "discountId";

	public static final String SET_INV_DISC = "setInvDisc";

	public static final String INV_STATUS = "30";

	public static final String MACD = "MACD";

	public static final String REPLACE = "REPLACE";
	public static final String US_ACCESS = "US ACCESS";

	public static final String SET_INV_DESIGN = "SetInvDesign";
	public static final String INTEGRATED_ACCESS = "Integrated Access";

	/**
	 * used in DAO
	 */
	public static final String DEAL_CD = "dealCd";
	public static final String GROUP_NAME = "groupName";

	public static final String USER_ID = "userId";

	public static final String DISCOUNT_SUB_CATEGORY = "discountSubCategory";

	public static final String DISCOUNT_CATEGORY = "discountCategory";

	public static final String SUB_GROUP_ID = "subGroupId";

	public static final String OFFER_CD = "offerCd";

	public static final String ZONE_PARENT_CAT = "zoneParentCategory";

	public static final String DISC_DESCRIPITON = "discountDescription";

	public static final String BEID = "beid";

	public static final String INITIAL_DISC = "initialDiscount";

	public static final String MAX_DISCOUNT = "maxDiscount";

	public static final String CAT_DESC = "catDescription";

	public static final String SUB_CAT_DESC = "subcatDescription";

	public static final String RECURRENCE_ID = "recurrenceId";

	public static final String DISCOUNT_TYPE_ID = "discountTypeId";

	public static final String EXT_SYS_DISCOUNT_ID = "extSysDiscountId";

	public static final String PSOC_RATE_ID = "psocRateId";

	public static final String ATTUID = "ATTUID";

	public static final String DROOLS_FILE_WORKING = "file.upload.working";

	public static final String PRODUCT = "PRODUCT";

	public static final String DROOLS_FILE_ACTIVE = "drools.file.active";

	public static final String DROOLS_FILE_ARCHIVE = "drools.file.archive";

	public static final String FAIL_TO_CREATE_DIRECTORY = "SERVICE LOG :: FAIL TO CREATE DIRECTORY";

	public static final String ACTIVATE = "Activate";

	public static final String V = "V";

	public static final String UNDERSCORE = "_";

	public static final String DROOLS_RULE_TYPE = "droolsRuleType";

	public static final String XLS = ".xls";

	public static final String DROOLS = "DROOLS";

	public static final String CONTENT_DISPOSITION = "Content-Disposition";
	public static final String SEMICOLON = ";";

	public static final String FILE_NAME = "filename";

	public static final String EQUAL = "=";

	public static final String USERID = "userId";

	public static final String UPLOAD = "UPLOAD";

	public static final String ACTIVATEROLLBACK = "ACTIVATEROLLBACK";

	public static final String CONTENT_TYPE_JSON = "application/json";

	public static final String KEY_OFFER = "offer";

	public static final String REQ_OFFER = "AVPN";

	public static final String REST_CLIENT_ENVIRONMENT = "ddm_mscall_env";
	public static final String REST_CLIENT_LATITUDE = "ddm_mscall_latitude";
	public static final String REST_CLIENT_LONGITUDE = "ddm_mscall_longitude";
	public static final String REST_CLIENT_METHOD = "ddm_mscall_method";
	public static final String REST_CLIENT_USERID = "ddm_mscall_userid";
	public static final String REST_CLIENT_ENVPD = "ddm_mscall_envpd";
	public static final String REST_CLIENT_SUBCONTEXT = "ddm_mscall_subcontext";
	public static final String REQUEST_ENDPOINT = "mS_DME2EndPoint_PDDM";
	public static final String REST_CLIENT_GETPATH = "ddm_mscall_getpath";
	public static final String REST_CLIENT_PUTPATH = "ddm_mscall_putpath";
	public static final String REST_CLIENT_ACTIVATEROLLBACKURL = "ddm_mscall_activaterollbackurl";
	public static final String REST_CLIENT_AUDITLOGURL = "ddm_mscall_auditlogurl";
	public static final String UPLOAD_USERID = "ddm_mscall_putpathuserid";

	public static final String MS_NAME = "DiscountDataManagement";

	public static final String REQ_CLIENT_NAME = "022";

	public static final String DROOLS_RULES_TYPE = "droolsRulesType";

	public static final String FILE_VERSION = "fileVersion";

	public static final String FILENAME = "fileName";

	public static final String CORRELATION_ID = "correlationId";

	public static final String APPLICATION_OCTET_STREAM = "application/octet-stream";

	public static final String ATTACHMENT = "attachment; filename=";

	public static final String ROLLBACK = "Rollback";

	public static final String ACTIVATED = "Activated";

	public static final String UPLOADED = "Uploaded";

	public static final String ARCHIVED = "Archived";

	public static final String EMPTY_STRING = "";

	public static final String EXCEPTION_OCCURRED = "Exception Occurred : {}";

	public static final String EXTERNAL_MS_EXCEPTION = "Exception Occured During Call to droolsRefData API : {}";

	public static final String ACTIVATE_FAILED = "File activation failed. Please activate the file again";

	public static final String ROLLBACK_FAILED = "File rollback failed. Please rollback the file again";

	public static final String ACTIVATE_ROLLBACK_ERROR = "activationRollbackError";

	public static final String ERROR_MESSAGES = "errorMessages";

	public static final String PRICE = "Price";

	public static final String SUBCATEXTSYSDISCOUNTID = "subcatExtSysDiscountId";

	/**
	 * Gets the discount catalog.
	 *
	 * @return the discount catalog
	 */
	public static final List<String> getDiscountCatalog() {
		List<String> discountCatalog = new ArrayList<>();

		discountCatalog.add("Discount.txt");
		discountCatalog.add("Discount2DiscountRangeName.txt");
		discountCatalog.add("DiscountChild.txt");
		discountCatalog.add("DiscountRangeMatrix.txt");
		discountCatalog.add("DiscountRangeName.txt");
		discountCatalog.add("PricePlan2Discount.txt");
		discountCatalog.add("Rate2Discount.txt");
		discountCatalog.add("PUBLISHING_EVENT.txt");
		discountCatalog.add("PUBLISHING_EVENT_COUNT.txt");

		return discountCatalog;
	}

	public static final String PUB_EVENT_ID = "PUB_EVENT_ID";

	public static final String PUBLISHING_EVENT_COUNT = "PUBLISHING_EVENT_COUNT";

	public static final String PUBLISHING_EVENT = "PUBLISHING_EVENT";

	public static final String PV_DIRECTORY = "pv.directory.processed";

	public static final String VALIDATE_FEATURES_FOR_ATTUID = "validateFeaturesForAttuid";

	public static final String PARENT_DISCOUNT_ID = "parentDiscountId";

	public static final String HSIA = "HSIA-E";

	public static final String NEW_START = "NS";

	public static final String MISPNT = "MISPNT";

	public static final String MIS_SUBCATS = "MISSubcats";

	public static final String KAFKA_SERVER = "KAFKA_SERVER";

	public static final String CONSUMER_TOPIC_NAME = "sales_topic";

	public static final String MOU_MISPNT = "MOU_MISPNT";
	public static final String PUBLISHER_TOPIC_NAME = "PUBLISHER_TOPIC_NAME";

	public static final String MOU_NETBOUND = "MOU_NETBOND";

	public static final String MOU_AVPN = "MOU_AVPN";

	public static final String MOW_MISPNT = "MOW_MISPNT";

	public static final String MOW_NETBOUND = "MOW_NETBOND";

	public static final String MOW_AVPN = "MOW_AVPN";

	public static final String SERVICE = "service";

	public static final String MAIL = "mail";

	public static final String ADOPT = "ADOPT";

	public static final String KEY_CONTENT_TYPE = "Content-Type";

	public static final String DISCOUNT_RULES = "DISCOUNTRULES";
	public static final String REGION_ID = "regionId";

	public static final String AVPN_CONTRACT="AVPN_CONTRACT_ONLY";
	public static final String MIS_CONTRACT_ONLY = "MIS_CONTRACT_ONLY";
	
	public static final String PRICE_FREQUENCY = "PRICE_FREQUENCY";
	
	public static final String FILE_DB_DOWNLOAD = "file.db.download";

	public static final String MIS_ONSITE_INSTALLATION = "MIS On-Site Installation";

	public static final String MIS_TELE_INSTALLATION = "MIS Tele Installation";

	public static final String AK_MISPNT = "AK_MISPNT";

	public static final String BIB_ELEMENTS = "BIBElements";

	public static final String BIB_CLASS_OF_SERVICE_BVOIP = "24225";
	
	public static final String OLD_TO_NEW_EXTDISCID = "oldToNewExtDiscId";

	public static final String G_ETHERNET = "10G_ETHERNET";

	public static final String MISPNT_VI_PR = "MISPNT_VI_PR";

	public static final String GET_DROOLS_RULE="getDroolsRule";

	public static final String ISB = "ISB";
	
	public static final String BEID_TO_DISCOUNT_FROM_DROOLS="beidToDiscountFromDrools";
	
	public static final String MISDISCOUNTRULES="misDiscountRules";
	
	public static final String BEIDFORVIPR="beidforVIPR";
}
