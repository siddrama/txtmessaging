package com.pnc.txt.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pnc.txt.model.MessageConstants;
//import com.att.pricerd.discountmanagement.dao.DiscountManagementDao;
import com.pnc.txt.bean.TxtRequestData;
import com.pnc.txt.bean.TxtResponseData;
//import com.att.pricerd.discountmanagement.model.SalesDiscountsThreshold;
//import com.att.pricerd.discountmanagement.processors.AbstractActivityProcessor;
//import com.att.pricerd.discountmanagement.util.DiscountManagementUtil;
//import com.att.pricerd.discountmanagement.vo.DiscountDetailsResponseVo;
//import com.att.pricerd.discountmanagement.vo.OfferDetailsVo;
//import com.att.pricerd.discountmanagement.vo.PricePlanDetailsVo;
//import com.att.pricerd.discountmanagement.vo.PricePlanResponseVo;
//import com.att.pricerd.discountmanagement.vo.SocDetailVo;
import com.pnc.txt.exception.SalesBusinessException;
import com.pnc.txt.model.Status;
import com.pnc.txt.model.StringConstants;
import com.pnc.txt.processor.SendMessageProcessor;
//import com.att.sales.framework.service.BaseServiceImpl;

@Service("DiscountManagementServiceImpl")
@Transactional
public class TxtManagementServiceImpl extends  BaseServiceImpl implements TxtManagementService {

	private static final Logger log = LoggerFactory.getLogger(TxtManagementServiceImpl.class);

	/**
	 * Autowiring the DiscountManagementDao
	 */
	@Autowired
	private SendMessageProcessor sendMessageProcessor;

//	@Autowired
//	private ApplicationContext appContext;

//	@Autowired
//	private DiscountManagementUtil discountManagementUtil;

	/**
	 * Based on the supplied input parameters such as offerCd, fMRInd, regioncode,
	 * sOC, discAuthLvl, term, mARC, seg, countryCode this method will fetch the
	 * reference discount data from DB.
	 * 
	 * @param discountRequestData
	 * @throws IOException 
	 * @throws SQLException 
	 * @returns DiscountResponseData
	 */
	@Override
	public TxtResponseData sendTxtDetails(TxtRequestData txtRequestData)
			throws SalesBusinessException, IOException, SQLException {
		TxtResponseData txtResponseData = null;
		Status status = new Status();
		try {
			
			if (txtRequestData.getPhoneNumber() != null) {
				//discountResponseData = invokeUsingActivityType(txtRequestData);
				txtResponseData=sendMessageProcessor.getTxtSendResponse(txtRequestData);
			} 

		} catch (SalesBusinessException exception) {
			log.error("SERVICE LOG :: ERROR CODES {}", exception.getMessage(), exception);
			throw new SalesBusinessException(exception.getMessage());
		}
		return txtResponseData;
	}

	
}
