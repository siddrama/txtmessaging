package com.pnc.txt.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.Form;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorException;
import org.apache.commons.validator.ValidatorResources;
import org.apache.commons.validator.ValidatorResult;
import org.apache.commons.validator.ValidatorResults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import com.pnc.txt.model.Message;
import com.pnc.txt.model.Status;
import com.pnc.txt.model.FrameworkConstants;
import com.pnc.txt.model.HttpErrorCodes;
import com.pnc.txt.util.MessageResourcesUtil;

/**
 * @author Lijo Manickathan John
 *
 */

public class ValidationUtil {

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(ValidationUtil.class);

	/** The validator resources. */
	private static Map<String, ValidatorResources> validatorResources;

	/**
	 * Gets the validator resources.
	 *
	 * @return the validator resources
	 */
	public static Map<String, ValidatorResources> getValidatorResources() {
		return validatorResources;
	}

	/**
	 * Sets the validator resources.
	 *
	 * @param validatorResources
	 *            .
	 */
	public static void setValidatorResources(Map<String, ValidatorResources> validatorResources) {
		ValidationUtil.validatorResources = validatorResources;
	}

	/**
	 * Initialize validations.
	 *
	 * @param isInputStream
	 *            the is input stream
	 * @param offer
	 *            the offer
	 */
	public static void initializeValidations(InputStream isInputStream, String offer) {
		Map<String, ValidatorResources> validatorMap = new HashMap();
		try {
			ValidatorResources resources = new ValidatorResources(isInputStream);
			if (validatorResources == null) {
				validatorMap.put(offer, resources);
				setValidatorResources(validatorMap);
			} else {
				validatorResources.put(offer, resources);
			}
		} catch (IOException ioExp) {
			LOG.error("IOException:", ioExp);
		} catch (SAXException saxExp) {
			LOG.error("SAXExceptionl", saxExp);
		}
	}

	/**
	 * Gets the validated error status messages.
	 *
	 * @param beanObj
	 *            the bean obj
	 * @param service
	 *            the service
	 * @return the validated error status messages
	 * @inheritDoc method to validate the input request object with validation rules
	 *             in xml file and return the status.
	 */
	public Status validateRequest(Object beanObj, String service,String validationFilter) {

		Status status = new Status();
		status.setCode(HttpErrorCodes.STATUS_OK.toString());

		Map<String, Message> messageMappings = MessageResourcesUtil.getInstance().getMessageMapping();

		ValidatorResults results = null;
		List<Message> errMessages = new ArrayList();
		try {
			
			ValidatorResources validatorResoruces = validatorResources.get(validationFilter);
			Validator validator = new Validator(validatorResoruces, service);

			validator.setParameter(Validator.BEAN_PARAM, beanObj);
			validator.setOnlyReturnErrors(true);
			results = validator.validate();
			Form form = validatorResoruces.getForm(Locale.getDefault(), service);
			Iterator propertyNames = results.getPropertyNames().iterator();
			while (propertyNames.hasNext()) {
				String propertyName = (String) propertyNames.next();
				Field field = form.getField(propertyName);
				ValidatorResult result = results.getValidatorResult(propertyName);
				Iterator actionNames = result.getActions();
				String messagekey;
				while (actionNames.hasNext()) {
					String actionName = (String) actionNames.next();
					messagekey = field.getMsg(propertyName);
					if (!result.isValid(actionName)) {
						Message errMessage = messageMappings.get(messagekey);
						if (LOG.isDebugEnabled()) {
							LOG.debug("message key>>>" + messagekey + "ErrMessage " + errMessage.toString());
						}
						errMessages.add(errMessage);
					}
				}
			}

			if (!errMessages.isEmpty()) {
				status.setMessages(errMessages);
				status.setCode(HttpErrorCodes.ERROR.toString());
			} else {
				Message successMessage = messageMappings.get(FrameworkConstants.REQUEST_COMPLETED_SUCCESSFULLY);
				List<Message> successMessages = new ArrayList();
				successMessages.add(successMessage);
				status.setMessages(successMessages);
				status.setCode(HttpErrorCodes.STATUS_OK.toString());
			}

		} catch (ValidatorException validatorExp) {
			
			status.setMessages(errMessages);
			status.setCode(HttpErrorCodes.SERVER_ERROR.toString());
			LOG.error("ValidatorException::", validatorExp);
		}

		return status;
	}

	

}
