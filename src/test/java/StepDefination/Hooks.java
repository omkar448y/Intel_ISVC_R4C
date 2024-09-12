package StepDefination;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import Utilities.BaseTest;
import Utilities.ScreenshotHelper;
public class Hooks {
	 private BaseTest baseTest;

	    // Constructor injection to access BaseTest class in Hooks
	    public Hooks(BaseTest baseTest) {
	        this.baseTest = baseTest;
	    }

	    @After
	    public void takeScreenshotOnFailure(Scenario scenario) {
	        if (scenario.isFailed()) {
	            WebDriver driver = baseTest.getDriver();
	            // Capture screenshot and pass the scenario name
	            ScreenshotHelper.takeScreenshot(driver, scenario.getName());
	        }
	    }
}
