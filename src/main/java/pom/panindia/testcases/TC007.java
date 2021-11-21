package pom.panindia.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

@Test
public class TC007 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		 testCaseName="TC007";
		 testCaseDescription="To verify PanIndia Registration for the new user";
		 author="Arun Kanna";
		 category="Smoke";
		 browserName="chrome";
		 appName = "PanIndia";
	}
	
	public void RegistrationPage() {
		
		new pom.panindia.page.RegistrationPage()
		.selectontitle("MR.")
		.enterbyFirstname("Arun")
		.enterbyLastname("Kanna")
		.enterbyFatherfirstname("Rangam")
		.enterFatherLastname("Kalyani")
		.enterbyMobile("9714428848")
		.enterbyemail("arunkanna40@gmail.com")
		.selectonIncome("Salary")
		.clickonOffice("office")
		.enterbyDOB("11111994")
		.scrollbyMouseWheel()
		//.scrolByPageDown()
		.waitProperty(3000)
		.enterHouseNo("15 Pyramid")
		.scrollbyMouseWheel()
		//.scrolByPageDown()
		.enterbyArea("Kolathur")
		//.scrolByPageDown()
		.waitProperty(3000)
		.enterbyCity("Chennai")
		.selectbyState("Tamil Nadu")
		.enterbyPincode("600099")
		.selectonCountry("INDIA")
		.enterbyOfficeName("Virtusa")
		.enterbyOfficeAddress("DLF")
		.enterbyOfficeCity("CHENNAI")
		.scrolByPageDown()
		.selectonOfficeState("Tamil Nadu")
		.enterbyOfficePincode("600099")
		.selectonOfficeCountry("INDIA")
		.scrollbyMouseWheel()
		//.scrolByPageDown()
		.selectonIdentityProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectonAddressProof("Driving License (In Copy)")
		.selectonDOBProof("Domicile certificate issued by Government (In Copy)")
		.selectonAadharProof("Copy of Aadhaar Card / Letter")
		.selectonOffAddressProof("Depository Account Statement carrying Office Address")
		.clickonTerms();
	}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


