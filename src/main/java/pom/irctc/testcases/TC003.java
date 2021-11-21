package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.page.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC003";
		testCaseDescription="To verify OTP validation Check for the new user";
		author="Arun Kanna";
		category="Smoke";
		browserName="chrome";
		appName="IRCTC";
	}
	
	
	@Test
	public void OTPValidation() {
		
		new CovidAlertPage(driver,test)
		.clickOnOK()
		.mousehoveronHolidays()
		.mousehovronStays()
		.mousehoveronLounge()
		.switchToAccomodationWindow()
		.waitProperty(5000)
		.clickonHotels()
		.switchtoLoginPage()
		.clickonLogin()
		.clickonGuest()
		.enterbyEmail("arunkanna40@gmail.com")
		.enterbyMobileNumber("9710428848")
		.clickonGuestLogin()
		.switchToOTPIrctcHotelPage()
		.entertheHotelName("Chennai")
		.waitProperty(3000)
		.clickonCity()
		.waitProperty(3000)
		
		.clickonDate()
		.clickonDateValue()
		.clickonDateValueforYear()
		.clickonDateValueforMonth()
		.waitProperty(3000)
		.clickonDateValueforDay("11")
		.waitProperty(3000)
		.clickonCheckOutDate()
		.waitProperty(3000)
		.clickonCheckOutDateValue("14")
		.waitProperty(3000)
		.clickonRooms()
		.waitProperty(3000)
		.selectonRooms("1")
		.waitProperty(3000)
		.SelectonAdults("2")
		.SelectonChild("0")
		.waitProperty(3000)
		.clickonDone()
		.waitProperty(3000)
		.clickonFindHotel()
		.waitProperty(3000)
		.switchToOTPIrctcHotelPage()
		.clickonHotelName()
		.switchtoLastWindow()
		.clickonContinueToBook()
		.getHotelName("")
		.getHotlePrice("")
		.switchtoLastWindow()
		.waitProperty(3000)
		.selectbyTitle("Mr")
		.enterbyFirstName("Arun")
		.enterbyLastName("Kanna")
		.selectbyCountry("India")
		.waitProperty(3000)
		.selectbyState("TAMIL NADU")
		.waitProperty(3000)
		.enterbyMobileNumber("9710428848")
		.enterbyEmail("arunkanna40@gmail.com")
		.selectbyGST("No")
		.waitProperty(3000)
		.clickonContinue()
		.waitProperty(4000)
		.clickonAgee()
		.clickonMakePayment()
		.waitProperty(3000)
		.clickonVerify()
		.waitProperty(3000)
		.verifyOtpText("otp is required.");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
