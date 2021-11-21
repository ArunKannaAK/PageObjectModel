package pom.irctc.page;

import wrappers.GenericWrappers;

public class GSTHotelPage extends GenericWrappers {
		
		public GSTHotelPage clickonContinueToBook() {
			
			clickByXpath("//b[normalize-space()='Continue to Book']");
			return this;
			
		}
		
		public GSTHotelPage selectonTitle(String title) {
			
			selectVisibleTextByXpath("//select[@name='title']", title);
			return this;
			
		}
	
		
		
		public GSTHotelPage enterbyFirstName(String data) {
			
			enterByXpath("//input[@name='firstName']", data);
			return this;
		}
		
		public GSTHotelPage enterbyLastName(String data) {
			
			enterByXpath("//input[@name='lastName']", data);
			return this;
			
		}
		
		public GSTHotelPage selectbyCountry(String value) {
			
			selectVisibleTextByXpath("//select[@name='country']", value);
			return this;
			
		}
		 
		public GSTHotelPage selectbyState(String value) {
			
			selectVisibleTextByXpath("//select[@name='state']", value);	
			return this;
		}
		
		
		public GSTHotelPage enterbyMobileNumber(String data) {
			
			enterByXpath("//input[@placeholder='Mobile Number']", data);
			return this;
		}
		
		public GSTHotelPage scrollPageDown() {
			
			pagescrollbyxpath();
			return this;
		}
		public GSTHotelPage enterbyEmail(String data) {
			
			enterByXpath("//input[@placeholder='Email Id']", data);
			return this;
		}
		
		public GSTHotelPage selectbyGST(String value) {
			
			selectVisibleTextByXpath("//select[@name='gst']",value);
			return this;
			
		}
		
		public GSTHotelPage getHotelName() {
			
			getTextByXpath("//div[@class='mid-searchpack'][h5]");
			return this;
		}

		public GSTHotelPage enterbyCompanyName(String data) {
			
			enterByXpath("//input[@name='companyName']", data);
			return this;
		}
		
		public GSTHotelPage enterbyCompanyAddress(String data) {
			
			enterByXpath("//input[@name='companyAddress']", data);
			return this;
			
		}
		
		public GSTHotelPage clickonContinue() {
			
			clickByXpath("//button[text()='Continue']");
			return this;
		}
		
		public GSTHotelPage verifygstnumber(String text) {
			
			verifyTextByXpath("//span[text()='gstNumber is required.']", text);
			return this;
		}
		
		
		public GSTHotelPage switchtoLastWindow() {
			
			switchToLastWindow();
			return this;
		}
		
		public GSTHotelPage waitProperty(long time) {
			waitproperty(time);
			return this;
		}

		public void closeallBrowsers() {
			
			closeAllBrowsers();
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


