package pom.indianfro.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.indianfrro.page.FormCRegistrationPage;
import wrappers.ProjectWrappers;


@Test
public class TC006 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		 testCaseName="TC006";
		 testCaseDescription="To verify Indianfro Registration for the new user";
		 author="Arun Kanna";
		 category="Smoke";
		 browserName="chrome";
		 appName = "IndianFro";
	}
	
	
	
	public void FormCregistration() {
		
		new FormCRegistrationPage()
		.clickonSignUp()
		.enterbyUserID("Arunkanna11")
		.enterbyPassword("Seltos@123")
		.enterbyConfirmPassword("Seltos@123")
		.selectbySecurityQuestion("What is the name of the street where you grew up?")
		.enterbyAnswer("normal Street")
		.enterbyName("ArunKanna 11")
		.selectbyGender("Male")
		.clickbyDOB()
		.enterbyDesignation("Office")
		.enterbyEmailid("arunkanna40@gmail.com")
		.enterbyMobile("9710428848")
		.enterbyPhone("971048848")
		.selectonNationality("IND")
		.enterbyName1("Michael")
		.enterbyCapacity("5")
		.enterbyAddress("15 aprts")
		.selectonState("TAMIL NADU")
		.waitProperty(5000)
		.selectbycity("CHENNAI")
		.selectbyaccomodationtype("Guest House")
		.selectbyaccomodationgrade("Five Star")
		.enterbyEmaild1("arunkanna40@gmail.com")
		.enterbyMcontact("9787874584")
		.enterbyPhonenumber1("544546542")
		.enterbyGuestName("Chris gayle")
		.enterbyGuestAdddress("West indies")
		.selectbyGuestState("GOA")
		.waitProperty(3000)
		.selectbyGuestCity("GOA")
		.enterbyGuestEmail("michael@gmail.com")
		.clickbyAdd();
	
	
	
		
	}

}
