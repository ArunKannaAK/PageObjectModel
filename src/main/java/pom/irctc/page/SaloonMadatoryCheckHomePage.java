package pom.irctc.page;

import wrappers.GenericWrappers;

public class SaloonMadatoryCheckHomePage extends GenericWrappers {
	

	

	
	
	public SaloonMadatoryCheckHomePage clickonEnquiryform() {
		
		clickByXpath("//a[@id='enquiry-tab']");
		return this;
		
	}
	
	
	
	public SaloonMadatoryCheckHomePage enterbyName(String data) {
		
		enterByXpath("//input[@placeholder='Name of Applicant']", data);
		return this;
		
		
	}

	public SaloonMadatoryCheckHomePage enterbyOrganization(String data) {
		
		enterByXpath("//input[@placeholder='Name of Organisation']", data);
		return this;
			}

	public SaloonMadatoryCheckHomePage enterbyMobile(String data) {
		
		enterByXpath("//input[@placeholder='Mobile*']", data);
		return this;

		}
	
	public SaloonMadatoryCheckHomePage enterbyEmail(String data) {
	
	enterByXpath("//input[@placeholder='Email']", data);
	return this;
	
	}
	
	
	public SaloonMadatoryCheckHomePage selectbyCharter(String data) {
		
		selectVisibleTextByXpath("//select[@name='requestFor']", data);
		return this;
		
	}
	
	
	public SaloonMadatoryCheckHomePage enterbyOriginstation(String data) {
		
		enterByXpath("//input[@name='originStation']", data);
		return this;
		
	}
	
	public SaloonMadatoryCheckHomePage enterbyDestinstation(String data) {
		
		enterByXpath("//input[@name='destnStation']", data);
		return this;
		
	}
	
	
	public SaloonMadatoryCheckHomePage clickonDateIn() {
		
		clickByXpath("//input[@name='checkInDate']");
		return this;
	}
	
	//public HomePage clickonData
	
	public SaloonMadatoryCheckHomePage clickonDateOut() {
		
		clickByXpath("//input[@name='checkOutDate']");
		return this;
	}
	
	public SaloonMadatoryCheckHomePage enterbyDuration(String data) {
		
		enterByXpath("//input[@name='durationPeriod']", data);
		return this;
	
	}
	
	public SaloonMadatoryCheckHomePage enterbyCoachDetails(String data) {
		
		enterByXpath("//input[@name='coachDetails']", data);
		return this;
	
	}
	
	public SaloonMadatoryCheckHomePage enterbyNumberOfPassengers(String data) {
		
		enterByXpath("//input[@name='numPassenger']", data);
		return this;
	
	}
	
	
	public SaloonMadatoryCheckHomePage enterbyCharterPurpose(String data) {
		
		enterByXpath("//textarea[@name='charterPurpose']", data);
		return this;
	
	}
	
	public SaloonMadatoryCheckHomePage clickonsubmit() {
		
		clickByXpath("//button[@type='Submit']");
		return this;
	}

	public SaloonMadatoryCheckHomePage verifyMobileNofield(String text) {
		
		verifyTextByXpath("//span[text()='Mobile no. not valid']", text);
		return this;
	}
	
	public void closeAllBrowsers() {
		
		closeAllBrowsers();
		
	}
	
	
	




























}

