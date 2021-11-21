package pom.irctc.page;

import wrappers.GenericWrappers;

public class OTPHotelPage extends GenericWrappers  {
	
	public OTPHotelPage clickonContinueToBook() {
		
		clickByXpath("//b[text()='Continue to Book']");
		return this;
		
	}
	
	public OTPHotelPage getHotelName(String value) {
		
		String hotelname = getTextByXpath("//h5[text()='"+value+"']");
		return this;
		
	}
	
	public OTPHotelPage waitProperty(long time) {
		
		waitProperty(time);
		return this;
	}
	public OTPHotelPage switchtoLastWindow() {
		
		switchToLastWindow();
		return this;
	}
	
	public OTPHotelPage getHotlePrice(String data) {
		
		getTextByXpath("//strong[contains(text(),'"+data+"')] ");
		return this;
		
	}
	
	
	public OTPHotelPage selectbyTitle(String data) {
		
		selectVisibleTextByXpath("//select[@name='title']", data);
		return this;
	}
	
	public OTPHotelPage enterbyFirstName(String data) {
		
		enterByXpath("//input[@name='firstName']", data);
		return this;
	}
	
	public OTPHotelPage enterbyLastName(String data) {
		
		enterByXpath("//input[@name='lastName']", data);
		return this;
		
	}
	
	public OTPHotelPage selectbyCountry(String value) {
		
		selectVisibleTextByXpath("//select[@name='country']", value);
		return this;
		
	}
	 
	public OTPHotelPage selectbyState(String value) {
		
		selectVisibleTextByXpath("//select[@name='state']", value);	
	return this;
	}
	
	
	public OTPHotelPage enterbyMobileNumber(String data) {
		
		enterByXpath("//input[@placeholder='Mobile Number']", data);
		return this;
	}
	
	
	public OTPHotelPage enterbyEmail(String data) {
		
		enterByXpath("//input[@placeholder='Email Id']", data);
		return this;
	}
	
	public OTPHotelPage selectbyGST(String value) {
		
		selectVisibleTextByXpath("//select[@name='gst']", value);
		return this;
	}
	
	public OTPHotelPage clickonContinue() {
		
		clickByXpath("//button[text()='Continue']");
		return this;
		
	}
	
	public OTPHotelPage clickonAgee() {
		
		clickByXpath("//span[@class='checkmark']");
		return this;
	}
	
	public OTPHotelPage clickonMakePayment() {
		
		clickByXpath("//button[text()='Make Payment']");
		return this;
		
	}
	
	public OTPHotelPage clickonVerify() {
		
		clickByXpath("//button[text()='Verify']");
		return this;
	}
	
	public OTPHotelPage verifyOtpText(String text) {
		
		verifyTextByXpath("//span[text()='otp is required.']", text);
		return this;
	}
	
	public void closeallBrowsers() {
		
		closeAllBrowsers();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
