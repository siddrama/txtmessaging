/**
 * Added by Lijo Manickathan John
  */
package com.pnc.txt.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * @author Lijo Manickathan John
 *
 */
@XmlRootElement(name = "MESSAGES")
public final class Messages {

	/**
	 * Instantiates a new messages.
	 *
	 * @inheritDoc Default constructor.
	 */
	public Messages() {
		super();
	}

	/**
	 * Instantiates a new messages.
	 *
	 * @param messagesList
	 *            .
	 */
	public Messages(List<Message> messagesList) {
		super();
		this.messagesList = messagesList;
	}

	/** The messages list. */
	private List<Message> messagesList;

	/**
	 * Gets the messages list.
	 *
	 * @return the messagesList.
	 */
	@XmlElement(name = "message")
	public List<Message> getMessagesList() {
		return this.messagesList;
	}

	/**
	 * Sets the messages list.
	 *
	 * @param messagesList
	 *            the messagesList to set.
	 */
	public void setMessagesList(List<Message> messagesList) {
		this.messagesList = messagesList;
	}
}