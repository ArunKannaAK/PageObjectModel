package pom.irctc.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers{

	public CovidAlertPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		
	}
	
	public IrctcHomePage clickOnOK() {
		clickByXpath("//button[@class='btn btn-primary']");
		return new IrctcHomePage(driver,test);
		
	}
	
	public CovidAlertPage waitProperty(long time) {
		waitproperty(time);
		return this;
	}
	
	
	
	
	
	
	
}
