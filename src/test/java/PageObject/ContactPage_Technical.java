package PageObject;

<<<<<<< HEAD
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
=======
import java.util.List;

import org.openqa.selenium.By;
>>>>>>> 5199e9a122c3b8204da0c6f6aa466f404f2ae6f6
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

<<<<<<< HEAD
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

=======
>>>>>>> 5199e9a122c3b8204da0c6f6aa466f404f2ae6f6
public class ContactPage_Technical {
	public WebDriver ldriver;
	public WebDriver driver;
	public WaitHelper waitHelper;

	// private WebDriver rdriver;
	public ContactPage_Technical(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitHelper = new WaitHelper(driver); // Initialize WaitHelper
	}

// ---------------Technical--------------------
	@FindBy(xpath = "//lightning-base-combobox-item[1]//span[2]")
	WebElement SelectRSFaildAtCustomerFactory;
	@FindBy(xpath = "//button[@title=\"Warranty Entitlement Check\"]")
	WebElement ClickOnWarrentyEntitlement;
	@FindBy(xpath = "//input[@placeholder='Enter Product Unique Id']")
	WebElement EnterUID;

	@FindBy(xpath = "//span[normalize-space()='Accept']")
	WebElement Acceptclick;
//----------- Technical Test case No 1 Case Creation

	@FindBy(xpath = "//button[text()='PO History Check']")
	WebElement POHistoryCheck;
<<<<<<< HEAD
	@FindBy(xpath = "//button[normalize-space()='Ok']")
	WebElement ClickonOkButton;
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement ClickonNEXT;
	@FindBy(xpath = "//button[normalize-space()='Credit Price Validation']")
	WebElement ClickOnCreditpriceValidation;
	@FindBy(xpath = "//tbody/c-r4c_-a-g_-line-items-result-row[1]/td[1]/div[1]/span[1]/../../..//span[@part='indicator']")
	WebElement SelectFirstCheckbox;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[3]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/lightning-input[1]/lightning-primitive-input-checkbox[1]/div[1]/span[1]/label[1]/span[1]")
	WebElement Unselectallcheckbox;
//------------Technical Test Case 2----------
	@FindBy(xpath = "//body//div//lightning-base-combobox-item[2]")
	WebElement ReturnReasonFaildEndCustomer;
	@FindBy(xpath = "//body//div//lightning-base-combobox-item[1]//preceding::button[@aria-label='Remedy']")
	WebElement selectremedy;

//--------Technical test case PO search functionality
	@FindBy(xpath = "//label[text()='Return to Customer Address']")
	WebElement RCA;
	@FindBy(xpath = "//div[@aria-label='Return to Customer Address']//lightning-base-combobox-item[@role='option']//span//span[@title='ZAC DE LA MONTJAY,BONNEUIL 95 95500,France'][normalize-space()='ZAC DE LA MONTJAY,BONNEUIL 95 95500,France']")
	WebElement SelectRCA;
	@FindBy(xpath = "//button[@aria-label=\"Collection Address\"]")
	WebElement ClickCA;
	@FindBy(xpath = "//div[@aria-label='Collection Address']//lightning-base-combobox-item[@role='option']//span//span[@title='ZAC DE LA MONTJAY,BONNEUIL 95 95500,France'][normalize-space()='ZAC DE LA MONTJAY,BONNEUIL 95 95500,France']")
	WebElement SelectCA;
	@FindBy(xpath = "//button[@aria-label='Return to Customer Contact']")
	WebElement ClickRCC;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Return_To_Cst_Contact__c']//lightning-base-combobox-item[1]//span[2]//span[1]")
	WebElement SelectRCC;
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement NextAfterCheckAll;
	@FindBy(xpath = "//td[@scope='row']//span[contains(text(),'1')]//following::span[@part='indicator']")
	WebElement ClickOnAll;
	@FindBy(xpath = "//td[@scope='row']//span[contains(text(),'1')]//following::span[@part='indicator']")
	WebElement SelectF;
	@FindBy(xpath = "//span[@title='Failed at Customer Factory Site']")
	WebElement SelectFailedatCustomerFactorySite;
	@FindBy(xpath = "//span[@title='Failed at End Customer']")
	WebElement FailedatEndCustomer;
	@FindBy(xpath = "//input[@placeholder='Enter Credit Price']")
	WebElement EnterPrice100k;
	@FindBy(xpath = "//label[text()=\"Remedy\"]")
	WebElement SelectNPR;
	@FindBy(xpath = "//span[@title='NPR-Credit']")
	WebElement ClickOnNPR;
	@FindBy(xpath = "//label[text()=\"Return Reason\"]")
	WebElement SelectReasin;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Return_Reason__c']//lightning-base-combobox-item[3]//span[2]")
	WebElement SelectreasonFCFS;
	@FindBy(xpath = "//span[text()='Promotional Stock Rotation']")
	WebElement SelectPromationalStockRoatation;
	@FindBy(xpath = "//span[@title='Failed at End Customer']")
	WebElement SelectFailcustomer;
	@FindBy(xpath = "//span[@title='Warranty Service/Software']")
	WebElement SelectWarrentyService;
	@FindBy(xpath = "//input[@placeholder='Enter Product Unique Id']")
	WebElement EnterULT;
	@FindBy(xpath = "//span[@title='Sample']")
	WebElement SelectSimpleReason;
	@FindBy(xpath = "//span[@title='Credit']")
	WebElement Selectcredit;
	@FindBy(xpath = "//span[@title='Credit']")
	WebElement CreditOption;
	@FindBy(xpath = "//a[text()=\"Download ULT Template\"]")
	WebElement ClickOnULTDownload;

=======
	
	@FindBy(xpath="//button[normalize-space()='Ok']")
	WebElement ClickonOkButton;
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement ClickonNEXT;
	@FindBy(xpath="//button[normalize-space()='Credit Price Validation']")
	WebElement ClickOnCreditpriceValidation;
	@FindBy(xpath="//tbody/c-r4c_-a-g_-line-items-result-row[1]/td[1]/div[1]/span[1]/../../..//span[@part='indicator']")
	WebElement SelectFirstCheckbox;
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[3]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/lightning-input[1]/lightning-primitive-input-checkbox[1]/div[1]/span[1]/label[1]/span[1]")
	WebElement Unselectallcheckbox;
//------------Technical Test Case 2----------
	@FindBy(xpath="//body//div//lightning-base-combobox-item[2]")
	WebElement ReturnReasonFaildEndCustomer;
	
	@FindBy(xpath="//body//div//lightning-base-combobox-item[1]//preceding::button[@aria-label='Remedy']")
	WebElement selectremedy;
	
//--------Technical test case PO search functionality
@FindBy(xpath="//button[@aria-label='Return to Customer Address']/..//button[@aria-label='Return to Customer Address']")
WebElement RCA;
@FindBy(xpath="//div[@aria-label='Return to Customer Address']//lightning-base-combobox-item[@role='option']//span//span[@title='ZAC DE LA MONTJAY,BONNEUIL 95 95500,France'][normalize-space()='ZAC DE LA MONTJAY,BONNEUIL 95 95500,France']")
WebElement SelectRCA;
@FindBy(xpath="//button[@aria-label=\"Collection Address\"]")
WebElement ClickCA;
@FindBy(xpath="//div[@aria-label='Collection Address']//lightning-base-combobox-item[@role='option']//span//span[@title='ZAC DE LA MONTJAY,BONNEUIL 95 95500,France'][normalize-space()='ZAC DE LA MONTJAY,BONNEUIL 95 95500,France']")
WebElement SelectCA;
@FindBy(xpath="//button[@aria-label='Return to Customer Contact']")
WebElement ClickRCC;
@FindBy(xpath="//lightning-combobox[@data-name='Sales_Issue_Return_To_Cst_Contact__c']//lightning-base-combobox-item[1]//span[2]//span[1]")
WebElement SelectRCC;
	
	
	
>>>>>>> 5199e9a122c3b8204da0c6f6aa466f404f2ae6f6
//----------- Technical Test case No 1 Case Creation PO search

	public void SelectRSFaildAtCustomerFactory() {
		SelectRSFaildAtCustomerFactory.click();

	}

	public void ClickOnWarrentyEntitlement() {
		ClickOnWarrentyEntitlement.click();
	}

	public void clickonaccept() {

		Acceptclick.click();
	}

	public void POhistoryCheck()

	{
		POHistoryCheck.click();
	}
<<<<<<< HEAD

	public void clickonOkButton() {
		ClickonOkButton.click();

	}

	public void clickonNext() {
		ClickonNEXT.click();
	}

	public void ClickOnCreditpriceValidation() {
		ClickOnCreditpriceValidation.click();
	}

	public void SelectFirstCheckbox() {

		SelectFirstCheckbox.click();
	}

	public void Unselectallcheckbox() {
		Unselectallcheckbox.click();
	}

//--------Technical test case SO search case creation

	public void ReturnReasonFaildEndCustomer() {

		ReturnReasonFaildEndCustomer.click();
	}

	public void selectremedy() {
		selectremedy.click();

	}
//--------Technical test case PO search functionality

	public void RCA() {
		RCA.click();
	}

	public void SelectRCA() {
		SelectRCA.click();
	}

	public void ClickCA() {
		ClickCA.click();
	}

	public void SelectCA() {
		SelectCA.click();
	}

	public void ClickRCC() {
		ClickRCC.click();
	}

	public void selectRCC() {
		SelectRCC.click();
	}
//-------------Technical <25K----------

	public void NextAfterCheckAll() {
		NextAfterCheckAll.click();
	}

	public void ClickOnAll() {
		ClickOnAll.click();
	}

	public void Selectfirst() {
		SelectF.click();
	}

	public void SelectFailedatCustomerFactorySite() {
		SelectFailedatCustomerFactorySite.click();
	}

	public void FailedatEndCustomer() {
		FailedatEndCustomer.click();
	}
//---------------Technical >100k

	public void PricerGreterThan100K() {
		EnterPrice100k.sendKeys("100000");
	}
//-----------------------NPR Bulk Upload----------------------

	public void SelectNPR() {
		SelectNPR.click();
	}

	public void ClickOnNPR() {
		ClickOnNPR.click();
	}

	public void SelectReason() {
		SelectReasin.click();
	}

	public void SelectreasonFCFS() {
		SelectreasonFCFS.click();
	}

	public void SelectPromationalStockRoatation() {
		SelectPromationalStockRoatation.click();
	}

	public void SelectFailcustomer() {
		SelectFailcustomer.click();
	}

	public void SelectWarrentyService() {
		SelectWarrentyService.click();
	}

	public void SelectSimpleReason() {
		SelectSimpleReason.click();
	}

	public void EnterULT(String ULT) {
		EnterULT.sendKeys(ULT);
	}

	public void Selectcredit() {
		Selectcredit.click();
	}

	public void CreditOption() {
		CreditOption.click();
	}

//---------BulkUpload ULT

	public void ClickOnULTDownload() {
		ClickOnULTDownload.click();
	}
=======
	public void clickonOkButton() 
	{
		ClickonOkButton.click();
		
	}
	public void clickonNext() 
	{
		ClickonNEXT.click();
	}
	public void ClickOnCreditpriceValidation()
	{
		ClickOnCreditpriceValidation.click();
	}
	public void SelectFirstCheckbox() 
	{
		
		SelectFirstCheckbox.click();
	}
	
	public void Unselectallcheckbox() 
	{
		Unselectallcheckbox.click();
	}
	
//--------Technical test case SO search case creation
	
	public void ReturnReasonFaildEndCustomer() 
	{
		
		ReturnReasonFaildEndCustomer.click();
	}
	
	public void selectremedy() 
	{
		selectremedy.click();
		
	}
//--------Technical test case PO search functionality

	
	public void RCA() 
	{
		RCA.click();
	}
	public void SelectRCA() 
	{
		SelectRCA.click();
	}
	public void ClickCA()
	{
		ClickCA.click();
	}
	public void SelectCA() 
	{
		SelectCA.click();
	}
	public void ClickRCC() 
	{
		ClickRCC.click();
	}
	
	public void selectRCC() 
	{
		SelectRCC.click();
	}
//-------------Technical BulkUpload----------
	
	
>>>>>>> 5199e9a122c3b8204da0c6f6aa466f404f2ae6f6

}
