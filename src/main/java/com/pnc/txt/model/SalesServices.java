/**
 * Added by Lijo Manickathan John
  */
package com.pnc.txt.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Lijo Manickathan John
 *
 */
@XmlRootElement(name = "sales-services")
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesServices {

	/** The provider. */
	@XmlElement(name = "provider")
	private String provider;

	/** The service name. */
	@XmlElement(name = "serviceName")
	private String serviceName;

	/** The service. */
	@XmlElement(name = "service")
	private List<ServiceImpl> serviceImpl;

	/** The service. */
	@XmlElement(name = "sales-service")
	private List<SalesService> service;

	/**
	 * Instantiates a new service impls.
	 */
	public SalesServices() {
		super();
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * Instantiates a new service impls.
	 * 
	 * @param service
	 *            .
	 */
	public SalesServices(List<SalesService> service) {
		super();
		this.service = service;
	}

	/**
	 * Gets the service.
	 * 
	 * @return the service.
	 */
	public List<SalesService> getService() {
		return this.service;
	}

	/**
	 * Sets the service.
	 * 
	 * @param service
	 *            the service to set.
	 */
	public void setService(List<SalesService> service) {
		this.service = service;
	}

	public List<ServiceImpl> getServiceImpl() {
		return serviceImpl;
	}

	public void setServiceImpl(List<ServiceImpl> serviceImpl) {
		this.serviceImpl = serviceImpl;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	/**
	 * Gets the service impl map.
	 * 
	 * @return the service impl map
	 */
	public Map<String, String> getSalesServiceMap() {
		Map<String, String> svcImplMap = new HashMap<String, String>();

		if (this.service != null) {
			for (SalesService impl : this.service) {

				svcImplMap.put(impl.getServiceName(), impl.getService());
			}

		}
		return svcImplMap;
	}

	public Map<String, ServiceBean> getServiceHandle() {
		Map<String, ServiceBean> serviceHandleMap = new HashMap<String, ServiceBean>();

		if (this.service != null) {
			for (SalesService impl : this.service) {

				ServiceBean handle = new ServiceBean(impl.getService(), impl.getServiceMethod());
				serviceHandleMap.put(impl.getId(), handle);
			}

		}
		return serviceHandleMap;
	}

	/**
	 * Gets the service impl map.
	 * 
	 * @return the service impl map
	 */
	public Map<String, String> getServiceImplMap() {
		Map<String, String> svcImplMap = new HashMap<String, String>();

		if (this.serviceImpl != null) {
			for (ServiceImpl impl : this.serviceImpl) {

				svcImplMap.put(impl.getServiceName(), impl.getService());
			}

		}
		return svcImplMap;
	}

}
