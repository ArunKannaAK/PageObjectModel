package pom.indianfrro.page;

import wrappers.GenericWrappers;

public class UserRegistrationPage extends GenericWrappers {

	public UserRegistrationPage enterbyUserID(String data) {
		
		enterByXpath("//input[@id='u_id']", data);
		
		return this;
	}
	
	public UserRegistrationPage enterbyPassword(String data) {
		
		enterByXpath("//input[@id='u_pwd']", data);
		return this;
		
	}
		
	public UserRegistrationPage enterbyConfirmPassword(String data) {
		
		enterByXpath("//input[@id='u_repwd']", data);
		return this;
		
	}
		
	
	public UserRegistrationPage selectbySecurityQuestion(String value) {
		
		selectVisibleTextByXpath("//select[@id='u_secques']", value);
		
		return this;
		
	}
		
	
	public UserRegistrationPage enterbyAnswer(String data) {
		
		enterByXpath("//input[@id='u_secans']", data);
		return this;
		
	}
	
	
	public UserRegistrationPage enterbyName(String data) {
		
		enterByXpath("//input[@id='u_name']", data);
		
		return this;
		
	}
	
	public UserRegistrationPage selectbyGender(String value) {
		
		selectVisibleTextByXpath("//select[@id='u_gender']", value);
		
		return this;
		
	}
	
	public UserRegistrationPage clickbyDOB() {
		
		clickByXpath("//img[@title='Open Calender']");
		return this;
		
	}
	
	public UserRegistrationPage enterbyDesignation(String data) {
		
		enterByXpath("//input[@id='u_designation']", data);
		return this;
		
	}
	
	public UserRegistrationPage enterbyEmailid(String data) {
		
		enterByXpath("//input[@id='u_emailid']", data);
		return this;
	}
	
	public UserRegistrationPage enterbyMobile(String data) {
		
		enterByXpath("//input[@id='u_mobile']", data);
		return this;
		
	}
	
	public UserRegistrationPage enterbyPhone(String data) {
		
		enterByXpath("//input[@id='u_phone']", data);
		return this;
		
		
	}
	
	public UserRegistrationPage selectonNationality(String value) {
		selectvaluebyxpath("//select[@id='u_nationality']",value);
		return this;
		
	}
	
	public UserRegistrationPage enterbyName1(String data) {
		
		enterByXpath("//input[@id='name']", data);
		return this;
		
	}
	
	public UserRegistrationPage enterbyCapacity(String data) {
		
		enterByXpath("//input[@id='capacity']", data);
		return this;
		
	}
	
	public UserRegistrationPage enterbyAddress(String data) {
		
		enterByXpath("//textarea[@id='address']", data);
		return this;
		
	}
	
	
	public UserRegistrationPage selectonState(String data) {
		
		selectVisibleTextByXpath("//select[@id='state']",data);
		return this;
	}
	
	public UserRegistrationPage selectbycity(String data) {
		selectVisibleTextByXpath("//select[@id='city_distr']", data);
		return this;
		
	}
	
	public UserRegistrationPage waitProperty(long value) {
		
		waitproperty(value);
		return this;
	}
	
	public UserRegistrationPage selectbyaccomodationtype(String value) {
		
		selectVisibleTextByXpath("//select[@id='acco_type']", value);
		return this;
		
	}
		
	public UserRegistrationPage selectbyaccomodationgrade(String value) {
		selectVisibleTextByXpath("//select[@id='star_rat']", value);
		return this;
		
	}
	
	public UserRegistrationPage enterbyEmaild1(String data) {
		
		enterByXpath("//input[@id='email']", data);
		return this;
		
		
	}
	
	public UserRegistrationPage enterbyMcontact(String data) {
		
		enterByXpath("//input[@id='mcontact']", data);
		return this;
		
	}
	
	public UserRegistrationPage enterbyPhonenumber1(String data) {
		
		enterByXpath("//input[@id='contact']", data);
		return this;
			
	}
	
	public UserRegistrationPage enterbyGuestName(String data) {
		
		enterByXpath("//input[@name='name_o']", data);
		return this;
		
	}

	public UserRegistrationPage enterbyGuestAdddress(String data) {
		
		enterByXpath("//input[@name='address_o']", data);
		return this;
		
	}
	
	public UserRegistrationPage selectbyGuestState(String value) {
		
		selectVisibleTextByXpath("//select[@name='state_o']", value);
		return this;
		
	}
	
	
	public UserRegistrationPage selectbyGuestCity(String value) {
		selectVisibleTextByXpath("//select[@id='citydistr_o']", value);
		return this;
	}
	
	public UserRegistrationPage enterbyGuestEmail(String data) {
		
		enterByXpath("//input[@name='emailid_o']", data);
		return this;
		
	}
	
	public UserRegistrationPage clickbyAdd() {
		
		clickByXpath("//input[@onclick='addInput()']");
		return this;
		
	}
	
	
	
}
		
		
		
	

