package PageObject;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utilities.WaitHelper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class LoginPage {
	public WebDriver ldriver;
	public WebDriver driver;
	public WaitHelper waitHelper;

	// private WebDriver rdriver;
	public LoginPage(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitHelper = new WaitHelper(driver); // Initialize WaitHelper
	}

	@FindBy(xpath = "//input[@id=\"username\"]")
	WebElement textEmail; // TO Enter Email id into text field
	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement textPassword; // To Enter Password into Text field
	@FindBy(xpath = "//input[@id=\"Login\"]")
	WebElement Clickonlogin; // To click on Login button
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/header[1]/div[2]/span[1]/div[2]/ul[1]/li[7]/span[1]/div[1]/button[1]/div[1]/span[1]/div[1]/span[1]")
	WebElement ClickonIcon; // To click on Menu icon
	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	WebElement Clickonlogout; // To click on Log out option

	public void SetUserName(String uname) {
<<<<<<< HEAD
=======
       // waitHelper.waitForElement(textEmail, Duration.ofSeconds(10));
>>>>>>> 5199e9a122c3b8204da0c6f6aa466f404f2ae6f6
		textEmail.sendKeys(uname);
	}

	public void SetPassword(String Password) {
		textPassword.sendKeys(Password);
<<<<<<< HEAD
=======
       // waitHelper.waitForElement(textEmail, Duration.ofSeconds(10));
>>>>>>> 5199e9a122c3b8204da0c6f6aa466f404f2ae6f6
	}

	public void Clickonlogin() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(Clickonlogin));
	       
		Clickonlogin.click();
	}

	public void clickonmenuicon() {
		ClickonIcon.click();
	}

	public void clickonlogout() {
		Clickonlogout.click();
	}

}
