package pom.irctc.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcRegistrationPage extends GenericWrappers{
	
	
	public IrctcRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public IrctcRegistrationPage clickonRegister() {
		
		clickByXpath("//a[text()=' REGISTER ']");
		return this;
	}

	public IrctcRegistrationPage waitProperty(long time)  {
		waitproperty(time);
		return this;
		
	}
	
	public IrctcRegistrationPage clickonTab()  {
		clickonTabKey();
		return this;
		
	}
	
	public IrctcRegistrationPage enterUserName(String data) {
		
		enterByXpath("//input[@id='userName']", data);
		return this;
	}
	
	public IrctcRegistrationPage enterPassword(String data) {
		
		enterByXpath("//input[@id='usrPwd']", data);
		return this;
		
	}

	public IrctcRegistrationPage enterConfirmPassword(String data) {
		
		enterByXpath("//input[@id='cnfUsrPwd']", data);
		return this;
		
	}

	public IrctcRegistrationPage clickonPreferredLanguage() {
		
		clickByXpath("//span[text()='Preferred Language']");
		return this;
	}
		
	
	public IrctcRegistrationPage clickonPreferredLanguageOption(String value) {
		
		clickByXpath("//span[text()='"+value+"']");
		return this;
	}


	public IrctcRegistrationPage clickonSecurityQuestion() {
		
		clickByXpath("//span[text()='Security Question']");
		return this;
	}
	
	public IrctcRegistrationPage clickonSecurityQuestionOptions(String value) {
		
		clickByXpath("//span[text()='"+value+"']");
		return this;
		
	}
	
	public IrctcRegistrationPage enterSecrityAnswer(String data) {
		
		enterByXpath("//input[@placeholder='Security Answer']", data);
		return this;
		
	}

	public IrctcRegistrationPage clickOnContinue() {
		
		clickByXpath("//button[@label='Continue']");
		return this;
	}
	
	public IrctcRegistrationPage enterFirstname(String data) {
		enterByXpath("//input[@id='firstName']", data);
		return this;
		
	}
	
	public IrctcRegistrationPage enterMiddleName(String data) {
		
		enterByXpath("//input[@id='middleName']", data);
		return this;
	}

	public IrctcRegistrationPage enterLastname(String data) {
		
		enterByXpath("//input[@id='lastname']", data);
		return this;
	}
	
	public IrctcRegistrationPage clickOnOccupation() {
		
		clickByXpath("//span[text()='Select Occupation']");
		return this;
		
	}
	
	public IrctcRegistrationPage clickOnOccupationOption(String data) {
		
		clickByXpath("//span[text()='"+data+"']");
		return this;
		
	}

	
	
	public IrctcRegistrationPage enterDOB(String data) {
		enterByXpath("//input[@placeholder='Date Of Birth']",data);
		
		return this;
		
	}
	
	public IrctcRegistrationPage selectOnDob(String value) {
		
		selectVisibleTextByXpath("//select[@class='ui-datepicker-month ng-tns-c59-17 ng-star-inserted']", value);
		return this;
	}
	
	public IrctcRegistrationPage selectonMonth(String value) {
		
		selectVisibleTextByXpath("//select[@class='ui-datepicker-year ng-tns-c59-17 ng-star-inserted']", value);
		return this;
		
	}
	
	public IrctcRegistrationPage clickonDate() {
		clickByXpath("");
		return this;
		
	}
	
	
	
	
	
	public IrctcRegistrationPage clickOnMartialStatus(String data) {
		
		clickByXpath("//label[text()='"+data+"']/preceding-sibling::div");
		return this;
	}
	
	
	
	
	public IrctcRegistrationPage selectCountry(String value) {
		selectVisibleTextByXpath("//select[@formcontrolname='resCountry']", value);
		return this;
	}
	
	public IrctcRegistrationPage clickonGender(String value) {
		clickByXpath("//span[text()='"+value+"']");
		return this;
	
	}
	
	public IrctcRegistrationPage enterEmail(String data) {
		enterByXpath("//input[@id='email']", data);
		return this;
	}
	
	
	public IrctcRegistrationPage enterMobile(String data) {
		
		enterByXpath("//input[@id='mobile']", data);
		return this;
	
	}
	
	public IrctcRegistrationPage selectNationality(String value) {
		
		selectVisibleTextByXpath("//select[@formcontrolname='nationality']", value);
		return this;
	}
	
	public IrctcRegistrationPage clickonContinue() {
		clickByXpath("//button[@label='Continue']");
		return this;
	}
	
	public IrctcRegistrationPage enterFlat(String data) {
		
		enterByXpath("//input[@id='resAddress1']", data);
		return this;
	}
	
	public IrctcRegistrationPage enterStreet(String data) {
		
		enterByXpath("//input[@id='resAddress2']", data);
		return this;
	}
	
	public IrctcRegistrationPage enterArea(String data) {
		
		enterByXpath("//input[@id='resAddress3']", data);
		return this;
		
	}
	
	public IrctcRegistrationPage enterPincode(String data) {
		
		enterByXpath("//input[@name='resPinCode']", data);
		return this;
		
	}
	
	public IrctcRegistrationPage enterState(String data) {
		
		enterByXpath("//input[@id='resState']", data);
		return this;
	}
	
	public IrctcRegistrationPage selectbyCity(String value) {
	selectVisibleTextByXpath("//select[@formcontrolname='resCity']", value);
	return this;
	
	}
	
	
	
	public IrctcRegistrationPage selectbyPostoffice(String value) {
		
		selectVisibleTextByXpath("//select[@formcontrolname='resPostOff']", value);
		return this;
	}
	
	public IrctcRegistrationPage enterPhone(String data) {
		
		enterByXpath("//input[@id='resPhone']", data);
		return this;
		
	}
	
	public IrctcRegistrationPage clickonOfficeAddress(String value) {
		
		clickByXpath("//label[text()='"+value+"']/preceding-sibling::div");
		return this;
		
	}
	
	public IrctcRegistrationPage enterOfficeFlat(String data) {
		
		enterByXpath("//input[@id='offAddress1']", data);
		return this;
	}
	
	public IrctcRegistrationPage enterOfficeStreet(String data) {
		
		enterByXpath("//input[@id='offAddress2']", data);
		return this;
	
	
	}
	
	public IrctcRegistrationPage enterOfficesArea(String data) {
		
		enterByXpath("//input[@id='offAddress3']", data);
		return this;

	}
	
	public IrctcRegistrationPage clickonCountry() {
		
		clickByXpath("//*[@id='ui-tabpanel-5']/div/div[10]/div[4]/p-dropdown/div");
		return this;
	}
	
	public IrctcRegistrationPage clickonCountryValue() {
		
		clickByXpath("//*[@id='ui-tabpanel-5']/div/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[105]/li/span");
		return this;
	}

	public IrctcRegistrationPage enterOfficePinCode(String data) {
		
		enterByXpath("//input[@id='offPinCode']", data);
		return this;
		
		
	}
	
	
	/*public IrctcRegistrationPage enterState1(String data) {
		
		enterByXpath("//input[@id='offState']", data);
		return this;
	}*/
	
	
	
	
	public IrctcRegistrationPage enterbyOfficeCity(String value) {
		
		enterByXpath("//input[@id='offCity']", value);
		return this;
		
	}
	
	public IrctcRegistrationPage enterbyPostOffice(String data) {
		
		enterByXpath("//input[@id='offPostOff']", data);
		return this;
	}
	
	public IrctcRegistrationPage enterOfficeState(String data) {
		enterByXpath("//input[@id='offState']", data);
		return this;
		
	}
	
	public IrctcRegistrationPage enterOfficePhone(String data) {
		enterByXpath("//input[@id='offPhone']", data);
		return this;
		
	}
	
	public IrctcRegistrationPage clickOnTermsandConditions() {
		
		clickByXpath("//input[@formcontrolname='termCondition']");
		return this;
		
	}
	
	public IrctcRegistrationPage clickRegister() {
		
		clickByXpath("//button[text()='REGISTER']");
		return this;
	}
	

	
	
	
}
	
	


