/**
 * Added by Lijo Manickathan John
  */
package com.pnc.txt.model;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author Lijo Manickathan John
 *
 */
public class ServiceMetaData {

	private static final InheritableThreadLocal<Map<String, Object>> REQ_META_DATA = new InheritableThreadLocal<Map<String, Object>>();

	

	private ServiceMetaData() {

	}

	/**
	 * Get request meta data
	 * 
	 * @return the Map
	 */

	public static Map<String, Object> getRequestMetaData() {
		return REQ_META_DATA.get();
	}

	/**
	 * Sets thread local
	 * 
	 * @return the request meta data
	 */

	public static InheritableThreadLocal<Map<String, Object>> getThreadLocal() {
		return REQ_META_DATA;
	}

	@Deprecated
	/**
	 * @deprecated ( As of msframework release 2.1.0, replaced by ServiceMataData.add method})
	 */
		
	public static synchronized void init(String offer,String version,String method,String uri) {
		
		Map requestMetaDataHash = new HashMap();
		requestMetaDataHash.put(ServiceMetaData.OFFER, offer);
		requestMetaDataHash.put(ServiceMetaData.VERSION, version);
		requestMetaDataHash.put(ServiceMetaData.METHOD, method);
		requestMetaDataHash.put(ServiceMetaData.URI, uri);
			
	}
	
	
	/**
	 * Stores the input in ThreadLocal.
	 * It gets the old Meta Data information and adds to the current context
	 * 
	 * 
	 */

	public static synchronized void add(Map<String, Object> requestParams) {

		
		Map<String, Object> requestMetaDataHash = new HashMap();
		
		Map<String,Object> oldMetaData=ServiceMetaData.getRequestMetaData();
		if(oldMetaData!=null) {
		
			oldMetaData.forEach((k,v)-> 
			
			requestMetaDataHash.put(k, v)
			
		);
		}
		
		requestParams.forEach((k, v) -> 
			requestMetaDataHash.put(k, v)
		);
		
		
				

		REQ_META_DATA.set(requestMetaDataHash);

	}

	/**
	 * Gets the request start time
	 * 
	 * @return the request start time
	 */
	public static Long getRequestStartTime() {
		
		
		if(REQ_META_DATA.get()!=null && REQ_META_DATA.get().get(REQUEST_START_TIME)!=null) {
		
			return (Long) REQ_META_DATA.get().get(REQUEST_START_TIME);
		}
		return null;
	}

	/**
	 * Gets the elapsed time
	 * 
	 * @return the elapsed time
	 */
	public static Long getElapsedTime() {
		if( REQ_META_DATA.get()!=null &&  REQ_META_DATA.get().get(REQUEST_START_TIME)!=null) {
		return System.currentTimeMillis() - (Long) REQ_META_DATA.get().get(REQUEST_START_TIME);
		}
		return null;
		
	}

	/**
	 * Gets the key from meta data
	 * 
	 * @return the key
	 */
	private static String getStringFromHash(String key) {
		return (String) REQ_META_DATA.get().get(key);
		
		
	}

	public static final String SERVICEID = "SERVICEID";
	public static final String OFFER = "OFFER";
	public static final String VERSION = "VERSION";
	public static final String METHOD = "METHOD";
	public static final String URI = "URI";
	public static final String REQ_ID = "REQ_ID";
	public static final String REQUEST_START_TIME = "REQUEST_START_TIME";
	public static final String XATTMESSAGEID = "X-ATT-MessageId";
	public static final String XATTCORRELATIONID = "X-ATT-CorrelationId";
	public static final String XATTCONVERSATIONID = "X-ATTConversationId";
	public static final String XATTTRANSACTIONID = "X-ATT-TransactionId";
	public static final String XATTCLIENTID = "X-ATT-ClientId";
	public static final String XATTRETURNURL = "X-ATT-ReturnURL";
	public static final String ALL = "ALL";
	public static final String SERVICE_FILTER = "SERVICE_FILTER";
	public static final String FAILOVER_DONE="FAILOVER_DONE";
	public static final String XATTTraceId = "x-traceid";
	public static final String XATTSpanId = "x-spanid";
	public static final String XATTSpanName = "x-spanname";
	public static final String RESTURI = "RESTURI";
	public static final String MS_REQUEST_START_TIME="MS_REQUEST_START_TIME";
	public static final String CURRENT_SPAN="CURRENT_SPAN";
	public static final String CURRENT_TRACE="CURRENT_TRACE";
	public static final String CURRENT_SPAN_NAME="CURRENT_SPAN_NAME";
	public static final String SPAN_HOST_NAME="SPAN_HOST_NAME";
	
	public static final String THREAD_ID="threadId";
	
	public static final String host="host";

}
