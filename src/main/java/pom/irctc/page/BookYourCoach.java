package pom.irctc.page;

import wrappers.GenericWrappers;

public class BookYourCoach extends GenericWrappers {
	
	public BookCoachFTR clickonBookCoach() {
		
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new BookCoachFTR();
		
	}
	
	
	

}
