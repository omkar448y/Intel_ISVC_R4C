package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

	@CucumberOptions(features = "C:\\Users\\oyadavx\\git\\repository4\\Intel_ISVC_R4C\\src\\test\\java\\Features\\ContactPage_Technical_CaseCreation.feature",

			glue = "StepDefination",
			tags = "@highpriority",
			monochrome = true,
		    dryRun=false,
			plugin = {"pretty", "html:target/cucumber-reports.html", "junit:target/cucumber.xml",
					"rerun:target/faildrerun.txt"} )
			public class CucumberTest extends AbstractTestNGCucumberTests {
		
		
		
			} 
}