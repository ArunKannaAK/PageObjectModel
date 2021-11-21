   package pom.phptravels.page;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	public RegistrationPage enterbyFirstName(String data) {
		
		enterByXpath("//input[@id='inputFirstName']", data);
		return this;
	}

	public RegistrationPage enterbyLastName(String data) {
		
		enterByXpath("//input[@id='inputLastName']", data);
		return this;
		
	}
	
	public RegistrationPage enterbyEmail(String data) {
		
		enterByXpath("//input[@id='inputEmail']", data);
		return this;
		
	}
	
	public RegistrationPage enterbyPhone(String data) {
		
		enterByXpath("//input[@id='inputPhone']", data);
		return this;
		
	}
	
	public RegistrationPage enterbyCompany(String data) {
		
		enterByXpath("//input[@id='inputCompanyName']", data);
		return this;
		
	}
	
	public RegistrationPage enterbyStreet1(String data) {
		
		enterByXpath("//input[@id='inputAddress1']", data);
		return this;
		
	}
	
	public RegistrationPage enterbyStreet2(String data) {
		
		enterByXpath("//input[@id='inputAddress2']", data);
		return this;
		
	}
	
	public RegistrationPage enterbyCity(String data) {
		
		enterByXpath("//input[@id='inputCity']", data);
		return this;
		
	}

	public RegistrationPage enterbyState(String data) {
		
		enterByXpath("//input[@id='stateinput']", data);
		return this;
		
	}
	
	public RegistrationPage enterbyPostcode(String data) {
		
		enterByXpath("//input[@id='inputPostcode']", data);
		return this;
		
	}

	
		
	public RegistrationPage selectbyCountry(String data) {
		
		selectVisibleTextByXpath("//select[@id='inputCountry']", data);
		return this;
		
	}
		
	public RegistrationPage enterbyMobile(String data) {
		
		enterByXpath("//input[@id='customfield2']", data);
		return this;
		
	}
	
	public RegistrationPage enterbyPassword(String data) {
		
		enterByXpath("//input[@id='inputNewPassword1']", data);
		return this;
		
	}
	
	public RegistrationPage enterbyConfirmPassword(String data) {
		
		enterByXpath("//input[@id='inputNewPassword2']", data);
		return this;
		
	}
	
	public RegistrationPage clickonRegister() {
		
		clickByXpath("//input[@value='Register']");
		return this;
		
	}
	
	
	}













