package pom.irctc.page;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers {
	
	
	
	
	public AccomodationPage switchToAccomodationWindow() {
		switchToLastWindow();
		return this;
	}
	
	public AccomodationPage waitProperty(long time) {
		
		waitproperty(time);
		return this;
	}
	
	public AccomodationPage clickonMenu() {
		
		clickByXpath("//a[@id='sidebarCollapse']");
		return this;
		
}
	

	
	public BookCoachFTR clickonBookYourTrain() {
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new BookCoachFTR();
	}
	
	
	public SaloonMadatoryCheckHomePage clickonCharter() {
		
		clickByXpath("//a[text()='Charter']");
		return new SaloonMadatoryCheckHomePage();
		
	}
	public OTPIrctcHotelsPage clickonHotelName() {
		
		clickByXpath("//input[@class='form-control ng-pristine ng-valid ng-touched']");
		return new OTPIrctcHotelsPage();
		
	}
	
	
	public LoginPage clickonHotels() {
		
		clickByXpath("//div[@class='Nav-icons IRCTCHotels']");
		return new LoginPage();
	}
	

	
	public LoginPage switchtoLoginPage() {
		switchToLastWindow();
		return new LoginPage();
	}
	
	
	public BookCoachFTR BookTrain() {
		
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new BookCoachFTR();
}
}