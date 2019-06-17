package com.pnc.txt.bean;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TxtRequestData {

	private String phoneNumber;/* Mandatory */
	private String from;
	private List<String> to;
	private String consent_requirement;
	private String body;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public List<String> getTo() {
		return to;
	}

	public void setTo(List<String> to) {
		this.to = to;
	}

	public String getConsent_requirement() {
		return consent_requirement;
	}

	public void setConsent_requirement(String consent_requirement) {
		this.consent_requirement = consent_requirement;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	


	
}
