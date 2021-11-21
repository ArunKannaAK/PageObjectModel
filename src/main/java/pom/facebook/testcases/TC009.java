package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.page.LoginPage;
import wrappers.ProjectWrappers;

@Test
public class TC009 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To verify Facebook Registration for the new user";
		author="Arun Kanna";
		category="Smoke";
		browserName="chrome";
		appName="facebook";
	}
	
	public void LoginPage() {
		
		new LoginPage()
		.clickonEnglish("English (UK)")
		.clickonCreateNewAccount()
		.enterbyFistname("Arun")
		.enterbyLastName("Kanna")
		.enterbyemail("arunkanna40@gmail.com")
		.enterbyConfirmEmail("arunkanna40@gmail.com")
		.enterbyPassword("Seltos@123")
		.selectonDayvalue("11")
		.selectonMonthvalue("11")
		.selectonYearvalue("1994")
		.clickonGender("2")
		.clickonSignup();
		
	
	
	
	
	
	
	}
	

}
