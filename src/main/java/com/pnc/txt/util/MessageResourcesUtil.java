package com.pnc.txt.util;
import java.io.InputStream;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pnc.txt.model.Message;
import com.pnc.txt.model.Messages;




public final class MessageResourcesUtil {

	/**
	 * The Constant LOG.
	 *
	 * @inheritDoc Logger.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(MessageResourcesUtil.class);

	/**
	 * Instantiates a new message resources util.
	 *
	 * @inheritDoc Default constructor.
	 */
	private MessageResourcesUtil() {
		if(LOG.isDebugEnabled()){
		LOG.debug("MessageResourcesUtil:constructor");
		}
	}

	/** The message util. */
	private static MessageResourcesUtil messageUtil;

	/**
	 * Gets the message util.
	 *
	 * @return the messageUtil.
	 */
	public static MessageResourcesUtil getMessageUtil() {
		return messageUtil;
	}

	/**
	 * Sets the message util.
	 *
	 * @param messageUtil
	 *            the messageUtil to set.
	 */
	public static void setMessageUtil(MessageResourcesUtil messageUtil) {
		MessageResourcesUtil.messageUtil = messageUtil;
	}

	/** The message mapping. */
	private static Map<String, Message> messageMapping = new HashMap();

	/**
	 * Gets the message mapping.
	 *
	 * @return messageMapping.
	 */
	public static Map<String, Message> getMessageMapping() {
		return messageMapping;
	}

	/**
	 * Sets the message mapping.
	 *
	 * @param messageMapping
	 *            the messageMapping to set.
	 */
	public static void setMessageMapping(Map<String, Message> messageMapping) {
		MessageResourcesUtil.messageMapping = messageMapping;
	}

	/**
	 * Gets the single instance of MessageResourcesUtil.
	 *
	 * @return single instance of MessageResourcesUtil
	 * @inheritDoc Get instance.
	 */
	public static MessageResourcesUtil getInstance() {
		synchronized (MessageResourcesUtil.class) {
			if (messageUtil == null) {
				messageUtil = new MessageResourcesUtil();
			}
		}
		return messageUtil;
	}

	/**
	 * method to initialize messages.
	 *
	 * @param isInputStream
	 *            the is input stream
	 */
	public static void initializeMessages(InputStream isInputStream) {
		try {
			Map<String, Message> messageMapping = new HashMap<String, Message>();
			JAXBContext context;
			context = JAXBContext.newInstance(Messages.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Messages messages = (Messages) unmarshaller.unmarshal(isInputStream);
			List<Message> messagesList = messages.getMessagesList();
			for (Message message : messagesList) {
				messageMapping.put(message.getCode(), message);
			}
			setMessageMapping(messageMapping);
		} catch (JAXBException jaxbExp) {
			LOG.error("JAXBException in MessageResourcesUtil", jaxbExp);
		}
	}

}
