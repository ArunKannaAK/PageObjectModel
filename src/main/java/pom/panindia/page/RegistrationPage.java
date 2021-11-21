package pom.panindia.page;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	
	   public RegistrationPage selectontitle(String value) {
		   
		  
		   selectVisibleTextByXpath("//*[@id='pan_title']", value);
		   return this;
		  
		   
	   }
	
	   
	   public RegistrationPage enterbyFirstname(String data) {
		   
		   enterByXpath("//input[@id='pan_firstname']", data);	   
		return this;
		
	   }
	
	   
	   public RegistrationPage enterbyLastname(String data) {
		   
		   enterByXpath("//input[@id='pan_lastname']", data);
		   return this;
	   }
	   
	   public RegistrationPage enterbyFatherfirstname(String data) {
		   
		   enterByXpath("//input[@id='pan_fatherfirstname']", data);
		   return this;
		   
	   }
	
	   public RegistrationPage enterFatherLastname(String data) {
		   
		   enterByXpath("//input[@id='pan_fatherlastname']", data);
		   return this;
		   
	   }
	
	   public RegistrationPage enterbyMobile(String data) {
		   
		   enterByXpath("//input[@id='pan_mobilenumber']", data);
		   return this;
		   
	   }
	   
	   public RegistrationPage enterbyemail(String data) {
		   
		   enterByXpath("//input[@id='pan_email']", data);
		   return this;
		   
		  
	   }
	   
	   
	   public RegistrationPage selectonIncome(String data) {
		   
		   selectVisibleTextByXpath("//select[@id='pan_sourceofincome']",data);
		   return this;
	   }
	   
	
	   public RegistrationPage clicktbyIncome(String data) {
		   
		   clickByXpath("//*[text()='"+data+"']");
		   return this;
		   
	   }
	   
	   public RegistrationPage clickonOffice(String value) {
		   
		   
		   clickByXpath("//*[@id='"+value+"']");
		   return this;
		   	   
	   }
	   
	   public RegistrationPage enterbyDOB(String data) {
		   
		   enterByXpath("//*[@id='pan_dob']", data);
		   return this;
		   
	   }

	   	public RegistrationPage waitProperty(long time) {
	   		
	   		waitproperty(time);
	   		return this;
	   		
	   	}
	   public RegistrationPage scrolByPageDown() {
		   pagescrollbyxpath();
		   return this;
	   }
	   
	   public RegistrationPage enterHouseNo(String data) {
		   
		   enterByXpath("//input[@id='pan_addressline1']", data);
		   return this;
		   
	   }
	     
 public RegistrationPage scrollbyMouseWheel() {
		   
		   scrollbyMouse();
		   return this;
		   
	   }
	  public RegistrationPage enterbyArea(String data) {
		  
		  enterByXpath("//input[@id='pan_officeaddressline2']", data);
		  return this;
		  
	  }

	  public RegistrationPage enterbyCity(String data) {
		  
		  enterByXpath("//*[@id='pan_cityname']", data);
		  return this;
		  
	  }
	  
	  public RegistrationPage selectbyState(String data) {
		  
		  selectVisibleTextByXpath("//select[@id=\"pan_state\"]", data);
		  return this;
		  
	  }
	  
	  public RegistrationPage enterbyPincode(String data) {
		  
		  enterByXpath("//*[@id='pan_pincode']", data);
		  return this;
		  
	  }

	  public RegistrationPage selectonCountry(String data) {
		  
		 selectVisibleTextByXpath("//*[@id='pan_country']", data);
		  return this;
		  
	  }

	  public RegistrationPage enterbyOfficeName(String data) {
		  
		  enterByXpath("//*[@id='pan_officename']", data);
		  return this;
		  
	  }

	  public RegistrationPage enterbyOfficeAddress(String data) {
		  
		  enterByXpath("//*[@id='pan_officeaddressline1']", data);
		  return this;
		  
				
	  }


	  public RegistrationPage enterbyOfficeCity(String data) {
		  
		  enterByXpath("//*[@id='pan_officecityname']", data); 
		  return this;
		  
	  }

	  public RegistrationPage selectonOfficeState(String data) {
		  
		  selectVisibleTextByXpath("//*[@id='pan_officestate']",data);
		  return this;
		  
		
	  }
	  

	  public RegistrationPage enterbyOfficePincode(String data) {
		  
		  enterByXpath("//*[@id='pan_officepincode']", data);
		  return this;
		  
		  		
	  }

	  public RegistrationPage selectonOfficeCountry(String data) {
		  
		  selectVisibleTextByXpath("//*[@id='pan_officecountry']",data);
		  return this;
		  
	  }

	  public RegistrationPage selectonIdentityProof(String data) {
		  
		  selectVisibleTextByXpath("//select[@id='pan_identityproof']",data);
		  return this;
	  }
	  

	  public RegistrationPage selectonAddressProof(String data) {
		  
		  selectVisibleTextByXpath("//*[@id='pan_addressproof']",data);
		  return this;

	  }
	  
	  public RegistrationPage selectonDOBProof(String data) {
		  
		  selectVisibleTextByXpath("//*[@id='pan_DOBproof']",data);
		  return this;
		  
	  }

	  public RegistrationPage selectonAadharProof(String data) {
		  
		  selectVisibleTextByXpath("//select[@id='pan_aadhaarproof']",data);
		  return this;

		 
	  }
	  
	  public RegistrationPage selectonOffAddressProof(String data) {
		  
		  selectVisibleTextByXpath("//*[@id='pan_officeaddressproof']",data);
		  return this;
		  
		  
	  }


	  public RegistrationPage clickonTerms() {
		  
		  clickByXpath("//*[@id='pan_source']");
		  return this;
		  
	  }

	  









}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

