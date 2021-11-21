package pom.irctc.page;



import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHomePage extends GenericWrappers{

	
	public IrctcHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public IrctcHomePage mousehoveronHolidays() {
		
		mousehovereachByXpath("//a[normalize-space()='HOLIDAYS']");
		return this;
	}
	
	public IrctcHomePage mousehovronStays() {
	
		mousehovereachByXpath("//a[normalize-space()='Stays']");
		return this;
	
	}
	 public AccomodationPage mousehoveronLounge() {
		 
		 mousehovereachByXpath("//a[normalize-space()='Lounge']");
		 return new AccomodationPage();
		 
	 }
	
	 public IrctcHomePage waitProperty(long time) {
			waitproperty(time);
			return this;
		}
		
			
		
		
	 
	
	public IrctcRegistrationPage clickonRegister() {
		
		clickByXpath("//a[text()=' REGISTER ']");
		return new IrctcRegistrationPage(driver,test);
	}
	
	
	
	
	
		
		
		
}