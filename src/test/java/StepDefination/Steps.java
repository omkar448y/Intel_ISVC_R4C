package StepDefination;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import PageObject.ContactPage_R4C_CaseCreation;
import PageObject.ContactPage_Technical;
import PageObject.LoginPage;
import Utilities.WaitHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.chrome.ChromeOptions;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Steps extends BaseClass {
	public WebDriver rdriver;
	public LoginPage lp;
	public ContactPage_R4C_CaseCreation contacts;
	public ContactPage_Technical Technical;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized"); // Start browser maximized
		options.addArguments("--disable-notifications"); // Disable notifications
	 options.addArguments("--incognito"); // Open in incognito mode
		
		driver = new ChromeDriver(options);
		lp = new LoginPage(driver);
	}

	@When("User open url {string}")
	public void user_open_url(String string) throws InterruptedException {
		driver.get(string);
		Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}

	@When("User Enter Email {string} as and pass {string}")
	public void user_enter_email_as_and_pass(String email, String password) throws InterruptedException {
		lp = new LoginPage(driver);
		lp.SetUserName(email);
		Thread.sleep(2000);
		lp.SetPassword(password);
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		lp.Clickonlogin();
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
		String Title = driver.getTitle();
		System.out.println("Actual title" + Title);
	}

	@When("User Click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		Thread.sleep(2000);
		lp.clickonmenuicon();
		Thread.sleep(3000);
		lp.clickonlogout();
	}

	@Then("Close brower")
	public void close_brower() {
		driver.close();
	}
// Contact - R4C-New case creation
// Scenario No-1

	@Given("User is logged in and on the Dashboard page")
	public void user_is_logged_in_and_on_the_dashboard_page() {
		contacts = new ContactPage_R4C_CaseCreation(driver);
		String Title = contacts.getPageTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, Title);
	}

	@When("User Click on Contact menu")
	public void user_click_on_contact_menu() throws InterruptedException {
		Thread.sleep(2000);
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.Clickoncontactdropdown(); // TO click on contacts dropdown
		Thread.sleep(3000);
	}

	@When("Select Contact from list and enter Text into search field {string}")
	public void select_contact_from_list_and_enter_text_into_search_field(String string) throws InterruptedException {
		Thread.sleep(4000);
		contacts.SelectDropdownOption_Contacts(); // To select contact option
		Thread.sleep(8000);
		contacts.clickondropdown(); // To click on List view Dropdown
		Thread.sleep(3000);
		contacts.SelectTestContact(); // clickon recent view dropdown option
		Thread.sleep(3000);
		contacts.EntercontactNameintosearchfield(string); // To Enter Text into search field- RecentView
		Thread.sleep(5000);
		contacts.selecttestcontact(); // To click on searched contact
		Thread.sleep(4000);
		contacts.EnterTextGlobaly(); // Enter Text Into global fields
	}
	//span[@class='triggerLinkText selectedListView slds-page-header__title slds-truncate slds-p-right--xx-small lst-temp-slds-lineHeight uiOutputText'
	@When("Click on the New R4C case creation button")
	public void click_on_the_new_r4c_case_creation_button() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		System.out.println("All value enterd into fields with golbaly and recent search");
		contacts.clickonR4CCaseButton();
		Thread.sleep(3000);
	}

	@Then("User can view New R4C Case popup")
	public void user_can_view_new_r4c_case_popup() {
		System.out.println("User Are Able to see New R4C Popup");
	}

	@Then("Select service type as {string}")
	public void select_service_type_as(String string) throws InterruptedException {
		try {
			contacts.selectserviceType();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(3000);
	}

	@Then("Click on the create button")
	public void click_on_the_create_button() throws InterruptedException {
		contacts.clickoncreatebutton();
		Thread.sleep(5000);
	}

	@When("User enter Sold to and other details")
	public void user_enter_sold_to_and_other_details() throws InterruptedException {
		Thread.sleep(4000);
		contacts.EnterSoldTo();
		Thread.sleep(4000);
		contacts.Selectsearchedcontact();
		Thread.sleep(5000);
		contacts.clickonreturnreson();
		Thread.sleep(3000);
		contacts.selectstockrotation();
		Thread.sleep(5000);
	}

	@When("Click on the Next button After Sold To")
	public void click_on_the_next_button_after_sold_to() throws InterruptedException {
		contacts.clickonnectaftersold();
		Thread.sleep(5000);
	}

	@When("Select Purchase\\/Sales Order button and Enter PO Number {string}")
	public void select_purchase_sales_order_button_and_enter_po_number(String string) throws InterruptedException {
		contacts.clickonPORadiobutton();
		Thread.sleep(5000);
		contacts.EnterPONumber(string);
		Thread.sleep(3000);
	}

	@Then("Click on the search button")
	public void click_on_the_search_button() throws InterruptedException {
		contacts.clickonsearch();
		Thread.sleep(5000);
	}

	@Then("Select All Line items")
	public void select_all_line_items() throws InterruptedException {
		Thread.sleep(3000);
		contacts.selectallcheckbox();
		Thread.sleep(3000);
	}

	@Then("Click on the Next button after All Line Items")
	public void click_on_the_next_button_after_all_line_items() throws InterruptedException {
		contacts.clickonnextPO();
		Thread.sleep(3000);
	}

	@Then("Click on Product Validation and Next button")
	public void click_on_product_validation_and_next_button() throws InterruptedException {
		Thread.sleep(15000);
		contacts.clickonproductvalidation();
		Thread.sleep(8000);
		contacts.clickonnextafterPO();
		Thread.sleep(4000);
	}
	@When("Click on Next cases edit")
	public void click_on_next_cases_edit() throws InterruptedException {
	    
		WebElement Clickon=driver.findElement(By.xpath("(//button[contains(text(),'Next')])[3]"));
		Thread.sleep(4000);
		Clickon.click();
	}


	@When("Click On Next Accept Edit")
	public void click_on_next_accept_edit() throws InterruptedException {
		Thread.sleep(10000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=\"Next\"])[2]")));
			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Element still not clickable");
		}
	}
	@When("Click on next Case Validation")
	public void click_on_next_case_validation() throws InterruptedException {
	   WebElement click=driver.findElement(By.xpath("//section[@aria-expanded='true']//section[@role='tabpanel']//button[@title='Save for Later'][normalize-space()='Save for Later']/../..//button[@title='Next'][normalize-space()='Next']"));
		Thread.sleep(10000);
	   click.click();
	   
	   
	}

	@When("Enter Return Quantity")
	public void enter_return_quantity() throws InterruptedException {
		contacts.enterQuantityfirst();
		Thread.sleep(3000);
		System.out.println("Enterd all values Into the Return Fields");
	}

	@When("Click on the Get credit price")
	public void click_on_the_get_credit_price() throws InterruptedException {
		Thread.sleep(3000);
		contacts.clickongetcreditprice();
		Thread.sleep(5000);
	}

	@When("Click on the Next button After credit Price")
	public void click_on_the_next_button_after_credit_price() throws InterruptedException {
		Thread.sleep(4000);
	}

	@When("Enter Credit price")
	public void enter_credit_price() throws InterruptedException {
		Thread.sleep(3000);
		contacts.EnterPrice();
		Thread.sleep(3000);
		contacts.entertextintoreasonfield();
		Thread.sleep(3000);
	}

	@When("Click on the Next button After Credit")
	public void click_on_the_next_button_after_credit() throws InterruptedException {
		Thread.sleep(3000);
		contacts.AfterCreditpriceNext();
		System.out.println("------------Clicked after Entering reason-------------------");
		Thread.sleep(3000);
	}

	@When("Click on the Validate Allowance")
	public void click_on_the_validate_allowance() throws InterruptedException {
		Thread.sleep(3000);
		contacts.validateallownace();
		Thread.sleep(3000);
	}

	@When("Click on the Save and Summary button")
	public void click_on_the_save_and_summary_button() throws InterruptedException {
		Thread.sleep(5000);
		contacts.clicksavesummery();
		Thread.sleep(3000);
	}

	@When("Click on submit button After Summary")
	public void click_on_submit_button_after_summary() throws InterruptedException {
		Thread.sleep(8000);

		// ---------------------------
		Thread.sleep(5000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Submit\"]")));
			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Element still not clickable");
		}
		Thread.sleep(3000);
	}

	@Then("User can view Case creation Popup message")
	public void user_can_view_case_creation_popup_message() {
		System.out.println("PopUp Window Displayed");
	}

	@Then("Click on the Submit button")
	public void click_on_the_submit_button() {

	}

	@Then("User can view Successful message")
	public void user_can_view_successful_message() {

	}

	@Then("Close browser")
	public void close_browser() {
		driver.close();
	}

// Scenario No- 2
// Freight type as IMF using SO Search

	@When("Select Purchase\\/Sales Order button and Enter SO Number {string}")
	public void select_purchase_sales_order_button_and_enter_so_number(String string) throws InterruptedException {
		contacts.clickonPORadiobutton();
		Thread.sleep(4000);
		contacts.EnterSONumber(string);
	}

// scenario no 3
// Verify the Case creation for Stock Rotation & Return Reason as Promotional
// Stock Rotation with Freight type as CRF using MM Search

	@Then("Select service type as a {string}")
	public void select_service_type_as_a(String string) throws InterruptedException {
		contacts.selectserviceType();
		Thread.sleep(4000);
		contacts.clickoncreatebutton();
		Thread.sleep(4000);
		contacts.EnterSoldTo();
		Thread.sleep(4000);
		contacts.SoldToIdContact();
		Thread.sleep(3000);
		contacts.ReturnResonePSR();
		Thread.sleep(2000);
		contacts.ReturnPSRselect();
		Thread.sleep(2000);
		contacts.clickonnectaftersold();
		Thread.sleep(4000);

	}

	@When("Clickon Product radiobutton and enter MM Number {string}")
	public void clickon_product_radiobutton_and_enter_mm_number(String string) throws InterruptedException {
		Thread.sleep(2000);
		contacts.clickonProductRadioButton();
		Thread.sleep(2000);
		contacts.EnterMM(string);
		Thread.sleep(2000);
	}

	@When("Click on search button after Entering MM Number")
	public void click_on_search_button_after_entering_mm_number() throws InterruptedException {
		contacts.ClickOnSearchAfterMM();
		Thread.sleep(5000);
		contacts.selectallcheckbox();
		Thread.sleep(3000);
	}

	@When("Clickon PO History")
	public void clickon_po_history() throws InterruptedException {
		Thread.sleep(3000);
		contacts.clickOnPOHistory();
		Thread.sleep(9000);
		contacts.clickonNextAfterPOHistory();
	}

// scenario no 4
// Verify the Case creation for Stock Rotation & Return Reason as Promotional
// Stock Rotation with Freight type as IMF using Bulk Upload

	@Then("Select service type as a Promotional Stock Rotation and Upload Bulk File {string}")
	public void select_service_type_as_a_promotional_stock_rotation_and_upload_bulk_file(String string)
			throws InterruptedException, AWTException {
		contacts.selectserviceType();
		Thread.sleep(3000);
		contacts.clickoncreatebutton();
		Thread.sleep(4000);
		contacts.EnterSoldTo();
		Thread.sleep(3000);
		contacts.SoldToIdContact();
		Thread.sleep(4000);
		contacts.ReturnResonePSR();
		Thread.sleep(4000);
		contacts.ReturnPSRselect();
		Thread.sleep(4000);
		contacts.clickonnectaftersold();
		Thread.sleep(3000);
		contacts.ClickonBulkUpload();
		Thread.sleep(3000);
		contacts.clickonUploadfileButton(string);
		Robot upload = new Robot(); // To use robot class to handle file upload
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		Thread.sleep(2000);
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}

	@When("Click On Bulk upload {string}")
	public void click_on_bulk_upload(String string) throws InterruptedException, AWTException {
		Thread.sleep(3000);
		contacts.ClickonBulkUpload();
		Thread.sleep(3000);
		contacts.clickonUploadfileButton(string);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		Thread.sleep(2000);
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("Click On Validate Button")
	public void click_on_validate_button() throws InterruptedException {
		Thread.sleep(4000);
		contacts.ValidateAfterUpload();
	}

	// Scenario 5 PO Search Function
	@Then("Select service type as a Promotional Stock Rotation")
	public void select_service_type_as_a_promotional_stock_rotation() throws InterruptedException {
		Thread.sleep(3000);
		contacts.selectserviceType();
		Thread.sleep(3000);
		contacts.clickoncreatebutton();
		Thread.sleep(3000);
		contacts.EnterSoldTo();
		Thread.sleep(3000);
		contacts.SoldToIdContact();
		Thread.sleep(5000);
		contacts.ReturnResonePSR();
		Thread.sleep(4000);
		contacts.ReturnPSRselect();
		Thread.sleep(6000);
		contacts.clickonnectaftersold();
		Thread.sleep(3000);
	}

	@Then("Select service type as a Promotional Stock Rotations")
	public void select_service_type_as_a_promotional_stock_rotations() throws InterruptedException {
		contacts.selectserviceType();
		Thread.sleep(3000);
		contacts.clickoncreatebutton();
		Thread.sleep(3000);
		contacts.EnterSoldTo();
		Thread.sleep(3000);
		contacts.SoldToIdContact();
		Thread.sleep(5000);
		contacts.ReturnResonePSR();
		Thread.sleep(4000);
		contacts.ReturnPSRselect();
		Thread.sleep(6000);
	}

	@Then("Select service type as Stock roatation")
	public void select_service_type_as_stock_roatation() throws InterruptedException {
		contacts.selectserviceType();
		Thread.sleep(3000);
		contacts.clickoncreatebutton();
		Thread.sleep(3000);
	}

	@Then("Enter Sold To details")
	public void enter_sold_to_details() throws InterruptedException {
		Thread.sleep(4000);
		contacts.EnterSoldTo();
		Thread.sleep(3000);
		contacts.SoldToIdContact();
		Thread.sleep(5000);
	}
	

	@Then("Select Promotional Stock option")
	public void select_promotional_stock_option() throws InterruptedException {
		Technical = new ContactPage_Technical(driver);
		Thread.sleep(5000);
		Technical.SelectReason();
		Thread.sleep(5000);
		Technical.SelectPromationalStockRoatation();

	}

// Scenario 6  SO Search Functionality
//Scenario 7 MM Search	
//Scenario 8 CPN Search
	@Then("click on Product radio button")
	public void click_on_product_radio_button() throws InterruptedException {
		Thread.sleep(3000);
		contacts.clickonProductRadioButton();
	}

	@Then("Select CPN Radio button")
	public void select_cpn_radio_button() throws InterruptedException {
		Thread.sleep(3000);
		contacts.ClickonCPN();
		Thread.sleep(3000);
	}

	@When("Enter CPN number")
	public void enter_cpn_number() throws InterruptedException {
		contacts.EnterCPN();
		Thread.sleep(3000);
	}

	@When("click on search button")
	public void click_on_search_button() {
		contacts.SearchCPN();

	}
//Scenario 9 OPN Search

	@Then("Click on Order Part Number radio button")
	public void click_on_order_part_number_radio_button() throws InterruptedException {
		Thread.sleep(3000);
		contacts.SelectOPNradiobutton();
	}

	@When("Enter OPN into search box {string}")
	public void enter_opn_into_search_box(String string) throws InterruptedException {
		Thread.sleep(3000);
		contacts.EnterOPN(string);
	}

//Scenario 12-----------

	@When("Clickon PO History button")
	public void clickon_po_history_button() throws InterruptedException {
		Thread.sleep(4000);
		contacts.clickOnPOHistory();
		Thread.sleep(4000);
	}

	@When("Click on Save for later button")
	public void click_on_save_for_later_button() throws InterruptedException {
		Thread.sleep(3000);
		contacts.ClickonSaveforlater();
		Thread.sleep(3000);
		contacts.ClickonOKButton();
	}

	@When("Check Status")
	public void check_status(String Text) {
		Assert.assertEquals("Open, Unsubmitted", Text, "Text does not match!");
		System.out.println(Text + "Getting Status From WebPage");
	}

// Scenario 13----------------------

	@When("Enter Credit price <25K")
	public void enter_credit_price_25k() throws InterruptedException {
		contacts.pricelessthan25k();
		Thread.sleep(3000);
		contacts.entertextintoreasonfield();
	}

//Scenario 14-------

	@When("Enter Credit price >25K")
	public void enter_credit_price_G25k() throws InterruptedException {
		contacts.PricerGreterThan25K();
		Thread.sleep(3000);
		contacts.entertextintoreasonfield();
	}

	@When("User Slect L3 Agent Selection")
	public void user_slect_l3_agent_selection() throws InterruptedException {
		Thread.sleep(3000);
		contacts.selectL3User();
		Thread.sleep(3000);
	}

	@When("Click on Select Button")
	public void click_on_select_button() throws InterruptedException {
		contacts.clickonL3Select();
		Thread.sleep(3000);
		contacts.selectL3agent();
		Thread.sleep(3000);
	}

// Scenario 15-Edit Case Open Unsaved
	@When("Click On Accept")
	public void click_on_accept() throws InterruptedException, AWTException {
		Thread.sleep(10000);
		contacts.ClickonAcceptButton();

	}

	@When("Click on edit")
	public void click_on_edit() {
		contacts.ClickOnCaseEdit();
	}
	//Opt in ok-----------
	
	
	@Then("Enter Sold To details for opt inout {string}")
	public void enter_sold_to_details_for_opt_inout(String string) throws InterruptedException {
		Thread.sleep(4000);
		contacts.clickonsoldtobox(string);
		
		
	}
	@Then("Select return reason Standard Stock roatation")
	public void select_return_reason_standard_stock_roatation() throws InterruptedException {
		Thread.sleep(3000);
		contacts.clickonreturnreason();
	
	
	}	
	@When("Select Contact from list")
	public void select_contact_from_list() throws InterruptedException {
		Thread.sleep(3000);
		contacts.SelectDropdownOption_Contacts(); // To select contact option
		Thread.sleep(5000);
	}
	@When("Select recentview dropdown")
	public void select_recentview_dropdown() throws InterruptedException {
		Thread.sleep(8000);
		contacts.clickondropdown(); // To click on List view Dropdown
		Thread.sleep(3000);
		contacts.SelectTestContact(); // clickon recent view dropdown option
		Thread.sleep(3000); 
	}
	@When("Enter Contact name and select")
	public void enter_contact_name_and_select() throws InterruptedException {
		Thread.sleep(3000); 
		contacts.Entersearchthistext();
		Thread.sleep(3000); 
     contacts.selectsearchcontacts();
		Thread.sleep(3000); 
		contacts.selectsearchcontacts();
		
	}
	@When("Click on Contacts name")
	public void click_on_contacts_name() throws InterruptedException {
		Thread.sleep(3000); 
		contacts.selecttext();
	}
	// Methos for scenarioo 1
// Scenario 16-Opt In Cancel------

	@When("Select Service Type Stock Rotation and Click on Create button")
	public void select_service_type_stock_rotation_and_click_on_create_button() throws InterruptedException {
		Thread.sleep(5000);
		contacts.selectserviceType();
		Thread.sleep(5000);
		contacts.clickoncreatebutton();

	}
	@When("Select return Reason Standard stock rotation")
	public void select_return_reason_standard_stock_rotation() throws InterruptedException {
	    WebElement Clickstandardstock=driver.findElement(By.xpath("//c-r4c_-a-g_-case-header//lightning-combobox[@data-name='Sales_Issue_Return_Reason__c']//div//button[@name='Select one']"));
	    Clickstandardstock.click();
		Thread.sleep(5000);

	    WebElement Selectstandardstock=driver.findElement(By.xpath("//span[@title='Standard Stock Rotation']"));
	    Selectstandardstock.click();
	    
	    
	}

	@When("Enter Sold To Number")
	public void enter_sold_to_number() throws InterruptedException {
		contacts.EnterSoldToOptIn();
		Thread.sleep(3000);
		contacts.selectsoldToContact();
	}

	@When("Click on Cancel buttton")
	public void click_on_cancel_buttton() throws InterruptedException {
		Thread.sleep(5000);
		contacts.clickoncancelIMF();
	}

	@When("Select Freight Type")
	public void select_freight_type() throws InterruptedException {
		Thread.sleep(3000);
		contacts.ReturnResonePSR();
		Thread.sleep(4000);
		contacts.ReturnPSRselect();
		Thread.sleep(4000);
		contacts.clickonnectaftersold();
		Thread.sleep(4000);
	}

	@When("Select Contact from list and enter Text into search field {string} and select")
	public void select_contact_from_list_and_enter_text_into_search_field_and_select(String string)
			throws InterruptedException {
		Thread.sleep(5000);

		contacts.SelectDropdownOption_Contacts(); // To select contact option
		Thread.sleep(5000);
		contacts.clickondropdown(); // To click on List view Dropdown
		Thread.sleep(3000);
		contacts.SelectTestContact(); // clickon recent view dropdown option
		Thread.sleep(3000);
		contacts.EntercontactNameintosearchfield(string); // To Enter Text into search field- RecentView
		Thread.sleep(4000);
		contacts.ClickOnFirstSearch();
		Thread.sleep(3000);

	}

// Scenario 17Optin/Out Ok---------

	@When("Click on Ok buttton")
	public void click_on_ok_buttton() {
		contacts.clickononIMF();
	}
// Scenario 18 Optin/Out GEO ---------

	@When("Enter Sold To Number case edit")
	public void enter_sold_to_number_case_edit() throws InterruptedException {
		Thread.sleep(4000);
		contacts.EnterSoldTo();
		Thread.sleep(4000);
		contacts.SoldToIdContact();
		Thread.sleep(5000);
		contacts.ReturnResonePSR();
		Thread.sleep(4000);
		contacts.ReturnPSRselect();
		Thread.sleep(4000);
	}

	@When("Enter Sold To Number case")
	public void enter_sold_to_number_case() throws InterruptedException {
		Thread.sleep(4000);
		contacts.EnterSoldTo();
		Thread.sleep(4000);
		contacts.SoldToIdContact();
		Thread.sleep(5000);
	}

	@When("Select  Reason as Standard Stock Rotation")
	public void select_reason_as_standard_stock_rotation() throws InterruptedException {
		Technical = new ContactPage_Technical(driver);
		Thread.sleep(5000);
		Technical.SelectReason();
		Thread.sleep(5000);
		Technical.SelectPromationalStockRoatation();
		Thread.sleep(2000);

	}

	@When("Select RCA address")
	public void select_rca_address() throws InterruptedException {
		Thread.sleep(4000);
		// ---------------------------
		Thread.sleep(5000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//button[@aria-label='Return to Customer Address']/..//button[@aria-label='Return to Customer Address']")));
			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Element still not clickable");
		}
		Thread.sleep(4000);
		contacts.selectRCA();
		Thread.sleep(4000);
	}

	@When("Select CA Address")
	public void select_ca_address() throws InterruptedException {
		contacts.ClickonCA();
		Thread.sleep(5000);
		contacts.SelectCA();
		Thread.sleep(4000);
	}

	@When("Select Return customer contact")
	public void select_return_customer_contact() throws InterruptedException {
		contacts.clickonRCC();
		Thread.sleep(5000);
		contacts.selectRCC();

	}

	@When("select Collection Contact")
	public void select_collection_contact() throws InterruptedException {
		contacts.ClickonCC();
		Thread.sleep(4000);
		contacts.SelectCC();
	}

	@When("Click on next")
	public void click_on_next() throws InterruptedException {
		Thread.sleep(4000);

		contacts.clickonnextIMF();
	}

	//Scenario-24
	@When("Enter Return Quantity >=100K")
	public void enter_return_quantity_100k() throws InterruptedException {
		Thread.sleep(4000);
		contacts.EnterMore10000Qty();
	}
//-----------------Technical Scenarios----------------------	

	@When("Select Service Type Technical and Click on Create button")
	public void select_service_type_technical_and_click_on_create_button() throws InterruptedException {
		Thread.sleep(3000);
		contacts.clickoncreatebutton();
		Thread.sleep(3000);
		contacts.EnterSoldTo();
		Thread.sleep(4000);
		contacts.SoldToIdContact();
		Thread.sleep(5000);
		contacts.ReturnResonePSR();
		Thread.sleep(4000);

	}

	@When("Select Return Reason")
	public void select_return_reason() throws InterruptedException {
		Technical = new ContactPage_Technical(driver);
		Thread.sleep(4000);
		Technical.SelectRSFaildAtCustomerFactory();
	}

	@When("Click On Warranty Entitlement Check")
	public void click_on_warranty_entitlement_check() throws InterruptedException {
		Thread.sleep(15000);
		Technical.ClickOnWarrentyEntitlement();
		Thread.sleep(15000);

	}

	@When("Enter ProductUniqueID {string}")
	public void enter_product_unique_id(String prefix) {
		// Use an explicit wait if necessary, instead of Thread.sleep
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> textBoxes = wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Enter Product Unique Id']"))); // Get all the text boxes matching the XPath

		// Loop through the text boxes and enter the values
		for (int i = 0; i < textBoxes.size(); i++) {
			String value = prefix + (i + 1); 
			textBoxes.get(i).sendKeys(value);
		}

	}

	@When("click accelept")
	public void click_accelept() throws InterruptedException {
		Thread.sleep(5000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Accept']")));

			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Element still not clickable");
		}
	}

// -----------------Case Edit TC-1-------------

	@When("Click On Edit Option")
	public void click_on_edit_option() throws InterruptedException {
		Thread.sleep(5000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Edit']")));

			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Element still not clickable");
		}
	}

	@When("Click On Next after edit")
	public void click_on_next_after_edit() throws InterruptedException {
		Thread.sleep(8000);
		contacts.clickonnextafteredit();

	}

	@When("Click On Next after edit Case edit")
	public void click_on_next_after_edit_case_edit() throws InterruptedException {
		Thread.sleep(10000);
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//li//button[contains(text(),'Save for Later')]/..//button[contains(text(),'Next')]")));
			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
			System.out.println("Element still not clickable");
		}
		//contacts.ClickonNextAfterEdit();
	}
// -----------------Case Edit TC-Submitted Pending Action-------------

	@When("Click on Related option")
	public void click_on_related_option() throws InterruptedException {
		Thread.sleep(4000);
		contacts.ClickonRelated();
		Thread.sleep(4000);

	}

	@When("Click on View All cases option")
	public void click_on_view_all_cases_option() {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Create a WebDriverWait object
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//body/div/div[@aria-hidden='false']/section/div/div/div/div[@role='main']/section[@role='tabpanel']/div/div/section[@role='tabpanel']/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-contact_-record_-page1___-contact___-v-i-e-w/forcegenerated-flexipage_contact_record_page1_contact__view_js[@data-page-type='RecordPage']/record_flexipage-desktop-record-page-decorator/div/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div/div/slot[@name='main']/flexipage-component2[@data-component-id='flexipage_tabset']/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot[@name='tabs']/flexipage-tab2[@role='tabpanel']/slot/flexipage-component2[@data-component-id='force_relatedListContainer']/slot/lst-related-list-container/div/div/lst-related-list-single-container/laf-progressive-container[@aria-busy='false']/slot/lst-related-list-single-app-builder-mapper/article[@aria-label='Cases']/lst-related-list-view-manager/a/span[1]")));

			JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll the element into view
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			Actions actions = new Actions(driver); // Focus on the element
			actions.moveToElement(element).perform();
			js.executeScript("arguments[0].click();", element); // Click the element using JavaScript
		} catch (TimeoutException e) {
			System.out.println("Element not found or not clickable within the specified time");
		} finally {
		}
	}

	@When("click on case is Submitted Pending Action")
	public void click_on_case_is_submitted_pending_action() throws InterruptedException {
		// Locate the rows in the table
		Thread.sleep(4000);
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		// Iterate through each row
		for (WebElement row : rows) {
			// Get the status from the status column
			WebElement statusElement = row.findElement(By.xpath("//td[@data-label='Status']"));
			String status = statusElement.getText().trim();
			System.out.println(status + "Printed Status----------------------");
			// Check if the status is "Open" or "Unsubmitted"
			if (status.equals("Open") || status.equals("Unsubmitted")) {
				// Click on the corresponding case in the case column
				WebElement caseElement = row.findElement(By.xpath("//th[@data-label='Case']"));
				System.out.println(caseElement + "Printed Case number-------------------");
				caseElement.click();

				// Break if only one case should be clicked; otherwise, continue to click
				// multiple cases
				break;
			}
		}

	}

	@When("Click On FilterIcon")
	public void click_on_filter_icon() throws InterruptedException {
		Thread.sleep(4000);
		contacts.ClickonFilter();
	}

	@When("Enter CAse No into text field {string}")
	public void enter_c_ase_no_into_text_field(String string) throws InterruptedException {
		Thread.sleep(4000);
		contacts.EnterCaseintofield(string);
	}

	@When("Click On Apply button")
	public void click_on_apply_button() throws InterruptedException {
		Thread.sleep(4000);
		contacts.ClickOnAppy();
	}

	@When("Select searched case")
	public void select_searched_case() throws InterruptedException {
		Thread.sleep(4000);
		contacts.SelectSearchedcase();
	}

	@When("Click On Next after edit button")
	public void click_on_next_after_edit_button() throws InterruptedException {
		Thread.sleep(10000);
		contacts.Clickonextedit();
	}

//Technical Case Creation Scenario 1

	@When("Clickon PO History check button")
	public void clickon_po_history_check_button() throws InterruptedException {
		Thread.sleep(5000);
		Technical.POhistoryCheck();
	}

	@When("Click on PO Change popup Ok button")
	public void click_on_po_change_popup_ok_button() throws InterruptedException {
		Thread.sleep(5000);
		Technical.clickonOkButton();

	}

	@When("Click on Next After PO history check")
	public void click_on_next_after_po_history_check() throws InterruptedException {
		Thread.sleep(5000);
		Technical.clickonNext();
	}

	@When("Click On Credit price Validation")
	public void click_on_credit_price_validation() throws InterruptedException {
		Thread.sleep(5000);
		Technical.ClickOnCreditpriceValidation();
	}

	@When("Select All Line items check box")
	public void select_all_line_items_check_box() throws InterruptedException {
		Thread.sleep(5000);
		Technical.Unselectallcheckbox();
	}

	@When("Select First Check box")
	public void select_first_check_box() throws InterruptedException {
		Thread.sleep(5000);
		Technical.SelectFirstCheckbox();
	}

//Technical Case Creation Scenario 2

	@When("Select Remedy type is credit")
	public void select_remedy_type_is_credit() {
//		Technical = new ContactPage_Technical(driver);
//		Technical.selectremedy();

	}

	@When("Select Return Reason Faild at End Customer")
	public void select_return_reason_faild_at_end_customer() throws InterruptedException {
		Technical = new ContactPage_Technical(driver);
		Thread.sleep(6000);
		Technical.ReturnReasonFaildEndCustomer();
	}
//--------Technical test 3 case PO search functionality

	@When("Slect ReurnTo Customer address")
	public void slect_reurn_to_customer_address() throws InterruptedException {
		Thread.sleep(8000);
		Technical.RCA();
		Thread.sleep(5000);
		Technical.SelectRCA();
	}

	@When("Select Collection address")
	public void select_collection_address() throws InterruptedException {
		Thread.sleep(5000);
		Technical.ClickCA();
		Thread.sleep(5000);
		Technical.SelectCA();
		Thread.sleep(5000);

	}

	@When("Return to Customer Contact name")
	public void return_to_customer_contact_name() throws InterruptedException {
		Technical.ClickRCC();
		Thread.sleep(5000);
		Technical.selectRCC();

	}
//-------------Technical BulkUpload----------

	@When("Upload Bulk File {string}\"")
	public void upload_bulk_file(String string) throws AWTException, InterruptedException {
		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"\"C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1).csv\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		Thread.sleep(2000);
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}
//---------->25k----------------

	@When("Select Service Type Technical and Click on Create buttons only")
	public void select_service_type_technical_and_click_on_create_buttons_only() throws InterruptedException {

		Thread.sleep(4000);
		contacts.clickoncreatebutton();
		Thread.sleep(4000);
		contacts.EnterSoldTo();
		Thread.sleep(4000);
		contacts.SoldToIdContact();
		Thread.sleep(5000);

	}

	@When("Select Remedy credit")
	public void select_remedy_credit() throws InterruptedException {
		Technical = new ContactPage_Technical(driver);
		Thread.sleep(5000);
		Technical.SelectNPR();
		Thread.sleep(2000);
		Technical.CreditOption();
		Thread.sleep(3000);
		Technical.SelectReason();
		Thread.sleep(4000);
		Technical.SelectreasonFCFS();

	}

	@When("Select Remedy credit and reason")
	public void select_remedy_credit_and_reason() throws InterruptedException {
		Technical = new ContactPage_Technical(driver);
		Thread.sleep(5000);
		Technical.SelectNPR();
		Thread.sleep(5000);
		Technical.CreditOption();
		Thread.sleep(5000);
		Technical.SelectReason();
		Thread.sleep(4000);
		Technical.SelectFailedatCustomerFactorySite();
	}

	@When("Select Remedy credit and reason Fail Customer End")
	public void select_remedy_credit_and_reason_fail_customer_end() throws InterruptedException {
		Technical = new ContactPage_Technical(driver);
		Thread.sleep(5000);
		Technical.SelectNPR();
		Thread.sleep(4000);
		Technical.CreditOption();
		Thread.sleep(3000);
		Technical.SelectReason();
		Thread.sleep(3000);
		Technical.FailedatEndCustomer();
		Thread.sleep(4000);

	}

	@When("Select Return Reason Failed at Customer Factory Site")
	public void select_return_reason_failed_at_customer_factory_site() throws InterruptedException {

	}
//------------<25 k-------------------

	@When("Select All Line items with RM")
	public void select_all_line_items_with_rm() throws InterruptedException {
		Thread.sleep(4000);

		Technical.ClickOnAll();
		Thread.sleep(4000);
		Technical.Selectfirst();
	}

	@When("Click Next button after All Item selection")
	public void click_next_button_after_all_item_selection() throws InterruptedException {
		Thread.sleep(4000);
		Technical.NextAfterCheckAll();
	}

//------------>100K Price Override
	@When("Enter Credit price <100K")
	public void enter_credit_price_100k() throws InterruptedException {
		Technical.PricerGreterThan100K();
		Thread.sleep(4000);
		contacts.entertextintoreasonfield();
	}
//----------------NPR Bulk upload---------------------------

	@When("Click On create button and select remedy and select reason")
	public void click_on_create_button_and_select_remedy_and_select_reason() throws InterruptedException {
		Thread.sleep(3000);
		contacts.clickoncreatebutton();
		Thread.sleep(3000);
		contacts.EnterSoldTo();
		Thread.sleep(3000);
		contacts.SoldToIdContact();
		Thread.sleep(5000);
		Technical = new ContactPage_Technical(driver);
		Thread.sleep(3000);
		Technical.SelectNPR();
		Thread.sleep(3000);
		Technical.ClickOnNPR();
		Thread.sleep(3000);
		Technical.SelectReason();
		Thread.sleep(3000);
		Technical.SelectreasonFCFS();
	}
//-----------------NPR BulkIpload with ULT

	@When("Click On create button and select remedy and select reason customer site")
	public void click_on_create_button_and_select_remedy_and_select_reason_customer_site() throws InterruptedException {
		Thread.sleep(2000);
		contacts.clickoncreatebutton();
		Thread.sleep(2000);
		contacts.EnterSoldTo();
		Thread.sleep(2000);
		contacts.SoldToIdContact();
		Thread.sleep(5000);
		Technical = new ContactPage_Technical(driver);
		Thread.sleep(5000);
		Technical.SelectNPR();
		Thread.sleep(2000);
		Technical.ClickOnNPR();
		Thread.sleep(2000);
		Technical.SelectReason();
		Thread.sleep(2000);
		Technical.SelectFailcustomer();

	}
//-------------------NPR CPN case creation

	@When("Select First Item")
	public void select_first_item() throws InterruptedException {
		Thread.sleep(3000);
		Technical.Selectfirst();

	}
//------------------NPR Case creation with MM Search

	@When("Click On create button and select remedy and select reason  Warranty Service\\/Software")
	public void click_on_create_button_and_select_remedy_and_select_reason_warranty_service_software()
			throws InterruptedException {
		Thread.sleep(2000);
		contacts.clickoncreatebutton();
		Thread.sleep(2000);
		contacts.EnterSoldTo();
		Thread.sleep(2000);
		contacts.SoldToIdContact();
		Thread.sleep(5000);
		Technical = new ContactPage_Technical(driver);
		Technical.SelectNPR();
		Thread.sleep(2000);
		Technical.ClickOnNPR();
		Thread.sleep(2000);
		Technical.SelectReason();
		Thread.sleep(2000);
		Technical.SelectWarrentyService();
	}

//----------------NPR case creation Using OPN
	@When("Click On create button and select remedy and select reason  Simple")
	public void click_on_create_button_and_select_remedy_and_select_reason_simple() throws InterruptedException {
		Thread.sleep(2000);
		contacts.clickoncreatebutton();
		Thread.sleep(2000);
		contacts.EnterSoldTo();
		Thread.sleep(2000);
		contacts.SoldToIdContact();
		Thread.sleep(5000);
		Technical = new ContactPage_Technical(driver);
		Technical.SelectNPR();
		Thread.sleep(2000);
		Technical.ClickOnNPR();
		Thread.sleep(2000);
		Technical.SelectReason();
		Thread.sleep(2000);
		Technical.SelectSimpleReason();

	}
//-------------------With ULT using MM

	@When("Enter ULT Number {string}")
	public void enter_ult_number(String string) throws InterruptedException {
		Thread.sleep(2000);
		Technical.EnterULT(string);
	}

// ------------------with ULT is not mandatory

	@When("Select Service Type Technical and Click on Create button select remedy credit")
	public void select_service_type_technical_and_click_on_create_button_select_remedy_credit()
			throws InterruptedException {
		Thread.sleep(2000);

		contacts.clickoncreatebutton();
		Thread.sleep(2000);
		contacts.EnterSoldTo();
		Thread.sleep(2000);
		contacts.SoldToIdContact();
		Thread.sleep(5000);
		Technical = new ContactPage_Technical(driver);
		Thread.sleep(5000);
		Technical.SelectNPR();
		Thread.sleep(2000);
		Technical.Selectcredit();
		Thread.sleep(2000);
		Technical.SelectReason();
		Thread.sleep(2000);
		Technical.SelectFailcustomer();

	}
//-------------ULT Bulk Upload

	@When("User Click on Download ULT Template")
	public void user_click_on_download_ult_template() {
		Technical.ClickOnULTDownload();
	}

	@When("Upload Bulk File {string} ULT")
	public void upload_bulk_file_ult(String string) throws AWTException, InterruptedException {

		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\oyadavx\\Downloads\\ULT_BulkUploadTemplate.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		Thread.sleep(2000);
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);

	}
	
	//Bulk Upload File POC
	
	@When("Select Contact from list and enter Text into search field {string} and select Contacts")
	public void select_contact_from_list_and_enter_text_into_search_field_and_select_contacts(String string) throws InterruptedException {
		Thread.sleep(4000);
		contacts.SelectDropdownOption_Contacts(); // To select contact option
		Thread.sleep(8000);
		contacts.clickondropdown(); // To click on List view Dropdown
		Thread.sleep(3000);
		contacts.SelectTestContact(); // clickon recent view dropdown option
		Thread.sleep(3000);
		contacts.EntercontactNameintosearchfield(string); // To Enter Text into search field- RecentView
		Thread.sleep(5000);
	driver.findElement(By.xpath("//tbody/tr/td[1]/span[1]//following::th[@scope='row']")).click();		
Thread.sleep(10000);
	}
	@When("Upload Bulk File {string}\" with MM Ids")
	public void upload_bulk_file_with_mm_ids(String string) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		contacts.ClickonBulkUpload();
		Thread.sleep(2000);
		contacts.clickonUploadfileButton(string);
		Robot upload = new Robot();
		upload.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"\"C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1) - Copy.csv\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		upload.keyPress(KeyEvent.VK_CONTROL); // Key Press On key Board
		Thread.sleep(2000);
		upload.keyPress(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyRelease(KeyEvent.VK_CONTROL);
		upload.keyRelease(KeyEvent.VK_V);
		upload.delay(2000);
		upload.keyPress(KeyEvent.VK_ENTER);
		upload.keyRelease(KeyEvent.VK_ENTER);
	}
	

	@When("Select Service Type Technical and Click on Create buttons and Enter Sold To {string}")
	public void select_service_type_technical_and_click_on_create_buttons_and_enter_sold_to(String string) throws InterruptedException {
		Thread.sleep(4000);
		contacts.clickoncreatebutton();
		Thread.sleep(4000);
		
	   contacts.EnterSoldToNumber(string);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@role='option']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']")).click();
		Thread.sleep(5000);
	}	
	
@When("Enter text global and select {string}")
public void enter_text_global_and_select(String string) throws InterruptedException {
	contacts = new ContactPage_R4C_CaseCreation(driver);

	contacts.clickGlobal();
	Thread.sleep(2000);
	contacts.EnterTextGlobalfield(string);
	Thread.sleep(4000);
    contacts.SelectGlobalsearch();
	Thread.sleep(4000);


}

//-------------------Case Edit Technical
@When("Click Next After Selection of Check boxes")
public void click_next_after_selection_of_check_boxes() throws InterruptedException {
	Technical = new ContactPage_Technical(driver);
	Thread.sleep(7000);
	Technical.ClickOnNEXTAfterEditfirst();
	Thread.sleep(4000);
	Technical.ClickOnNEXTAfterEditsecond();
	Thread.sleep(4000);
    Technical.ClickOnNEXTAfterEditthird();
    
}

@When("Check RMA status")
public void check_rma_status() {
	
	
    Technical.checkRMAStatus();

}
@When("Click Next after EDIT Accept")
public void click_next_after_edit_accept() {
    driver.findElement(By.xpath("")).click();
}





}
