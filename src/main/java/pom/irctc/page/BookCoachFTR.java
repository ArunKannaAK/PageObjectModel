package pom.irctc.page;

import wrappers.GenericWrappers;

public class BookCoachFTR extends GenericWrappers {
	
public BookCoachFTR waitProperty(long time) {
		
		waitproperty(time);
		return this;
}
	
	public BookCoachFTR clickonNewUser() {
		
		clickByXpath("//a[text()='New User? Signup']");
		return this;
	}
	
	public BookCoachFTR enterbyUserID(String data) {
		
		enterByXpath("//input[@id='userId']", data);
		return this;
	}
	
public BookCoachFTR switchtoBookCoachWindow() {
		
		switchToLastWindow();
		return this;
}
	
	public BookCoachFTR enterbyPassword(String data) {
		
		enterByXpath("//input[@id='password']", data);
		return this;
	}
	
	public BookCoachFTR enterbyConfirmPassword(String data) {
		
		enterByXpath("//input[@id='cnfPassword']", data);
		return this;
	}
	
	public BookCoachFTR selectbySecurityQuestion(String value) {
		
		selectvaluebyxpath("//select[@id='secQstn']", value);
		return this;
	}
	
	public BookCoachFTR enterbySecurityAnswer(String data) {
		
		enterByXpath("//input[@id='secAnswer']", data);
		return this;
		
	}
	
	
	public BookCoachFTR clickbyDateofBirth() {
		
		clickByXpath("//input[@id='dateOfBirth']");
		return this;
	}
	
	public BookCoachFTR selectbyYear(String data) {
		
		selectVisibleTextByXpath("//select[@data-handler='selectYear']", data);
		return this;
	}
	
	public BookCoachFTR selectbyMonth(String data) {
		
		selectvaluebyxpath("//select[@data-handler='selectMonth']", data);
		return this;
	}
	
	public BookCoachFTR clickbyDate(String data) {
		
		clickByXpath("//a[text()='"+data+"']");
		return this;
	}
	
	public BookCoachFTR clickbyGender(String data) {
		
		clickByXpath("//input[@id='"+data+"']");
		return this;
	}
	
	public BookCoachFTR clickbyMaritalStatus(String data) {
		
		clickByXpath("//input[@id='"+data+"']");
		return this;
	}
	
	public BookCoachFTR enterbyEmail(String data) {
		
		enterByXpath("//input[@id='email']", data);
		return this;
	}
	
	
	public BookCoachFTR selectbyOccupation(String data) {
		
		selectVisibleTextByXpath("//select[@id='occupation']", data);
		return this;
	}
	
	public BookCoachFTR enterbyFirstName(String data) {
		
		enterByXpath("//input[@id='fname']",data);
		return this;
	}
	
	public BookCoachFTR enterbyMiddleName(String data) {
		
		enterByXpath("//input[@id='mname']",data);
		return this;
	}
	
	public BookCoachFTR enterbyLastName(String data) {
		
		enterByXpath("//input[@id='lname']",data);
		return this;
	}
	public BookCoachFTR selectbyNationality(String data) {
		
		selectVisibleTextByXpath("//select[@id='natinality']", data);
		return this;
	}
	
	public BookCoachFTR enterbyFlatno(String data) {
		
		enterByXpath("//input[@id='flatNo']", data);
		return this;
	}
	
public BookCoachFTR enterbyStreet(String data) {
		
		enterByXpath("//input[@id='street']", data);
		return this;
	}
	
	public BookCoachFTR enterbyArea(String data) {
		
		enterByXpath("//input[@id='area']", data);
		return this;
	}

	public BookCoachFTR selectbyCountry(String data) {
		
		selectVisibleTextByXpath("//select[@id='country']", data);
		return this;
	}
	
	
	public BookCoachFTR enterbyPrefix(String data) {
		
		enterByXpath("//input[@id='isdPrefix']", data);
		return this;
	}
	
	public BookCoachFTR enterbyMobile(String data) {
		
		enterByXpath("//input[@id='mobile']", data);
		return this;
	}
	
	public BookCoachFTR enterbyPincode(String data) {
		
		enterByXpath("//input[@id='pincode']", data);
		return this;
	}
	
	public BookCoachFTR clickonTab() {
		
		clickonTabKey();
		return this;
	}
	
	public BookCoachFTR selectbyCity(String data) {
		
		selectVisibleTextByXpath("//select[@id='city']", data);
		return this;
	}

	public BookCoachFTR selectbyState(String data) {
		
		selectVisibleTextByXpath("//select[@id='state']", data);
		return this;
	}
	
	public BookCoachFTR selectbyPostOffice(String data) {
		
		selectvaluebyxpath("//select[@id='postOffice']", data);
		return this;
	}
	
	public BookCoachFTR clickbyResidentialAddress(String value) {
		
		clickByXpath("//input[@id='"+value+"']");
		return this;
	}
	
	public BookCoachFTR clickonPrimarybutton() {
		
		clickByXpath("//button[@class='btn btn-primary']");
		return this;
	}
	
	


}
