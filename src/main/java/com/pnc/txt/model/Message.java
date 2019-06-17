package com.pnc.txt.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlRootElement(name = "message")
public class Message implements Serializable {

	/**
	 * Default SerialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new message.
	 *
	 * @param code
	 *            the code
	 * @param description
	 *            the description
	 * @param detailedDescription
	 *            the detailed description
	 * @inheritDoc constructor.
	 */
	public Message(String code, String description, String detailedDescription) {
		super();
		this.code = code;
		this.description = description;
		this.detailedDescription = detailedDescription;
	}

	/**
	 * Instantiates a new message.
	 *
	 * @inheritDoc Default constructor.
	 */
	public Message() {
		super();
	}

	/** The code. */
	private String code;

	/** The description. */
	private String description;

	/** The detailed description. */
	private String detailedDescription;

	/**
	 * Gets the code.
	 *
	 * @return the code.
	 */
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlElement(name = "code")
	public String getCode() {
		return this.code;
	}

	/**
	 * Sets the code.
	 *
	 * @param code
	 *            the code to set.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description.
	 */
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlElement(name = "description")
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description
	 *            the description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the detailed description.
	 *
	 * @return the detailedDescription.
	 */
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlElement(name = "detailedDescription")
	public String getDetailedDescription() {
		return this.detailedDescription;
	}

	/**
	 * Sets the detailed description.
	 *
	 * @param detailedDescription
	 *            the detailedDescription to set.
	 */
	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Message [" + (this.code == null ? "" : "code=" + this.code + ", ")
				+ (this.description == null ? "" : "description=" + this.description + ",")
				+ (this.detailedDescription == null ? "" : "detailedDescription=" + this.detailedDescription + ",")
				+ "]";
	}
}
