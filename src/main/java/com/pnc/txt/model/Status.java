/**
 * Added by Lijo Manickathan John
  */
package com.pnc.txt.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Lijo Manickathan John
 *
 */

public class Status implements Serializable{
	
	/**
	 * Default SerialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new status.
	 *
	 * @param code
	 *            the code
	 * @param messages
	 *            the messages
	 * @inheritDoc constructor.
	 */
	public Status(String code, List<Message> messages) {
		super();
		this.code = code;
		this.messages = messages;
	}

	/**
	 * Instantiates a new status.
	 *
	 * @inheritDoc Default constructor.
	 */
	public Status() {
		super();
	}

	/** The code. */
	private String code;

	/** The messages. */
	private List<Message> messages;

	/**
	 * Gets the code.
	 *\
	 * @return the code.
	 */
	public final String getCode() {
		return this.code;
	}

	/**
	 * Sets the code.
	 *
	 * @param code
	 *            the code to set.
	 */
	public final void setCode(String code) {
		this.code = code;
	}

	/**
	 * Gets the messages.
	 *
	 * @return the messages.
	 */
	public final List<Message> getMessages() {
		return this.messages;
	}

	/**
	 * Sets the messages.
	 *
	 * @param messages
	 *            the messages to set.
	 */
	public final void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Status [code=" + this.code + ", messages=" + this.messages + "]";
	}

}
