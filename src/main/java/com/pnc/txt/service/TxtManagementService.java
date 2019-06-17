package com.pnc.txt.service;


import java.io.IOException;
import java.sql.SQLException;

import com.pnc.txt.bean.TxtRequestData;
import com.pnc.txt.bean.TxtResponseData;
import com.pnc.txt.exception.SalesBusinessException;


public interface TxtManagementService {
   
	public TxtResponseData sendTxtDetails(TxtRequestData 
			txtRequestData) throws SalesBusinessException, SQLException, IOException;
	
}
