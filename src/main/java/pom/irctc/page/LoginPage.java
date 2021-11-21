package pom.irctc.page;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {
	
	public LoginPage clickonLogin() {
		
		clickByXpath("//a[text()='Login']");
		return this;
		
	}
	
	public LoginPage switchtoWindow() {
		
		switchToLastWindow();
		return this;
		
	}
	
	public LoginPage switchtoLoginPage() {
		switchToLastWindow();
		return this;
	}
	
	public LoginPage clickonGuest() {
		
		clickByXpath("//a[text()='Guest User Login ']");
		return this;
		
	}
	
	public LoginPage enterbyEmail(String data) {
		
		enterByXpath("//input[@name='email']", data);
		return this;
		
	}
	
	public LoginPage enterbyMobileNumber(String data) {
		
		enterByXpath("//input[@name='mobileNo']", data);
		return this;
		
	}
	
	public OTPIrctcHotelsPage clickonGuestLogin() {
		
		clickByXpath("//*[@id=\"profile\"]/div/form/div[3]/button");
		return new OTPIrctcHotelsPage();
		
				
	}
	
	
/*	public OTPIrctcHotelsPage switchtoOTPIrctcHotelsPage() {
		
		switchToLastWindow();
		return this;*/
		
	
	public GSTIrctcHotelsPage clickonGuestLoginGST() {
		
		clickByXpath("//*[@id='profile']/div/form/div[3]/button");
		return new GSTIrctcHotelsPage();
}
		

		
		public OTPIrctcHotelsPage clickonHotels() {
			
			clickByXpath("//div[@class='Nav-icons IRCTCHotels']");
			return new OTPIrctcHotelsPage();
		}
		

}
