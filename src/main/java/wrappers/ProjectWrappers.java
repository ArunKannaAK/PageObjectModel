package wrappers;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectWrappers extends GenericWrappers{

	public String browserName;
	
	public String appName;
	
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}
	
	@BeforeTest
	public void beforeTest() {
		//reserved
		
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		
		startTest(testCaseName, testCaseDescription);
		
		switch (appName) {
		case "IRCTC":
			invokeApp(browserName, "https://www.irctc.co.in");	
			break;
		case "facebook":
			invokeApp(browserName, "https://www.facebook.com");	
			break;
		case "PanIndia":
			invokeApp(browserName, "https://www.panind.com/india/new_pan");
			break;
		case "PhpTravels":
			invokeApp(browserName, "https://www.phptravels.org/register.php");
			break;
		case "IndianFro":
			invokeApp(browserName, "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
			break;
		case "Online Visa":
			invokeApp(browserName, "https://www.onlineusvisa.com/basic-details/in?origin=home&country=in&type=N#");
			break;
		case "BookYourCoach":
			invokeApp(browserName, "https://www.irctc.co.in");
		
		default:
			break;
		}
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass() {
		endTest();
	}
	
	@AfterTest
	public void afterTest() {
		// reserved
	}
	
	@AfterSuite
	public void afterSuite() {
		endReport();
	}
	
	
}
