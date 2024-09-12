package Utilities;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class TestListener implements ITestListener{
	 @Override
	    public void onTestFailure(ITestResult result) {
	        Object currentClass = result.getInstance();
	        WebDriver driver = ((BaseTest)currentClass).getDriver();
	        ScreenshotHelper.takeScreenshot(driver, result.getName());
	    }

	    // Other overridden methods can be left empty or implemented as needed
}
