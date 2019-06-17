/**
 * Added by Lijo Manickathan John
  */
package com.pnc.txt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Lijo Manickathan John
 *
 */
@XmlRootElement(name = "sales-service")
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesService {

	@XmlAttribute(name = "id", required = true)
	private String id;

	/** The service name. */
	@XmlElement(name = "serviceName")
	private String serviceName;

	/** The service. */
	@XmlElement(name = "serviceImpl")
	private String service;

	@XmlElement(name = "serviceMethod")
	private String serviceMethod;


	/**
	 * Gets the service method
	 * 
	 * @return the servicemethod
	 */
	
	public String getServiceMethod() {
		return serviceMethod;
	}


	/**
	 * Sets the servicemethod
	 * 
	 * @return void
	 */
	public void setServiceMethod(String serviceMethod) {
		this.serviceMethod = serviceMethod;
	}


	/**
	 * constructs sales service
	 * 
	
	 */
	public SalesService() {
		super();
	}


	/**
	 * Construct the Sales service.
	 * 
.
	 */
	public SalesService(String serviceName, String serviceImpl) {
		super();
		this.serviceName = serviceName;
		this.service = serviceImpl;
	}


	/**
	 * Gets id
	 * 
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	

	/**
	 * Sets the id
	 * 
	 * @return void
	 */

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the service name.
	 * 
	 * @return the serviceName.
	 */
	public final String getServiceName() {
		return this.serviceName;
	}

	/**
	 * Sets the service name.
	 * 
	 * @param serviceName
	 *            the serviceName to set.
	 */
	public final void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * Gets the service.
	 * 
	 * @return the serviceImpl.
	 */
	public final String getService() {
		return this.service;
	}

	/**
	 * Sets the service.
	 * 
	 * @param serviceImpl
	 *            the serviceImpl to set.
	 */
	public final void setService(String serviceImpl) {
		this.service = serviceImpl;
	}

}
