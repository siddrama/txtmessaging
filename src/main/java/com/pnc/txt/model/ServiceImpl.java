/**
 * Added by Lijo Manickathan John
  */
package com.pnc.txt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Lijo Manickathan John
 *
 */
@XmlRootElement(name = "service")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServiceImpl {

	/** The service name. */
	@XmlElement(name = "serviceName")
	private String serviceName;

	/** The service. */
	@XmlElement(name = "serviceImpl")
	private String service;

	/**
	 * Instantiates a new service impl.
	 */
	public ServiceImpl() {
		super();
	}

	/**
	 * Instantiates a new service impl.
	 *
	 * @param serviceName
	 *            the service name
	 * @param serviceImpl
	 *            the service impl
	 * @inheritDoc constructor.
	 */
	public ServiceImpl(String serviceName, String serviceImpl) {
		super();
		this.serviceName = serviceName;
		this.service = serviceImpl;
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