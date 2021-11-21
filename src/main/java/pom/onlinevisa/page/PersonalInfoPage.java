package pom.onlinevisa.page;

import wrappers.GenericWrappers;

public class PersonalInfoPage extends GenericWrappers {
	
	public PersonalInfoPage enterbyGivenName(String data) {
		
		enterByXpath("//input[@id='app-given-names']", data);
		return this;
		
	}
	
	public PersonalInfoPage enterbySurName(String data) {
		
		enterByXpath("//input[@id='app-surname']", data);
		return this;
		
	}
	
	public PersonalInfoPage enterbyFullName(String data) {
		
		enterByXpath("//input[@id='app-native-name']", data);
		return this;
		
	}
	
	public PersonalInfoPage clickonOtherNames() {
		
		clickByXpath("//input[@id='other-names-used-Yes']");
		return this;
	}
	
	public PersonalInfoPage enterbyOtherSurNames(String data) {
		
		enterByXpath("//input[@id='other-surname']", data);
		return this;
		
	}
	
	public PersonalInfoPage enterbyOtherGivenNames(String data) {
		
		enterByXpath("//input[@id='other-given-names']", data);
		return this;
	}
	
	public PersonalInfoPage enterbyEmail(String data) {
		
		enterByXpath("//input[@id='email']", data);
		return this;
	}
	
	public PersonalInfoPage enterbyConfirmEmail(String data) {
		
		enterByXpath("//input[@id='email-1']", data);
		return this;
		
	}
	
	public PersonalInfoPage clickbyAdditionalEmailAddress(String data) {
		
		clickByXpath("//input[@id='"+data+"']");
		return this;
	}
	
	public PersonalInfoPage enterByAdditionalEmailAddress(String data) {
		
		enterByXpath("//input[@id='additional-email-detail']", data);
		return this;
	}
	
	public PersonalInfoPage clickbyGender(String value) {
		
		clickByXpath("//input[@id='"+value+"']");
		return this;
		
		
	}
	
	
	
	public PersonalInfoPage clickbyDate() {
		
		clickByXpath("//*[@id='date-of-birth_root']/div");
		return this;
		
	}
	
	
	public PersonalInfoPage selectbyYear(String year) {
		
		selectVisibleTextByXpath("//*[@id='date-of-birth_root']/div/div/div/div/div[1]/select[1]", year);
		return this;
	}
	
	public PersonalInfoPage selectbyMonth(String month) {
		
		selectVisibleTextByXpath("//*[@id='date-of-birth_root']/div/div/div/div/div[1]/select[2]", month);
		return this;
	}
	
	public PersonalInfoPage selectbyDate() {
		
		clickByXpath("//*[@id='date-of-birth_table']/tbody/tr[2]/td[6]/div");
		return this;
	}
	
	public PersonalInfoPage enterbyCity(String data) {
		
		enterByXpath("//input[@id='city-of-birth']", data);
		return this;
		
	}
	
	public PersonalInfoPage enterbyState(String data) {
		
		enterByXpath("//input[@id='state-of-birth']", data);
		return this;
	}
	
	
	public PersonalInfoPage selectbyCountry1(String data) {
		
		selectVisibleTextByXpath("//select[@id='country-of-birth']", data);
		return this;
		
	}
	
	public PersonalInfoPage selectbyOriginCountry(String data) {
		
		selectVisibleTextByXpath("//select[@id='nationality']", data);
		return this;
	}
	
	public PersonalInfoPage clickbyResidentCountry() {
		
		clickByXpath("//*[@id='select-perm-resident-other-country-Yes']");
		return this;
	}
	
	public PersonalInfoPage selectbyResidentcountry(String data) {
		
		selectVisibleTextByXpath("//select[@id='perm-resident-other-country']", data);
		return this;
	}
	
	
	public PersonalInfoPage clickbyNext() {
		
		clickByXpath("//button[@id='datos-personales-button']");
		return this;
		
	}
	
	public PersonalInfoPage enterbyStreet(String data) {
		
		enterByXpath("//input[@id='contact-street']", data);
		return this;
		
	}
	
	public PersonalInfoPage enterbyStreet2(String data) {
		
		enterByXpath("//input[@id='contact-street-2']", data);
		return this;
	}
	
	public PersonalInfoPage enterbyCity1(String data) {
		
		enterByXpath("//input[@id='contact-city']", data);
		return this;
	}
	
	public PersonalInfoPage enterbyState1(String data) {
		
		enterByXpath("//input[@id='contact-state']", data);
		return this;
	}
	
	
	public PersonalInfoPage enterbyPincode(String data) {
		
		enterByXpath("//input[@id='contact-zip']", data);
		return this;
	}
	
	public PersonalInfoPage clickbyPhonecode() {
		
		clickByXpath("//div[@class='e-text js-toggledropdown e-country-box parent-dropdown-open']");
		return this;
	}
	
	//public PersonalInfoPage 
	
	
	public PersonalInfoPage waitProperty(long time) {
		
		waitproperty(time);
		return this;
	}
	
	public PersonalInfoPage enterbyPhonnumber(String data) {
		
		enterByXpath("//input[@name='phone-number']", data);
		return this;
	}
	
	public PersonalInfoPage selectbyCountry(String data) {
		
		selectvaluebyxpath("//select[@name='contact-country']", data);
		return this;
		
		
	}
	
	public PersonalInfoPage selectbyTerritory(String data) {
		
		selectVisibleTextByXpath("//select[@name='india-region']", data);
		return this;
	}
	
	public PersonalInfoPage clickbyMail() {
		
		clickByXpath("//input[@id='same-mailing-address-Yes']");
		return this;
	}
	
	public PersonalInfoPage clickbyNext1() {
		
		clickByXpath("//button[@id='datos-contacto-button']");
		return this;
	}
	
	public PersonalInfoPage enterbyLanguages(String data) {
		
		enterByXpath("//input[@id='languages']", data);
		return this;
		
	}

	public PersonalInfoPage clickonNoTribe() {
		
		clickByXpath("//input[@id='clan-tribe-No']");
		return this;
	}
	
	public PersonalInfoPage selectMaritalStatus(String data) {
		
		selectVisibleTextByXpath("//select[@id='marital-status']", data);
		return this;
	}
	
	public PersonalInfoPage selectUStrip(String data) {
		
		selectVisibleTextByXpath("//select[@id='purpose-of-trip']", data);
		return this;
	}
	
	public PersonalInfoPage enterbyEmbassy(String data) {
		
		enterByXpath("//input[@id='application-location-india']", data);
		return this;
		
	}
	
	public PersonalInfoPage selectLanguage(String data) {
		
		selectVisibleTextByXpath("//select[@id='application-location-india-language']", data);
		return this;
		
	}
	
	public PersonalInfoPage ClickonTerms() {
		
		clickByXpath("//input[@id='accept-terms-']");
		return this;
		
	}
	
	public PersonalInfoPage ClickonNext() {
		
		clickByXpath("//button[@id='siguiente']");
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	

}
