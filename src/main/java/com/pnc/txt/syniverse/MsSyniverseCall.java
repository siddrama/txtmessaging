package com.pnc.txt.syniverse;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.pnc.txt.bean.TxtRequestData;
import com.pnc.txt.exception.SalesBusinessException;

public class MsSyniverseCall {
	
	public String invokeSyniverseMS(TxtRequestData txtRequestData) throws SalesBusinessException {


		
		HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "my_other_value");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.exchange("URL_EMPLOYEES",
                HttpMethod.POST, entity, String.class);
		String result = response.getBody();
		return result;
		
	}
}
