/**
 * Added by Lijo Manickathan John
  */
package com.pnc.txt.model;

/**
 * @author Lijo Manickathan John
 *
 */
public class ServiceBean {

	private String id;

	private String serviceImpl;

	private String serviceMethod;

	/**
	 * Initializes the servicebean constructor
	 * 
	 * @return the serviceName.
	 */
	public ServiceBean() {

	}

	/**
	 * Initializes the servicebean constructor
	 * 
	 * @return the serviceName.
	 */
	public ServiceBean(String serviceImpl, String serviceMethod) {

		this.serviceImpl = serviceImpl;
		this.serviceMethod = serviceMethod;
	}

	/**
	 * Initializes the servicebean constructor
	 * 
	 * @return the serviceName.
	 */
	public String getServiceImpl() {
		return serviceImpl;
	}
	/**
	 * Sets serviceImpl
	 * Param serviceImpl
	 * @return void
	 */
	public void setServiceImpl(String serviceImpl) {
		this.serviceImpl = serviceImpl;
	}
	
	/**
	 * Get service method
	 * 
	 * @return the serviceName.
	 */

	public String getServiceMethod() {
		return serviceMethod;
	}

	/**
	 * Sets servicemethod
	 * 
	 * @return void
	 */
	public void setServiceMethod(String serviceMethod) {
		this.serviceMethod = serviceMethod;
	}

	/**
	 * Get id
	 * 
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 *Sets Id
	 * 
	 * @return the serviceName.
	 */
	public void setId(String id) {
		this.id = id;
	}

}
