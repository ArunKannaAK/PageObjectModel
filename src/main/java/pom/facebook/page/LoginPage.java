package pom.facebook.page;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {

	 	public LoginPage clickonEnglish(String value) {
	 		
	 		clickByXpath("//li[text()='"+value+"']");
	 		return this;
	 
	 	}
	 	
	 	public LoginPage clickonCreateNewAccount() {
	 		
	 		clickByXpath("//a[@data-testid='open-registration-form-button']");
	 		return this;
	 		
	 	}
	 	
	 	public LoginPage enterbyFistname(String data) {
	 		
	 		enterByXpath("//input[@name='firstname']", data);
	 		return this;
	 	}
	 	
	 	public LoginPage enterbyLastName(String data) {
	 		
	 		enterByXpath("//input[@name='lastname']", data);
	 		return this;
	 		
	 	}
	 	
	 	
	 	public LoginPage enterbyemail(String data) {
	 		
	 		enterByXpath("//input[@name='reg_email__']", data);
	 		return this;
	 	}

	 	public LoginPage enterbyConfirmEmail(String data) {
	 		
	 		enterByXpath("//input[@name='reg_email_confirmation__']", data);
	 		return this;
	 	}
	 	
	 	public LoginPage enterbyPassword(String data) {
	 		
	 		enterByXpath("//input[@name='reg_passwd__']", data);
	 		return this;
	 	}

	 	public LoginPage clickonday() {
	 		
	 		clickByXpath("//select[@id='day']");
	 		return this;
	 	}

	 	public LoginPage selectonDayvalue(String value) {
	 		
	 		selectvaluebyxpath("//select[@id='day']", value);
	 		return this;
	 	}
	 
	 	public LoginPage selectonMonthvalue(String value) {
	 		
	 		selectvaluebyxpath("//select[@id='month']", value);
	 		return this;

	 	}

	 	
	 	public LoginPage selectonYearvalue(String value) {
	 		
	 		selectvaluebyxpath("//select[@id='year']", value);
	 		return this;
	 	
	 	}
	 	
	 	public LoginPage clickonGender(String value) {
	 		
	 		clickByXpath("//input[@value='"+value+"']");
	 		return this;
	 	}

	 	public LoginPage clickonSignup() {
	 		
	 		clickByXpath("//button[@name='websubmit']");
	 		return this;
	 	}












}

