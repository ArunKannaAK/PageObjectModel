package pom.irctc.page;

import wrappers.GenericWrappers;

public class OTPIrctcHotelsPage extends GenericWrappers {
	
	
	public OTPIrctcHotelsPage switchToOTPIrctcHotelPage() {
		
		switchToLastWindow();
		return this;
	}
	
	
	public OTPIrctcHotelsPage entertheHotelName(String data) {
		
		enterByXpath("//input[@id='filterText']",data);
		return this;
		
	}
	
	public OTPIrctcHotelsPage clickonCity() {
		
		clickByXpath("//strong[normalize-space()='City']");
		return this;
		
	}
	
	public OTPIrctcHotelsPage waitProperty(long time) {
		
		waitproperty(time);
		return this;
	}
	
	
	public OTPIrctcHotelsPage clickonDate() {
		
		clickByXpath("//input[@name='dt12']");
		return this;
		
	}
	
	
	public OTPIrctcHotelsPage clickonDateValue() {
		
		clickByXpath("//span[@class='owl-dt-control-button-arrow']");
		return this;		
	}
	
	public OTPIrctcHotelsPage clickonDateValueforYear() {
		
		clickByXpath("//*[@id='owl-dt-picker-0']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-multi-year-view/table/tbody/tr[3]/td[1]/span");
		return this;
	}
	
	public OTPIrctcHotelsPage clickonDateValueforMonth() {
		
		clickByXpath("//*[@id='owl-dt-picker-0']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-year-view/table/tbody/tr[1]/td[1]/span");
		return this;
	}
	
	
	public OTPIrctcHotelsPage clickonDateValueforDay(String data) {
		
		clickByXpath("//span[text()='"+data+"']");
		return this;
	}
	public OTPIrctcHotelsPage clickonCheckOutDate() {
		clickByXpath("//input[@name='dt13']");
		return this;
		
	}
	
	public OTPIrctcHotelsPage clickonCheckOutDateValue(String data) {
		
		clickByXpath("//span[text()='"+data+"'] ");
		return this;
	}
	
	
	
	public OTPIrctcHotelsPage clickonRooms() {
		
		clickByXpath("//input[@id='user-data-wrapper-id']");
		return this;
	}
	
	public OTPIrctcHotelsPage selectonRooms(String value) {
		
		selectVisibleTextByXpath("//select[@name='hotelRoom']", value);
		return this;
		
	}
	
	public OTPIrctcHotelsPage SelectonAdults(String value) {
		
		selectVisibleTextByXpath("//select[@name='hotelAdult']", value);
		return this;
		
	}
	
	
	
	public OTPIrctcHotelsPage SelectonChild(String value) {
		
		selectVisibleTextByXpath("//select[@name='hotelChild']", value);
		return this;
		
		
	}
	
	
	public OTPIrctcHotelsPage clickonDone() {
		
		clickByXpath("//button[text()='Done']");
		return this;

	}
	
	public OTPIrctcHotelsPage clickonFindHotel() {
		
		clickByXpath("//button[text()='Find Hotel ']");
		return this;
		
	}
	
	public OTPHotelPage clickonHotelName() {
		
		clickByXpath("//div[@class='row no-gutters']");
		return new OTPHotelPage();
		
	}

	
	
	
	
}
