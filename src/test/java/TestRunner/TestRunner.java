package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

<<<<<<< HEAD
	@CucumberOptions(features = "C:\\Users\\oyadavx\\git\\repository3\\Intel_ISVC_R4C\\src\\test\\java\\Features\\ContactPage_R4C_StockRoatation_OptIn&Optout.feature",

			glue = "StepDefination",
			tags = "@HighPriority",
			monochrome = true,
		    dryRun=false,
			plugin = {"pretty", "html:target/cucumber-reports.html", "junit:target/cucumber.xml",
					"rerun:target/faildrerun.txt"} )
=======
	@CucumberOptions(features = "C:\\Users\\oyadavx\\git\\repository3\\Intel_ISVC_R4C\\src\\test\\java\\Features\\ContactPage_Technical.feature",

			glue = "StepDefination", 
			tags = "@HighPriority",
			dryRun=false, monochrome = true, 
			plugin = {"pretty", "html:target/cucumber-reports.html", "junit:target/cucumber.xml"} )
>>>>>>> 5199e9a122c3b8204da0c6f6aa466f404f2ae6f6
			public class CucumberTest extends AbstractTestNGCucumberTests {
		
		
		
			} 
}