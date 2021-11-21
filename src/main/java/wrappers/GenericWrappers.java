package wrappers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {

	public  RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadobjects() {
		
	 prop = new Properties();
		try {
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void unloadobjects() {
		
		
		
		
	}
	int i = 1;
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
				
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			}else if (browser.equalsIgnoreCase("internet explorer")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
				
			}
			
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//System.out.println("The given browser "+browser+" has launched with the given url "+url+" successfully");
			reportStep("The given browser "+browser+" has launched with the given url "+url+" successfully", "pass");
			
		} catch ( SessionNotCreatedException  e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" has not launched due to session not create error");
			reportStep("The browser "+browser+" has not launched due to session not create error", "fail");
		}catch ( InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser"+browser+" has not launched due to URL doesn't contain any http/https");
			reportStep("The browser "+browser+" has not launched due to URL doesn't contain any http/https", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("the browser"+browser+" has not launched due to unknown error");
			reportStep("The browser "+browser+" has not launched due to unknown error", "fail");	
		}
		
	}
	
	

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			
			//System.out.println("The element "+idValue+" with  "+data+" is entered");
			reportStep("The element "+idValue+" with  "+data+" is entered", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element "+idValue+" with   "+data+" does not exist");
			reportStep("The element "+idValue+" with   "+data+" does not exist", "fail");
		}catch (ElementNotVisibleException e) {
 			//System.err.println("The element "+idValue+" with  "+data+" is not visible");
 			reportStep("The element "+idValue+" with  "+data+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The element "+idValue+" with "+data+"is not interactable");
			reportStep("The element "+idValue+" with "+data+"is not interactable", "fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element "+idValue+" with "+data+" is not stable");
			reportStep("The element "+idValue+" with "+data+" is not stable", "fail");
			// TODO: handle exception
		}catch (WebDriverException e) {
			//System.err.println("The element "+idValue+" with  "+data+" is stopped due to unknown error");
			reportStep("The element "+idValue+" with  "+data+" is stopped due to unknown error", "fail");
			// TODO: handle exception
		}
			
		}
		
		
		
	

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name value "+nameValue+" with the data value " +data);
			reportStep("The element with name value "+nameValue+" with the data value", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name value "+nameValue+" does not exist" );
			reportStep("The element with name value "+nameValue+" does not exist", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name value "+nameValue+" is not visible" );
			reportStep("The element with name value "+nameValue+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name value "+nameValue+" is not interactable");
			reportStep("The element with name value "+nameValue+" is not interactable", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name value "+nameValue+"is not stable");
			reportStep("The element with name value "+nameValue+"is not stable", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error" );
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error", "fail");
		}
		
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("the element with xpath value"+xpathValue+"with the data value"+data+" has successfully entered");
			reportStep("the element with xpath "+xpathValue+" with the data value "+data+" has successfully entered", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpathvalue "+xpathValue+" does not exist");
			reportStep("The element with xpathvalue "+xpathValue+" does not exist", "fail");
		}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with xpathvalue "+xpathValue+" is not visible");
				reportStep("The element with xpathvalue "+xpathValue+" is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpathvalue "+xpathValue+" is not interactable");
			reportStep("The element with xpathvalue "+xpathValue+" is not interactable", "fail");
		}catch(StaleElementReferenceException e) {
			// TODO: handle exception{
		//System.err.println("The element with xpathvalue "+xpathValue+" is not stable");
		reportStep("The element with xpathvalue "+xpathValue+" is not stable", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpathvalue "+xpathValue+" has not entered due to unknown error");
			reportStep("The element with xpathvalue "+xpathValue+" has not entered due to unknown error", "fail");
				
		}
		
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		
		try {
			String actualTitle  = driver.getTitle();
			if(title.equals(actualTitle)) {
				//System.out.println("The  title "+title+"matches with the given text "+actualTitle+"");
				reportStep("The  title "+title+"matches with the given text "+actualTitle+"", "pass");
			}else {
				//System.err.println("The title "+title+ "does not match with the given text "+actualTitle+"");
				reportStep("The title "+title+ "does not match with the given text "+actualTitle+"", "fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title"+title+" of the page is not verified due to unknown error");
			reportStep("The title "+title+" of the page is not verified due to unknown error", "fail");
		}
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
		
		try {
			String giventext =	driver.findElementById(id).getText();
			if(giventext.equals(text)) {
				//System.out.println("The element with id "+id+" is holding the text "+giventext+" is matched with the text"+text+"");
				reportStep("The element with id "+id+" is holding the text "+giventext+" is matched with the text "+text+"", "pass");
			}else	{
				//System.err.println("The element with id "+id+" is not holding the text "+giventext+" is matched with the text"+text+"");
				reportStep("The element with id "+id+" is not holding the text "+giventext+" is matched with the text "+text+"", "fail");
			}
		}catch (NoSuchElementException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+id+" is not verified because of no such element existance");
			reportStep("The element with id "+id+" is not verified because of no such element existance", "fail");
		}catch (ElementNotVisibleException e) {
				// TODO: handle exception
			//System.err.println("The element with "+id+" is not visible to verify");
			reportStep("The element with "+id+" is not visible to verify", "fail");
		}catch (ElementNotInteractableException e) {
				// TODO: handle exception
			//System.err.println("The element with "+id+" is not interactable to verify");
			reportStep("The element with "+id+" is not interactable to verify", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("the element "+id+" is not stable to verify");
			reportStep("the element "+id+" is not stable to verify", "fail");
		} catch (WebDriverException e) {
			
			// TODO Auto-generated catch block
			//System.err.println("The given text "+id+" has not verified due to unknown error");
			reportStep("The given text "+id+" has not verified due to unknown error", "fail");
		}
			
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			if(actualtext.equals(text)) {
				//System.out.println("The element with"+xpath+" with the given text"+actualtext+" matches with the text"+text+"");
				reportStep("The element with Xpath "+xpath+" with the given text "+actualtext+" matches with the text "+text+"", "pass");
			}else 
				//System.err.println("The element with"+xpath+" with the given text"+actualtext+" does not matches with the text"+text+"");
				reportStep("The element with Xpath "+xpath+" with the given text "+actualtext+" does not matches with the text "+text+"", "fail");
			
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The text"+xpath+" is not verified due to unknown error");
			reportStep("The text with Xpath   "+xpath+ " is not verified due to unknown error", "fail");
		}
		
		
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			if(actualtext.contains(text)) {
				//System.out.println("The element with xpath"+xpath+" with the  entered text"+actualtext+" has some of the value in"+text+"");
				reportStep("The element with xpath "+xpath+" with the  entered text "+actualtext+" has some of the value in "+text+"", "pass");
			}else {
				//System.err.println("The element with xpath"+xpath+" with the entered text"+actualtext+" does not contain any values in"+text+"");
				reportStep("The element with xpath "+xpath+" with the entered text "+actualtext+" does not contain any values in "+text+"", "fail");
			}
		}catch (NoSuchElementException e) {
				// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified because of no such element existance");
			reportStep("The element with xpath "+xpath+" is not verified because of no such element existance", "fail");
		}catch (ElementNotVisibleException e) {
				// TODO: handle exception
			//System.err.println("The element with xpath"+xpath+" is not visible to verify");
			reportStep("The element with xpath "+xpath+" is not visible to verify", "fail");
		}catch (ElementNotInteractableException e) {
				// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable to verify");
			reportStep("The element with xpath "+xpath+" is not interactable to verify", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("the element with xpath "+xpath+" is not stable to verify");
			reportStep("the element with xpath "+xpath+" is not stable to verify", "fail");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The given text "+xpath+" has not verified due to unknown error");
			reportStep("The given text "+xpath+" has not verified due to unknown error", "fail");
		}
	}
	
	
	

	public void clickById(String id) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(id).click();
			//System.out.println("The element "+id+" has been clicked successfully");
			reportStep("The element "+id+" has been clicked successfully", "pass");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element "+id+" is not available to click");
			reportStep("The element "+id+" is not available to click", "fail");
		
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element "+id+ "is not clickable ");
			reportStep("The element "+id+" is not clickable", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element "+id+" is not visible to click");
			reportStep("The element "+id+" is not visible to click", "fail");
		}catch ( ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element "+id+" is not selectable to click");
			reportStep("The element "+id+" is not selectable to click", "fail");
		}catch ( StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element "+id+ " is not stable to click");
			reportStep("The element "+id+" is not stable to click", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element "+id+" is not clickable due to unknwon error");
			reportStep("The element "+id+" is not clickable due to unknwon error", "fail");
		}
		
		
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element"+classVal+" is clicked succesfully");
			reportStep("The element "+classVal+" is clicked succesfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element"+classVal+"is not available to click");
			reportStep("The element "+classVal+" is not available to click", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element"+classVal+" is not clickable");
			reportStep("The element "+classVal+" is not clickable", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element"+classVal+" is not selectable to click");
			reportStep("The element "+classVal+" is not selectable to click", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element"+classVal+" is not interactable to click");
			reportStep("The element "+classVal+" is not interactable to click", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element"+classVal+" is not stable to click");
			reportStep("The element "+classVal+" is not stable to click", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element"+classVal+" is not clickable due to unknown error");
			reportStep("The element "+classVal+" is not clickable due to unknown error", "fail");
		}
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element"+name+" is successfully clicked");
			reportStep("The element "+name+" is successfully clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element"+name+" is not available to click");
			reportStep("The element "+name+" is not available to click", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element"+name+" is not intercepted to click");
			reportStep("The element "+name+" is not intercepted to click", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element"+name+" is not interactable to click");
			reportStep("The element "+name+" is not interactable to click", "fail");
		
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element"+name+" is not selectable to click");
			reportStep("The element "+name+" is not selectable to click", "fail");
		}catch (StaleElementReferenceException e) {
				// TODO: handle exception
			//System.err.println("The element"+name+" is not stable to click");
			reportStep("The element "+name+" is not stable to click", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element"+name+" is not clickable due to unknwon error");
			reportStep("The element "+name+" is not clickable due to unknwon error", "fail");
		
		}
		
	}
	
	
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element"+name+"is successfully clicked");
			reportStep("The element "+name+" is successfully clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element"+name+" is not available to click");
			reportStep("The element "+name+" is not available to click", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element"+name+" is not intercepted to click");
			reportStep("The element "+name+" is not intercepted to click", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element"+name+" is not interactable to click");
			reportStep("The element "+name+" is not interactable to click", "fail");
		
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element "+name+" is not selectable to click");
			reportStep("The element "+name+" is not selectable to click", "fail");
		}catch (StaleElementReferenceException e) {
				// TODO: handle exception
			//System.err.println("The element"+name+" is not stable to click");
			reportStep("The element "+name+" is not stable to click", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element"+name+" is not clickable due to unknwon error");
			reportStep("The element "+name+" is not clickable due to unknwon error", "fail");
		
		}
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("the element"+name+" is successfully clicked");
			reportStep("the element "+name+" is successfully clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element"+name+" is not available to click");
			reportStep("The element "+name+" is not available to click", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element"+name+" is not intercepted to click");
			reportStep("The element "+name+" is not intercepted to click", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element"+name+" is not interactable to click");
			reportStep("The element "+name+" is not interactable to click", "fail");
		
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element"+name+" is not selectable to click");
			reportStep("The element "+name+" is not selectable to click", "fail");
		}catch (StaleElementReferenceException e) {
				// TODO: handle exception
			//System.err.println("The element"+name+" is not stable to click");
			reportStep("The element "+name+" is not stable to click", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element"+name+" is not clickable due to unknwon error");
			reportStep("The element "+name+" is not clickable due to unknwon error", "fail");
		
		}
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is successfully clicked");
			reportStep("The element with xpath "+xpathVal+" is successfully clicked", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not clickable because of no such element present in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not clickable because of no such element present in the DOM", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable because of element is intercepted by other elements");
			reportStep("The element with xpath "+xpathVal+" is not clickable because of element is intercepted by other elements", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable to click");
			reportStep("The element with xpath "+xpathVal+" is not interactable to click", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not selectable to click");
			reportStep("The element with xpath "+xpathVal+" is not selectable to click", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable to click");
			reportStep("The element with xpath "+xpathVal+" is not stable to click", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable due to unknwon error");
			reportStep("The element with xpath "+xpathVal+" is not clickable due to unknwon error", "fail");
		}
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element"+xpathVal+" is successfully clicked");
			reportStep("The element with Xpath "+xpathVal+" is successfully clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element"+xpathVal+" is not clickable because of no elements");
			reportStep("The element with Xpath "+xpathVal+" is not clickable because of no elements", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element"+xpathVal+" is not clickable because of element is in obscured way ");
			reportStep("The element with Xpath "+xpathVal+" is not clickable because of element is in obscured way", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element"+xpathVal+" is not interactable to click");
			reportStep("The elementwith Xpath "+xpathVal+" is not interactable to click", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element"+xpathVal+" is not selectable to click");
			reportStep("The element with Xpath "+xpathVal+" is not selectable to click", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element"+xpathVal+" is not stable to click");
			reportStep("The element with Xpath "+xpathVal+" is not stable to click", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element"+xpathVal+" is not clickable due to unknwon error");
			reportStep("The element with Xpath "+xpathVal+" is not clickable due to unknwon error", "fail");
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text =null;
		try {
			 text = driver.findElementById(idVal).getText();
			//System.out.println("The value of the"+idVal+" is "+text+"");
			reportStep("The value of the "+idVal+" is "+text+"", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The value of the "+idVal+" is not stored because of no such element present");
			reportStep("The value of the "+idVal+" is not stored because of no such element present", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element "+idVal+" is not stored because the element is not visible");
			reportStep("The element "+idVal+" is not stored because the element is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element"+idVal+" is not Stored because the element is not interactable");
			reportStep("The element "+idVal+" is not Stored because the element is not interactable", "fail");
		}catch (StaleElementReferenceException e) {
				// TODO: handle exception
			//System.err.println("The element"+idVal+" is not stable to get");
			reportStep("The element "+idVal+" is not stable to get", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element"+idVal+" is not stored because of the unknown error");
			reportStep("The element "+idVal+" is not stored because of the unknown error", "fail");
			
		}
		
		
		
		return text;
	}

	
	
	
	
	
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		String actualtext = xpathVal;
		try {
			actualtext = driver.findElementByXPath(xpathVal).getText();
			
			//System.out.println("The element "+xpathVal+" value is "+actualtext+"");
			reportStep("The element "+xpathVal+" value is "+actualtext+"", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The value of the "+xpathVal+" is not stored because of no such element present");
			reportStep("The value of the Xpath element  "+xpathVal+" is not stored because of no such element present", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element "+xpathVal+" is not stored because the element is not visible");
			reportStep("The element Xpath "+xpathVal+" is not stored because the element is not visible", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element"+xpathVal+" is not Stored because the element is not interactable");
			reportStep("The element Xpath "+xpathVal+" is not Stored because the element is not interactable", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element"+xpathVal+" is not stable to store");
			reportStep("The element Xpath "+xpathVal+" is not stable to store", "fail");
			
		}catch (WebDriverException e) {
			//System.err.println("The element"+xpathVal+" is not stored because of the unknown error");
			reportStep("The element Xpath "+xpathVal+" is not stored because of the unknown error", "fail");
		}
		
				
		return actualtext;
	}
	
	
	
	
	

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementById(id);
			Select sel1 = new Select(text);
			sel1.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" has been selected with the value "+value+"");
			reportStep("The element with id "+id+" has been selected with the value "+value+"", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with "+id+" is not availble in the DOM");
			reportStep("The element with id value "+id+" is not availble in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element"+id+" is not visible");
			reportStep("The element with ID value "+id+" is not visible", "fail");
		}catch ( ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element"+id+" is not interactable");
			reportStep("The element with ID value "+id+" is not interactable", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element"+id+" is not stable to select");
			reportStep("The element with ID value "+id+ " is not stable to select", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element is not selectable due to unknown error");
			reportStep("The element is not selectable due to unknown error", "fail");
		}
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement selectindex = driver.findElementById(id);
			Select ind1 =new Select(selectindex);
			ind1.selectByIndex(value);
			//System.out.println("The element id"+id+" with option value"+value+" selected successfully");
			reportStep("The element with ID value "+id+" with option value "+value+" selected successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element id"+id+" is not present to select");
			reportStep("The element id with ID value "+id+" is not present to select", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element id"+id+" is not visible to select");
			reportStep("The element id with ID value "+id+" is not visible to select", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element id "+id+" is not interactable to select");
			reportStep("The element id with ID value "+id+" is not interactable to select", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element id"+id+" is not selectable");
			reportStep("The element id with ID value "+id+" is not selectable", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element"+id+" is not stable to select");
			reportStep("The element Id with ID value "+id+" is not stable to select", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element id"+id+" is not selectable due to unknown error");
			reportStep("The element id with ID value  "+id+" is not selectable due to unknown error", "fail");
		}
	}
	
		public void selectbyvalue(String id, String value) {
			
			try {
				WebElement title = 	driver.findElementByName(id);
				Select sel4 = new Select(title);
				
				sel4.selectByValue(value);
				//System.out.println("The element "+id+" has successfully selected with "+title+"");
				reportStep("The element Id value with "+id+" has successfully selected with "+title+"", "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element id "+id+" is not present to select");
				reportStep("The element Id value with "+id+" is not present to select", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element id "+id+" is not visible to select");
				reportStep("The element Id value with "+id+" is not visible to select", "fail");
			}catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element id "+id+" is not interactable to select");
				reportStep("The element Id value with "+id+" is not interactable to select", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element id "+id+" is not selectable");
				reportStep("The element Id value with "+id+" is not selectable", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element "+id+" is not stable to select");
				reportStep("The element Id value with "+id+" is not stable to select", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element id "+id+" is not selectable due to unknown error");
				reportStep("The element Id value with "+id+" is not selectable due to unknown error", "fail");
		
			}
	}
		
		
		public void selectvaluebyxpath(String xpath, String value) {
			
			try {
				WebElement select = driver.findElementByXPath(xpath);
				Select sel2 = new Select(select);
				
				sel2.selectByValue(value);
				reportStep("The element with xpath "+xpath+" has successfully selected with the value "+value+"", "pass");
			} 
			catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with "+id+" is not availble in the DOM");
				reportStep("The element with "+xpath+" is not availble in the DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element"+id+" is not visible");
				reportStep("The element "+xpath+" is not visible", "fail");
			}catch ( ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element"+id+" is not interactable");
				reportStep("The element "+xpath+" is not interactable", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element"+id+" is not stable to select");
				reportStep("The element "+xpath+" is not stable to select", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element is not selectable due to unknown error");
				reportStep("The element is not selectable due to unknown error", "fail");
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
			public void selectvaluebyclassname(String Classname, String Value) {
				
				try{
					WebElement select = driver.findElementByClassName(Classname);
				
				Select sel3 = new Select(select);
				
				sel3.selectByValue(Value);
				
				reportStep("The element with xpath "+Classname+" has successfully selected with the value "+Value+"", "pass");
				
			}catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with "+id+" is not availble in the DOM");
				reportStep("The element with "+Classname+" is not availble in the DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element"+id+" is not visible");
				reportStep("The element "+Classname+" is not visible", "fail");
			}catch ( ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element"+id+" is not interactable");
				reportStep("The element "+Classname+" is not interactable", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element"+id+" is not stable to select");
				reportStep("The element "+Classname+" is not stable to select", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element is not selectable due to unknown error");
				reportStep("The element is not selectable due to unknown error", "fail");
			}
			
			}	
		

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
		
		try {		
			Set<String> alwinid1 = driver.getWindowHandles();
			for(String eachwinid : alwinid1) {
				driver.switchTo().window(eachwinid);
				break;
				
			}
			//System.out.println("The window has switched to parent window successfully");
			reportStep("The window has switched to parent window successfully", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The window has not switched as there is no window to switch");
			reportStep("The window has not switched as there is no window to switch", "fail");
		}catch (NoSuchSessionException e) {
			// TODO: handle exception
			//System.err.println("Window is not switched since there is no session");
			reportStep("Window is not switched since there is no session", "fail");
		}catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("Window is not switched since the session is not created");
			reportStep("Window is not switched since the session is not created", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
		//System.err.println("the woindow has not switched due to unknow error");
		reportStep("the woindow has not switched due to unknow error", "fail");
		}
		
	}
	
	

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
		try {
			Set<String> winID = driver.getWindowHandles();
			for(String eachwinId : winID) {
				driver.switchTo().window(eachwinId);
			}
			//System.out.println("The window has switched to last window successfully");
			reportStep("The window has switched to last window successfully", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The window has not swithcced since there is no such window to switch");
			reportStep("The window has not swithcced since there is no such window to switch", "fail");
		}catch (NoSuchSessionException e) {
				// TODO: handle exception
				//System.err.println("Window is not switched since there is no session");
				reportStep("Window is not switched since there is no session", "fail");
		}catch (SessionNotCreatedException e) {
				// TODO: handle exception
				//System.err.println("Window is not switched since the session is not created");
				reportStep("Window is not switched since the session is not created", "fail");
		}catch (WebDriverException e) {
				// TODO: handle exception
		//System.err.println("The window is not switched due to unknown error");
		reportStep("The window is not switched due to unknown error", "fail");
	
		}
	}
		
		
	

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert has accepted successfully");
			reportStep("The alert has accepted successfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert has not accepted because no alert is present to accept");
			reportStep("The alert has not accepted because no alert is present to accept", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert has not accepted due to unnown error");
			reportStep("The alert has not accepted due to unnown error", "fail");
		}
		
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert text has been dismissed successfully");
			reportStep("The alert text has been dismissed successfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert has not dismissed because no alert is present to dismiss");
			reportStep("The alert has not dismissed because no alert is present to dismiss", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert has not dismissed due to unknown error");
			reportStep("The alert has not dismissed due to unknown error", "fail");
		}
		
				
		
	}

	public String getAlertText() 
	{
		// TODO Auto-generated method stub
		String alert = null;
		try {
			
			 alert = driver.switchTo().alert().getText();
			//System.out.println("The alert text is "+alert+"");
			reportStep("The alert text is \"+alert+\"", "pass");
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The alert text"+alert+" is not present in the DOM");
			reportStep("The alert text\"+alert+\" is not present in the DOM", "fail");
			
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert text cannot be retrieved due to unknwon error");
			reportStep("The alert text cannot be retrieved due to unknwon error", "fail");
		}
			return alert;
			
	
	}	
		
	

	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number = 0;
		try {
			
			number = (long) Math.floor(Math.random()*100000000)+100000;
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./reports/screenshots/"+number+".png");
			
			FileUtils.copyFile(tmp, dest);
			
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}catch (Throwable e) {
			
			reportStep("Unab;e to take  screenshot due to unknown error", "Fail");
		}
	
		
		
		return number;
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The current browser has been closed successfully");
			reportStep("The current browser has been closed successfully", "pass", false);
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no such window to close");
			reportStep("There is no such window to close", "fail",false);
		}catch (Exception e) {
			// TODO: handle exception
		//System.err.println("The browser is not closed due to unknown error");
		reportStep("The browser is not closed due to unknown error", "fail",false);
		}
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("The browsers have closed successfully");
			reportStep("The browsers have closed successfully", "pass",false);
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser is not closed because of no such window exists");
			reportStep("The browser is not closed because of no such window exists", "fail",false);
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is not closed due to unknown error");
			reportStep("The browser is not closed due to unknown error", "fail",false);
		}
		
		
		
	}








public void waitproperty(long time) {
	// TODO Auto-generated method stub
	 try {
			Thread.sleep(time);
			reportStep("Wait property is successful", "pass");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The system cannot wait due to uninterrupted exception");
			reportStep("The system cannot wait due to uninterrupted exception", "fail");
			
		}
}








public void pagescrollbyxpath() {
	
	try {
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		
		//System.out.println("the page scrolled successfully");
		reportStep("The page scrolled successfully with Xpath //html/body", "pass");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		reportStep("cannot scroll down the page", "fail");
	}
	
	
//public void mouseHoverByXPath(String data) {
	
	
	
}



public void selectVisibleTextByXpath(String Xpath, String textvalue) {
	// TODO Auto-generated method stub
	try {
		WebElement ele =driver.findElementByXPath(Xpath);
		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText(textvalue);
		
		reportStep("The element with xpath "+Xpath+" has been successfully selected with "+textvalue+" ", "pass");
		
	} 	catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with "+id+" is not availble in the DOM");
		reportStep("The element with Xpath "+Xpath+" is not availble in the DOM", "fail");
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The element"+id+" is not visible");
		reportStep("The element with Xpath "+Xpath+" is not visible", "fail");
	}catch ( ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The element"+id+" is not interactable");
		reportStep("The element with Xpath "+Xpath+" is not interactable", "fail");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element"+id+" is not stable to select");
		reportStep("The element with Xpath "+Xpath+" is not stable to select", "fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element is not selectable due to unknown error");
		reportStep("The element is not selectable due to unknown error", "fail");
	}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}



public void mousehoverbyXpath(String Xpath,WebElement value1, WebElement value2) {
	// TODO Auto-generated method stub
	
	try {
		Actions builder = new Actions(driver);
		WebElement ele = driver.findElementByXPath(Xpath);
		builder.moveToElement(ele).perform();
		builder.moveToElement(value1).perform();
		builder.moveToElement(value2).perform();
		builder.click(value2).perform();
		
		reportStep("The element xpath "+Xpath+" has been successfully mousehovered", "pass");
	} 	catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with "+id+" is not availble in the DOM");
		reportStep("The element with Xpath "+Xpath+" is not availble in the DOM", "fail");
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The element"+id+" is not visible");
		reportStep("The element with Xpath "+Xpath+" is not visible", "fail");
	}catch ( ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The element"+id+" is not interactable");
		reportStep("The element with Xpath "+Xpath+" is not interactable", "fail");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element"+id+" is not stable to select");
		reportStep("The element with Xpath "+Xpath+" is not stable to select", "fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element is not selectable due to unknown error");
		reportStep("The element is not selectable due to unknown error", "fail");
	}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}


public void mousehovereachByXpath(String Xpath) {
	
	try {
		Actions builder = new Actions(driver);
		
		WebElement ele = driver.findElementByXPath(Xpath);
		builder.moveToElement(ele).perform();
		builder.click(ele).perform();
		
		reportStep("The element xpath "+Xpath+" has been successfully mousehovered", "pass");
		
	} 	catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with "+id+" is not availble in the DOM");
		reportStep("The element with Xpath "+Xpath+" is not availble in the DOM", "fail");
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The element"+id+" is not visible");
		reportStep("The element with Xpath "+Xpath+" is not visible", "fail");
	}catch ( ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The element"+id+" is not interactable");
		reportStep("The element with Xpath "+Xpath+" is not interactable", "fail");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element"+id+" is not stable to select");
		reportStep("The element with Xpath "+Xpath+" is not stable to select", "fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element is not selectable due to unknown error");
		reportStep("The element is not selectable due to unknown error", "fail");
	}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void FileUpload() {
	
	Clipboard fileupload = Toolkit.getDefaultToolkit().getSystemClipboard();
	
	StringSelection str = new StringSelection("C:\\Resumes\\ArunKannaAutomation");
	fileupload.setContents(str, null);
	
	try {
		Robot rbt = new Robot();
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_CANCEL);
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}

@Override
public void waitproperty() {
	// TODO Auto-generated method stub
	
}

	public void clickonTabKey() {
		
		try {
			Robot rbt = new Robot();
			
			rbt.keyPress(KeyEvent.VK_TAB);
			rbt.keyRelease(KeyEvent.VK_TAB);
			reportStep("The event for press and Release for Tab Key is succesful", "pass");
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			reportStep("The event for press and Release for Tab Key is unsuccessful", "fail");
		}
	}
public void scrollbyMouse() {
		
		try {
			Robot rbt = new Robot();
			
			rbt.mouseWheel(1);
			reportStep("The event for mouse scroll is successful", "pass");
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			reportStep("The event for mouse scroll is unsuccessful", "fail");
		}
	}


}




	

	
//public void selectVisibleTextbyxpath1(String data)
	



