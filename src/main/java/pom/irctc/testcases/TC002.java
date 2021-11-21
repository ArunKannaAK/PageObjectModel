package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.page.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers

{
	


	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To verify IRCTC Saloon Mandatory Check for the new user";
		author="Arun Kanna";
		category="Smoke";
		browserName="chrome";
		appName="IRCTC";
	}
	
	@Test
public void SaloonMandatoryCheck() {
		
		new CovidAlertPage(driver,test)
		.clickOnOK()
		.mousehoveronHolidays()
		.mousehovronStays()
		.mousehoveronLounge()
		.waitProperty(7000)
		.switchToAccomodationWindow()
		.clickonMenu()
		.clickonCharter()
		.clickonEnquiryform()
		.enterbyName("Arun Kanna")
		.enterbyOrganization("Offie")
		.enterbyMobile("01")
		.enterbyEmail("arunkanna40@gmail.com")
		.selectbyCharter("Saloon Charter")
		.enterbyOriginstation("Chennai")
		.enterbyDestinstation("delhi")
		.clickonDateIn()
		.clickonDateOut()
		.enterbyDuration("4")
		.enterbyCoachDetails("Semi")
		.enterbyNumberOfPassengers("4")
		.enterbyCharterPurpose("Flight")
		.clickonsubmit()
		.verifyMobileNofield("Mobile no. not valid");
	
	}

}
