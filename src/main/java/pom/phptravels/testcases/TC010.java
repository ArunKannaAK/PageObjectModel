package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

@Test
public class TC010 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		 testCaseName="TC010";
		 testCaseDescription="To verify PHP travels Registration for the new user";
		 author="Arun Kanna";
		 category="Smoke";
		 browserName="chrome";
		 appName = "PhpTravels";
	}
	
	
	public void RegistrationPage() {
		
		new pom.phptravels.page.RegistrationPage()
		.enterbyFirstName("Arun")
		.enterbyLastName("Kanna")
		.enterbyEmail("arunkanna40@gmailcom")
		.enterbyPhone("9710428848")
		.enterbyCompany("Office")
		.enterbyStreet1("15")
		.enterbyStreet2("Pyramid")
		.enterbyCity("chennai")
		.enterbyState("Tamil Nau")
		.enterbyPostcode("600099")
		
		.selectbyCountry("India")
		.enterbyMobile("9710428848")
		.enterbyPassword("Seltos@123")
		.enterbyConfirmPassword("Seltos@123")
		.clickonRegister();
		
		
	}
	
	
	
	
}
