package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.irctc.page.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	
	
	
	@BeforeClass
	public void beforeClass()   {
		
		testCaseName="TC005";
		testCaseDescription="To verify  Book your Coach Check for the new user";
		author="Arun Kanna";
		category="Smoke";
		browserName="chrome";
		appName="BookYourCoach";
	}


	@Test
	public void bookYourCoach() {
		
		new CovidAlertPage(driver,test)
		.clickOnOK()
		.mousehoveronHolidays()
		.mousehovronStays()
		.mousehoveronLounge()
		.waitProperty(3000)
		.switchToAccomodationWindow()
		.clickonMenu()
		.waitProperty(3000)
		.clickonBookYourTrain()
		.waitProperty(3000)
		.switchtoBookCoachWindow()
		.waitProperty(4000)
		.clickonNewUser()
		.switchtoBookCoachWindow()
		.waitProperty(3000)
		.enterbyUserID("ArunKanna11")
		.enterbyPassword("Volvo@123")
		.enterbyConfirmPassword("Volvo@123")
		.selectbySecurityQuestion("0")
		.enterbySecurityAnswer("Brucy")
		.waitProperty(3000)
		.clickbyDateofBirth()
		.selectbyYear("1994")
		.selectbyMonth("11")
		.clickbyDate("11")
		.clickbyGender("gender0")
		.clickbyMaritalStatus("maritalStatus1")
		.enterbyEmail("arunkanna40@gmai.com")
		.selectbyOccupation("Government")
		.enterbyFirstName("arun")
		.enterbyMiddleName("S R")
		.enterbyLastName("Kanna")
		.selectbyNationality("Indian")
		.enterbyFlatno("15")
		.enterbyStreet("Dhanalakshmi Nagar")
		.enterbyArea("Kolathur")
		.selectbyCountry("India")
		.enterbyPrefix("+91")
		.enterbyMobile("9710428848")
		.enterbyPincode("600099")
		.clickonTab()
		.selectbyCity("Tiruvallur")
		.selectbyState("TAMIL NADU")
		.selectbyPostOffice("1")
		.closeAllBrowsers();
	
	
	
	
	
	
	
	
	}

}
