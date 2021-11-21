package pom.indianfrro.page;

import wrappers.GenericWrappers;

public class FormCRegistrationPage extends GenericWrappers {
	
	

	public UserRegistrationPage clickonSignUp() {
		
		clickByXpath("//a[text()='Sign Up (Registration)']");
	
		return new UserRegistrationPage();
	}
	
	

}
