/**
 * Added by Lijo Manickathan John
  */
package com.pnc.txt.model;

/**
 * @author Lijo Manickathan John
 *
 */
public abstract class ServiceRequest {


	/** The request id. */
	private String transactionId = "";

	/** The brand. */
	private String offer = "";

	/** The version. */
	private String version = "";


	/**
	 * Instantiates a new service request.
	 *
	 * @inheritDoc ServiceRequest.
	 */
	public ServiceRequest() {
		this.transactionId =(String) ServiceMetaData.getRequestMetaData().get("X-ATT-TransactionId");
	}

	/**
	 * Instantiates a new service request.
	 *
	 * @param offer
	 *            brand for which service is received
	 * @param xVersion
	 *            version of the service for which request is received
	 * @inheritDoc constructor.
	 */
	public ServiceRequest(String offer, String xVersion) {
		this.offer = offer;
	    this.version = xVersion;
		this.transactionId = (String) ServiceMetaData.getRequestMetaData().get("X-ATT-TransactionId");
	}

	
	/**
	 * Gets the request id.
	 *
	 * @return the request id
	 * @inheritDoc getRequestId.
	 */
	public final String getTransactionId() {
		return this.transactionId;
	}

	/**
	 * Sets the request id.
	 *
	 * @param requestId
	 *            the new request id
	 * @inheritDoc setRequestId.
	 */
	public final void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * Gets the brand.
	 *
	 * @return the brand
	 * @inheritDoc getBrand.
	 */
	public final String getOffer() {
		return this.offer;
	}

	/**
	 * Sets the offer.
	 *
	 * @param offer
	 *            the new offer
	 * @inheritDoc getOffer.
	 */
	public final void setOffer(String offer) {
		this.offer = offer;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 * @inheritDoc getVersion.
	 */
	public final String getVersion() {
		return this.version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version
	 *            the new version
	 * @inheritDoc setVersion.
	 */
	public final void setVersion(String version) {
		this.version = version;
	}

	
		
	
	/**
	 * Constructs a <code>String</code> with all attributes in name = value
	 * format.
	 * 
	 * @return a <code>String</code> representation of this object.
	 */
	@Override
	public String toString() {
		String tab = "    ";

		return "ServiceRequest ( " + super.toString() + tab + "transactionId = "
				+ this.transactionId + tab + "brand = " + this.offer + tab
				+ "version = " + this.version + tab
				+ ")";

	}
}
