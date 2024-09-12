package Utilities;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotHelper {
	 public static void takeScreenshot(WebDriver driver, String scenarioName) {
	        try {
	            // Capture screenshot as a file
	            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            
	            // Create a destination path with the scenario name
	            File destFile = new File("./screenshots/" + scenarioName + ".png");

	            // Copy the screenshot to the destination path
	            FileUtils.copyFile(srcFile, destFile);

	            System.out.println("Screenshot taken for scenario: " + scenarioName);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
