package com.ottawau.cdstore.orderProcessing.jasonentity;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


public class ProcessOrderJason {
	private String InputFirstName;
	private String InputLastName;
	private String InputZip;
	private String InputCountry;
	private String InputEmail;
	private String mobile;

	private String InputAddress;
	private String InputCity;
	private String InputState;
	private String InputCCNumber;
	private String CCUsername;
	private String InputCCEXPDate;
	private String InputCCEXPYr;

	Map<Integer, Integer> cdList;
	
	public Map<Integer, Integer> getCdList() {
		return cdList;
	}

	public void setCdList(Map<Integer, Integer> cdList) {
		this.cdList = cdList;
	}

	public ProcessOrderJason(String InputFirstName) {
		this.InputFirstName = InputFirstName;

	}
	
	public ProcessOrderJason() {

	}
	
	public ProcessOrderJason(String InputFirstName, String InputLastName,
			String InputZip, String InputCountry, String InputEmail,
			String mobile, String InputAddress, String InputCity,
			String InputState, String InputCCNumber, String CCUsername,
			String InputCCEXPDate, String InputCCEXPYr, Map<Integer, Integer> cdList) {
		this.InputFirstName = InputFirstName;
		this.InputLastName = InputLastName;
		this.InputZip = InputZip;
		this.InputCountry = InputCountry;
		this.InputEmail = InputEmail;
		this.mobile = mobile;

		this.InputAddress = InputAddress;
		this.InputCity = InputCity;
		this.InputState = InputState;
		this.InputCCNumber = InputCCNumber;
		this.CCUsername = CCUsername;
		this.InputCCEXPDate = InputCCEXPDate;
		this.InputCCEXPYr = InputCCEXPYr;
		this.cdList = cdList;

	}

	public String getInputFirstName() {
		return InputFirstName;
	}

	public void setInputFirstName(String inputFirstName) {
		InputFirstName = inputFirstName;
	}

	public String getInputLastName() {
		return InputLastName;
	}

	public void setInputLastName(String inputLastName) {
		InputLastName = inputLastName;
	}

	public String getInputZip() {
		return InputZip;
	}

	public void setInputZip(String inputZip) {
		InputZip = inputZip;
	}

	public String getInputCountry() {
		return InputCountry;
	}

	public void setInputCountry(String inputCountry) {
		InputCountry = inputCountry;
	}

	public String getInputEmail() {
		return InputEmail;
	}

	public void setInputEmail(String inputEmail) {
		InputEmail = inputEmail;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getInputAddress() {
		return InputAddress;
	}

	public void setInputAddress(String inputAddress) {
		InputAddress = inputAddress;
	}

	public String getInputCity() {
		return InputCity;
	}

	public void setInputCity(String inputCity) {
		InputCity = inputCity;
	}

	public String getInputState() {
		return InputState;
	}

	public void setInputState(String inputState) {
		InputState = inputState;
	}

	public String getInputCCNumber() {
		return InputCCNumber;
	}

	public void setInputCCNumber(String inputCCNumber) {
		InputCCNumber = inputCCNumber;
	}

	public String getCCUsername() {
		return CCUsername;
	}

	public void setCCUsername(String cCUsername) {
		CCUsername = cCUsername;
	}

	public String getInputCCEXPDate() {
		return InputCCEXPDate;
	}

	public void setInputCCEXPDate(String inputCCEXPDate) {
		InputCCEXPDate = inputCCEXPDate;
	}

	public String getInputCCEXPYr() {
		return InputCCEXPYr;
	}

	public void setInputCCEXPYr(String inputCCEXPYr) {
		InputCCEXPYr = inputCCEXPYr;
	}
}
