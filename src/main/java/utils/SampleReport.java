package utils;



import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void reports() {
		
		// Start Report
		
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// start test
		
		ExtentTest test = report.startTest("TC005", "To verify IRCTC Registration");
		
		test.assignAuthor("Arun Kanna");
		
		test.assignCategory("Functional");
		
		// log test steps
		
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		test.log(LogStatus.PASS, "The browser got laucnhed successfully with the given url");
		
		// end test
		
		report.endTest(test);
		
		// end report
		
		report.flush();
		
	}

}
