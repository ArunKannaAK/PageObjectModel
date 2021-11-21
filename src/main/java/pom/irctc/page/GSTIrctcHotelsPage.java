package pom.irctc.page;

	import wrappers.GenericWrappers;

	public class GSTIrctcHotelsPage extends GenericWrappers {
		
		

		public GSTIrctcHotelsPage entertheHotelName(String data) {
			
			enterByXpath("//input[@id='filterText']", data);
			return this;
			
		}
		
		public GSTIrctcHotelsPage clickonCity() {
			
			clickByXpath("//Strong[text()='City']");
			return this;
			
		}
		
		public GSTIrctcHotelsPage waitProperty(long time) {
			
			waitproperty(time);
			return this;
		
		}
		
		
		public GSTIrctcHotelsPage switchtoLastWindow() {
			
			switchToLastWindow();
			return this;
		}
		public GSTIrctcHotelsPage clickonDate() {
			
			clickByXpath("//input[@name='dt12']");
			return this;
			
		}
		
		public GSTIrctcHotelsPage clickonDateValueforYear() {
			
			clickByXpath("//SPAN[@_ngcontent-serverapp-c10=''][text()='19']");
			return this;
			
		}
		public GSTIrctcHotelsPage clickonDateValueforMonth() {
			
			clickByXpath("//*[@id='owl-dt-picker-4']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[2]/td[6]/span");
			return this;	

		}
		
		
		public GSTIrctcHotelsPage clickonDateValueforDay() {
			
			clickByXpath("//SPAN[@_ngcontent-serverapp-c10=''][text()='24']");
			return this;
		
		}
		public GSTIrctcHotelsPage clickonRooms() {
			
			clickByXpath("//input[@id='user-data-wrapper-id']");
			return this;
		}
		
		public GSTIrctcHotelsPage selectonRooms(String data) {
			
			selectVisibleTextByXpath("//select[@name='hotelRoom']", data);			
			return this;
			
		}
		
		public GSTIrctcHotelsPage selectonAdults(String data) {
			
			selectVisibleTextByXpath("//select[@name='hotelAdult']", data);
			return this;
			
		}
		
		
		public GSTIrctcHotelsPage selectonChild(String data) {
			
			selectVisibleTextByXpath("//select[@name='hotelChild']", data);			
			return this;
			
			
		}
		
		
		public GSTIrctcHotelsPage clickonDone() {
			
			clickByXpath("//button[text()='Done']");
			return this;

		}
		
		public GSTIrctcHotelsPage clickonFindHotel() {
			
			clickByXpath("//button[text()='Find Hotel ']");
			return this;
			
		}
		
		public GSTHotelPage clickonHotelName() {
			
			clickByXpath("//div[@class='row no-gutters']");
			return new GSTHotelPage();
			
		}

		
		
		
		
	}


