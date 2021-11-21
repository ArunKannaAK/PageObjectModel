package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.page.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify IRCTC Registration for the new user";
		author="Arun Kanna";
		category="Smoke";
		browserName="chrome";
		appName="IRCTC";
	}
	
	@Test
	
	public void irctcRegistrationPage() {
		
		new CovidAlertPage(driver, test)
		.clickOnOK()
		.clickonRegister()
		.waitProperty(5000)
		.enterUserName("ArunKanna11")
		.enterPassword("Volvo@123")
		.enterConfirmPassword("Volvo@123")
		.clickonPreferredLanguage()
		.clickonPreferredLanguageOption("English")
		.clickonSecurityQuestion()
		.clickonSecurityQuestionOptions("What is your pet name?")
		.enterSecrityAnswer("Brucy")
		.clickonContinue()
		.waitProperty(3000)
		.enterFirstname("Arun")
		.enterMiddleName("S R")
		.enterLastname("Kanna")
		.clickOnOccupation()
		.clickOnOccupationOption("PROFESSIONAL")
		.enterDOB("11-11-1994")
		.clickOnMartialStatus("Unmarried")
		.selectCountry("India")
		.clickonGender("Male")
		.enterEmail("arunkanna40@gmail.com")
		.enterMobile("9710428884")
		.selectNationality("India")
		.clickonContinue()
		.enterFlat("15 Pyraid")
		.enterStreet("Dhanalakshmi nagar")
		.enterArea("Kolathur")
		.enterPincode("600099")
		.waitProperty(4000)
		//.clickonTab()
		.enterState("tamil Nadu")
		.selectbyCity("Tiruvallur")
		.selectbyPostoffice("Kolathur S.O")
		.enterPhone("9710428848")
		.clickonOfficeAddress("No")
		.enterOfficeFlat("18")
		.enterOfficeStreet("Fhanala nagarr")
		.enterOfficesArea("Perambur")
		
		//.clickonCountry()
		//.clickonCountryValue()
		.waitProperty(3000)
		.enterOfficePinCode("600099")
		.waitProperty(3000)
		.enterOfficeState("Tamil Nadu")
		
		.enterbyOfficeCity("Chennai")
		.waitProperty(3000)
		.enterbyPostOffice("Kolathur S.O")
		.enterOfficePhone("9710458544");
		//.waitProperty(3000)
		//.clickOnTermsandConditions()
		//.waitProperty(3000)
		//.clickonRegister();
		
		
}	
}



