package Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.ScreenshotHelper;
public class Hooks {
	public WebDriver driver;
    public ScreenshotHelper screenshotHelper;

    public Hooks(WebDriver driver) {
        this.driver = driver;
        this.screenshotHelper = new ScreenshotHelper(driver);
    }

    @After
    public void afterScenario(Scenario scenario) {
        screenshotHelper.takeScreenshot(scenario);
    }
}
