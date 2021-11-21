package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.page.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass()  {
		
		testCaseName="TC004";
		testCaseDescription="To verify  GST Validation Check for the new user";
		author="Arun Kanna";
		category="Smoke";
		browserName="chrome";
		appName="IRCTC";
	}


	@Test
	public void GSTValidation() {
		
		new CovidAlertPage(driver,test)
		.clickOnOK()
		.waitProperty(3000)
		.mousehoveronHolidays()
		.mousehovronStays()
		.mousehoveronLounge()
		.waitProperty(3000)
		.switchToAccomodationWindow()
		.clickonHotels()
		.switchtoLoginPage()
		.clickonLogin()
		.clickonGuest()
		.enterbyEmail("arunkanna40@gmail.com")
		.enterbyMobileNumber("9710428848")
		.clickonGuestLoginGST()
		.waitProperty(3000)
		.entertheHotelName("Chennai")
		.waitProperty(3000)
		.clickonCity()
		.waitProperty(3000)
		.clickonDate()
		.clickonDateValueforYear()
		.waitProperty(3000)
		//.clickonDateValueforMonth()
		.clickonDateValueforDay()
		.clickonRooms()
		.selectonRooms("1")
		.selectonAdults("2")
		.selectonChild("0")
		.waitProperty(3000)
		.clickonDone()
		.clickonFindHotel()
		.waitProperty(5000)
		.switchtoLastWindow()
		.clickonHotelName()
		.getHotelName()
		.switchtoLastWindow()
		.clickonContinueToBook()
		.waitProperty(3000)
		.selectonTitle("Mr")
		.enterbyFirstName("Arun")
		.enterbyLastName("Kanna")
		.selectbyCountry("India")
		.selectbyState("TAMIL NADU")
		.enterbyMobileNumber("9710428848")
		.scrollPageDown()
		.enterbyEmail("arunkanna40@gmail.com")
		.selectbyGST("Yes")
		.enterbyCompanyName("Corporate")
		.enterbyCompanyAddress("Chennai")
		.clickonContinue()
		.waitProperty(2000)
		.switchtoLastWindow()
		.verifygstnumber("gstNumber is required.");		
		
	}
	
	
}
