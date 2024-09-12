package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "C:\\Users\\oyadavx\\git\\repository4\\Intel_ISVC_R4C\\src\\test\\java\\Features\\ContactPage_Technical_CaseCreation.feature",

glue = "parallel",
tags = "@highpriority",
monochrome = true,
dryRun=false,
plugin = {"pretty", "html:target/cucumber-reports.html", "junit:target/cucumber.xml",
		"rerun:target/faildrerun.txt"} )
public class parallelrun extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		
		return super.scenarios();
	}
	
	
}
