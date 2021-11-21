package pom.onlinevisa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		 testCaseName="TC008";
		 testCaseDescription="To verify OnlineVisa Registration for the new user";
		 author="Arun Kanna";
		 category="Smoke";
		 browserName="chrome";
		 appName = "Online Visa";
	}
	@Test
	
	public void PersonalInfoPage() {
		
		new pom.onlinevisa.page.PersonalInfoPage().
		enterbyGivenName("Arun Kanna")
		.enterbySurName("K")
		.enterbyFullName("Arun Kanna ")
		.clickonOtherNames()
		.enterbyOtherSurNames("Kanna")
		.waitProperty(3000)
		.enterbyOtherGivenNames("Arun Kana abi")
		.enterbyEmail("arunkanna40@gmail.com")
		.enterbyConfirmEmail("arunkanna40@gmail.com")
		.clickbyAdditionalEmailAddress("additional-email-Yes")
		.enterByAdditionalEmailAddress("arunkanna400@gmail.com")
		.clickbyGender("gender-Male")
		.waitProperty(300)
		.clickbyDate()
		.selectbyYear("1994")
		.selectbyMonth("11")
		.selectbyDate()
		.enterbyCity("Chennai")
		.enterbyState("Tamil Nadu")
		.selectbyCountry1("India")
		.selectbyOriginCountry("India")
		.clickbyResidentCountry()
		.selectbyResidentcountry("India")
		.clickbyNext()
		.waitProperty(4000)
		.enterbyStreet("15")
		.enterbyStreet2("Pyramid aprts")
		.enterbyCity1("Chennai")
		.enterbyState1("Tamil Nadu")
		.enterbyPincode("600099")
		.clickbyPhonecode()
		.enterbyPhonnumber("9710428848")
		.selectbyCountry("India")
		.selectbyTerritory("India")
		.clickbyMail()
		.clickbyNext1()
		.waitProperty(4000)
		.enterbyLanguages("English")
		.clickonNoTribe()
		.selectMaritalStatus("Single")
		.selectUStrip("")
		.enterbyEmbassy("")
		.selectLanguage("")
		.ClickonTerms()
		.ClickonNext();
	
	
	
	
	
	
	
	}
	}

