package PageObject;

import java.awt.event.InputEvent;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utils.WaitUtils;

public class ContactPage_R4C_CaseCreation {
	public WebDriver ldriver;
	public WaitHelper waitHelper;
	public WebDriver driver;
	public WaitUtils waitUtils;

	public ContactPage_R4C_CaseCreation(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
		waitHelper = new WaitHelper(driver);
		waitUtils = new WaitUtils(driver); // Initialize wait utility

	}

	// --------------------------Scenario 1 Xpath Element----------

	@FindBy(xpath = "//button[@title=\"Show Navigation Menu\"]")
	WebElement clickoncontactdropdown;
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity'][normalize-space()='Contacts']")
	WebElement SelectContacts;
	@FindBy(xpath = "//span[@class='triggerLinkText selectedListView slds-page-header__title slds-truncate slds-p-right--xx-small lst-temp-slds-lineHeight uiOutputText']")
	WebElement clickViewDropdown;
	@FindBy(xpath = "//span[@class=' virtualAutocompleteOptionText'][normalize-space()='Recently Viewed Contacts']")
	WebElement SelectRecentViewcontact;
	@FindBy(xpath = "//input[@placeholder='Search this list...']")
	WebElement EnterSearchcontact;
	@FindBy(xpath = "//button[normalize-space()='Search...']")
	WebElement EnterTextGolbarsearch;
	@FindBy(xpath = "//a[normalize-space()='Sarah Aggelidis']")
	WebElement selecttextcontact;
	// Global search POC
	@FindBy(xpath = "//button[@aria-label='Search']/..//lightning-primitive-icon[@variant='bare']")
	WebElement clickGlobal;
	@FindBy(xpath = "//lightning-layout[1]//slot[1]//lightning-layout-item[1]//slot[1]//div[1]//span[1]//c-r4c_-a-g_-reusable-lookup[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//lightning-input[1]//lightning-primitive-input-simple[1]//div[1]//div[1]//input[1]")
	WebElement clickonsoldtobox;
	// @FindBy(xpath = "//button[normalize-space()='New R4C Case']") // Click on the
	// CreateR4CCase button
	@FindBy(xpath = "//section[@aria-expanded='true']//section[@role='tabpanel']//button[@type='button'][normalize-space()='New R4C Case']")
	WebElement ClickonNewR4CCaseButton;
	@FindBy(xpath = "//span[@part='label'][normalize-space()='Stock Rotation']/..//span[@part='indicator']") // To // //
																												// //
																												// Roatation
	WebElement clickonservicetype;
	// @FindBy(xpath = "//button[normalize-space()='Create']") // To click on the
	// create button old
	@FindBy(xpath = "//div[@slot='footer']//button[@type='button'][normalize-space()='Cancel']//following::button[normalize-space()='Create']")
	WebElement clickoncreatebutton;
// By Using Axes Sibbling
	@FindBy(xpath = "//label[text()='Sold To']/following-sibling::div//input")
	WebElement EnterSoldto; // Enter Sold To id into fields
	@FindBy(xpath = "//span[text()='6006683685-ALSO Deutschland GmbH']/ancestor::li") // To select searched contact
	WebElement Clickonsoldtocontacts; // Click on sild to detils on dropdown
	@FindBy(xpath = "//label[text()='Return Reason']/following-sibling::div")
	WebElement ClickonReturnreasondropdown; // To click on the return reason Dropdown
	@FindBy(xpath = "//span[text()='Standard Stock Rotation']/ancestor::lightning-base-combobox-item")
	WebElement selectStandardStockRotation; // To select Stock Rotation from from dropdown
	@FindBy(xpath = "//button[normalize-space()='Next']")
	WebElement clickonnextaftersuldto;
	@FindBy(xpath = "//span[contains(text(),'Purchase/Sales Order')]/..//span[@class='slds-radio_faux']")
	WebElement ClickonPO; // To click PO radio button
	@FindBy(xpath = "//span[normalize-space()='PO Number']//following::input[@placeholder='Enter PO Number (use commas between multiple values)']")
	WebElement enterPOnumber; // To Enter PO number into the test field
	@FindBy(xpath = "//button[normalize-space()='Reset']//following::button[normalize-space()='Search']")
	WebElement Clickonsearch;
	@FindBy(xpath = "//a[normalize-space()='MM']/../..//span[@part='indicator']")
	WebElement selectAllcheckbox;
	@FindBy(xpath = "//button[normalize-space()='Cancel']//following::button[contains(text(),'Next')]")
	WebElement AfterPONumberclickonNext;
	@FindBy(xpath = "//button[normalize-space()='Product Validation']")
	WebElement ProductvalidationButton;
	@FindBy(xpath = "//button[text()=\"Next\"]")
	WebElement ClickonNextAfterProductvalidation; // To click on the next button after Product validation check box
	@FindBy(xpath = "(//input[@inputmode=\"decimal\"])[1]") // To Enter Return Quantity To all field
	WebElement enterquantityfirst;
	@FindBy(xpath = "//button[normalize-space()='Clone']//following::button[normalize-space()='Get Credit Price']")
	WebElement Clickongetcreditprice;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]/div[1]/lightning-input[1]/lightning-primitive-input-checkbox[1]/div[1]/span[1]/label[1]/span[1]")
	WebElement UnselectAfterPriceCheckboxes;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[1]/div[1]/table[1]/tbody[1]/c-r4c_-a-g_-line-items-result-row[1]/td[2]/div[1]/lightning-input[1]/lightning-primitive-input-checkbox[1]/div[1]/span[1]/label[1]/span[1]")
	WebElement SelectfirstCheckbox;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[1]/div[1]/table[1]/tbody[1]/c-r4c_-a-g_-line-items-result-row[2]/td[2]/div[1]/lightning-input[1]/lightning-primitive-input-checkbox[1]/div[1]/span[1]/label[1]/span[1]")
	WebElement SelectSecondCheckbox;
	@FindBy(xpath = "//input[@placeholder='Enter Credit Price']")
	WebElement EnterPrice;
	@FindBy(xpath = "//input[@placeholder='Enter Reason']")
	WebElement EnterText;
	@FindBy(xpath = "//button[normalize-space()='Save for Later']//preceding::button[contains(text(),'Next')]")
	WebElement AfterCreditpriceNext;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[3]/div[1]/c-r4c_-a-g_-p-o-search[1]/div[1]/div[1]/div[2]/c-r4c_-a-g_-line-items-result-table[1]/div[1]/div[1]/table[1]/tbody[1]/c-r4c_-a-g_-line-items-result-row[2]/td[13]/span[1]/span[1]/lightning-input[1]/lightning-primitive-input-simple[1]/div[1]/div[1]/input[1]")
	WebElement ResoneintoSecondFields;
	@FindBy(xpath = "//button[@title='Cancel']//following::button[normalize-space()='Validate Allowance']")
	WebElement ValidateAllownce;
	@FindBy(xpath = "//button[@title='Cancel']//following::button[normalize-space()='Save & View Summary']")
	WebElement SaveSummary;
	@FindBy(xpath = "//button[text()=\"Submit\"]")
	WebElement ClickonsubmitafterSave;
// --------------------------Scenario 2 Xpath Element----------
	@FindBy(xpath = "//span[normalize-space()='SO Number']//following::input[@placeholder='Enter SO Number (use commas between multiple values)']") // Enter
	WebElement EnterSONumber;
// --------------------------Scenario 3 Xpath Element----------
	@FindBy(xpath = "//span[contains(text(),'6006683685-ALSO Deutschland GmbH')]")
	WebElement SoldToIdContact;
	@FindBy(xpath = "(//button[@name=\"Select one\"])[2]")
	WebElement ReturnReasonPSR;
	@FindBy(xpath = "//span[@title='Promotional Stock Rotation']")
	WebElement SelectPSR;
	@FindBy(xpath = "//span[normalize-space()='Search By:']//following::span[contains(text(),'Product')]")
	WebElement ClickonProductradioButton;
	@FindBy(xpath = "//span[contains(text(),'MM')]/..//span[contains(text(),'MM')]") // To click on the MM Radio Button
	WebElement ClickOnMMRadioButton;
	@FindBy(xpath = "//button[normalize-space()='Reset']//preceding::input[@placeholder='Enter the MM']") // To Enter MM
	WebElement EnterMMNumber;
	@FindBy(xpath = "//button[normalize-space()='Reset']//following::button[normalize-space()='Search']") // To click on
	WebElement ClickonSearchButtonAfterMM;
	@FindBy(xpath = "//button[normalize-space()='Cancel']//preceding::button[normalize-space()='PO History']") // To
	WebElement POHistoryButton;
	@FindBy(xpath = "//button[normalize-space()='Cancel']//following::button[contains(text(),'Next')]") // To click on
	WebElement POHistoryNext;
// ----------------------Scenario 4 Xpath Element----------
	@FindBy(xpath = "//span[contains(text(),'Bulk Upload')]/..//span") // To click on the bulk upload button
	WebElement BulkUploadRadioButton;
	@FindBy(xpath = "//button[normalize-space()='Reset']//preceding::span[@part='button']") // To click on the Upload
	WebElement UploadFile;
	@FindBy(xpath = "//button[normalize-space()='Reset']//following::button[normalize-space()='Validate']") // To Click
	WebElement ClickonValidate;
// ------------------------Scenario 8  Xpath Element--------------
	@FindBy(xpath = "//body//div//lightning-input[@data-key='CPN']//span//span[1]//following::span[contains(text(),'CPN')]") // To
	WebElement ClickOnCPN;
	@FindBy(xpath = "//button[normalize-space()='Reset']//preceding::input[@placeholder='Enter the CPN']") // To Enter
	WebElement EnterCPN;
	@FindBy(xpath = "//button[normalize-space()='Reset']//following::button[normalize-space()='Search']") // To Click on
	WebElement AfterCPNSearch;
//------------------------Scenario 9   Xpath Elelemnt---------------------
	@FindBy(xpath = "//span[contains(text(),'Order Part Number')]/..//span") // To Click On the OPN Radio Button
	WebElement ClickonOPNRadiobutton;
	@FindBy(xpath = "//button[normalize-space()='Reset']//preceding::input[@placeholder='Enter the Order Part Number']")
	WebElement EnterOPN;
//----------------------Scenario 12-----------------------	
	@FindBy(xpath = "//button[contains(text(),'Next')]//following::button[normalize-space()='Save for Later']")
	WebElement MMSaveforlater;
	@FindBy(xpath = "//div[@part='modal-footer']//button[@part='button'][normalize-space()='Cancel']//following::button[normalize-space()='OK']")
	WebElement ClickonOkButton;
	@FindBy(xpath = "//span[normalize-space()='Status']//following::lightning-formatted-text[normalize-space()='Open, Unsubmitted']")
	WebElement getSavedstatustext;
// -------------------Scenario 14 S
	@FindBy(xpath = "//input[@placeholder=\"Select one\"]")
	WebElement SelectL3User;
	@FindBy(xpath = "//li[@data-id='vinayx.kumar.ganji@intel.com']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']//following::span[contains(text(),'Vinay Kumar Ganji')]")
	WebElement L3agent;
	@FindBy(xpath = "//div[@part='modal-footer']//button[@type='button'][normalize-space()='Cancel']//following::button[normalize-space()='Select']")
	WebElement ClickonselectL3;
	@FindBy(xpath = "//div[@part='modal-footer']//button[@type='button'][normalize-space()='Cancel']//following::button[normalize-space()='Select']")
	WebElement SelectL3user;
// -------------------Scenario 15 
	By ClickonAccept = By.xpath("//ul[contains(.,'Post')]/li/a[@title='Accept']");
	@FindBy(xpath = "//section[@aria-expanded='true']//slot//slot//span[contains(text(),'Accept')]/../../..//span[contains(text(),'Edit')]")
	WebElement ClickonEdit;
	@FindBy(xpath = "//flexipage-component2[@data-component-id='forceChatter_publisher']//span[contains(text(),'Post')]/../../../../..//p")
	WebElement EnterTextintoPost;
// Scenario 16-------------------------
	@FindBy(xpath = "//span[contains(text(),'0000500908-Ingram Micro LP')]")
	WebElement SoldTOcontactSelect;
	@FindBy(xpath = "//button[normalize-space()='OK']/..//button[@part='button'][normalize-space()='Cancel']")
	WebElement IMFCancel;
// Scenario 17--------------
	@FindBy(xpath = "//div[@part='modal-footer']//button[@part='button'][normalize-space()='Cancel']//following::button[normalize-space()='OK']")
	WebElement ClickOnOKIMF;
// Scenario 18----------------------------------------
	@FindBy(xpath = "//button[@aria-label='Return to Customer Address']/..//button[@aria-label='Return to Customer Address']")
	WebElement ClickonCRA;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Return_To_Cst_Address__c']//lightning-base-combobox-item[2]//span[2]")
	WebElement SelectCRA;
	@FindBy(xpath = "//button[@aria-label=\"Collection Address\"]")
	WebElement ClickCA;
	@FindBy(xpath = "//span[@title='X DOCK,Amsterdam,Noord-Holland,Netherlands']")
	WebElement SelectCA;
	@FindBy(xpath = "//button[@aria-label='Return to Customer Contact']")
	WebElement ClickonRCC;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Return_To_Cst_Contact__c']//lightning-base-combobox-item[1]//span[2]")
	WebElement SelectRCC;
	@FindBy(xpath = "//button[@aria-label='Collection Contact']")
	WebElement ClickonCollectionContact;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Collection_Contact__c']//lightning-base-combobox-item[1]//span[2]")
	WebElement SelectCollectionContacts;
	@FindBy(xpath = "//button[@title='Cancel']//following::button[normalize-space()='Next']")
	WebElement clickonNextIMF;
// ---------------Edit Case
	@FindBy(xpath = "//button[@title='Cancel']//following::button[contains(text(),'Next')]")
	WebElement Clicknextedit;
	@FindBy(xpath = "//c-r4c_-a-g_-case-edit//li//button[contains(text(),'Cancel')]//following::button[contains(text(),'Next')]")
	WebElement clickonnextafteredit;
	@FindBy(xpath = "//li//button[contains(text(),'Save for Later')]/..//button[contains(text(),'Next')]")
	WebElement ClickonNextAfterEdit;
	@FindBy(xpath = "//body/div/div[@aria-hidden='false']/section/div/div/div/div[@role='main']/section[@role='tabpanel']/div/div/section[@role='tabpanel']/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___-contact_-record_-page1___-contact___-v-i-e-w/forcegenerated-flexipage_contact_record_page1_contact__view_js[@data-page-type='RecordPage']/record_flexipage-desktop-record-page-decorator/div/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div/div/slot[@name='main']/flexipage-component2[@data-component-id='flexipage_tabset']/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot[@name='tabs']/flexipage-tab2[@role='tabpanel']/slot/flexipage-component2[@data-component-id='force_relatedListContainer']/slot/lst-related-list-container/div/div/lst-related-list-single-container/laf-progressive-container[@aria-busy='false']/slot/lst-related-list-single-app-builder-mapper/article[@aria-label='Cases']/lst-related-list-view-manager/a/span[1]")
	WebElement ClickonALLcases;
	@FindBy(xpath = "//section[@aria-expanded='true']//a[@data-label='Details'][normalize-space()='Details']//following::a[@data-label='Related'][normalize-space()='Related']")
	WebElement ClickonRelated;
	@FindBy(xpath = "//button[@aria-label='Search']")
	WebElement globaltextenter; // enter Text Globaly

// -----------------Case Edit TC-Submitted Pending Action-------------

	@FindBy(xpath = "//button[@title='Show quick filters']")
	WebElement ClickOnfilter;
	@FindBy(xpath = "//label[normalize-space()='Case']//following::input[@name='Case-CaseNumber']")
	WebElement EnterTextIntocasefield;
	@FindBy(xpath = "//button[normalize-space()='Apply']")
	WebElement Clickonapply;
	@FindBy(xpath = "//tbody/tr[@role='row']/th[@data-label='Case']/lightning-primitive-cell-factory[@data-label='Case']/span[1]")
	WebElement SelectCase;
	@FindBy(xpath = "(//button[text()=\"Next\"])[2]")
	WebElement clickonNextAccept;
	@FindBy(xpath = "//tbody/tr[1]/th[1]")
	WebElement ClickOnFirstSearch;
	@FindBy(xpath = "//input[@placeholder='Search this list...']")
	WebElement Entertext;
	@FindBy(xpath = "//label[text()=\"Return Reason\"]")
	WebElement Clickonreason;
	@FindBy(xpath = "//a[text()=\"Amy Adamo\"]")
	WebElement selecttext;
	@FindBy(xpath = "//tbody/tr[1]/th[1]/span[1]")
	WebElement selectsearchcontacts;
	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement EnterTextGlobalfield;
	@FindBy(xpath = "//body/div/div/div[@role='dialog']/div/div/div/div/div/div/search_dialog-instant-results-list[@aria-controls='preview']/div[@aria-label='Suggestions']/search_dialog-instant-result-item[2]/div[1]")
	WebElement SelectGlobalsearch;
	@FindBy(xpath = "//body//div//c-r4c_-a-g_-collection-details//lightning-base-combobox-item[1]")
	WebElement SelectFirstRCA;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Cst_Collection_Address__c']//lightning-base-combobox-item[1]")
	WebElement SelectFirstCA;

	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Return_To_Cst_Contact__c']//lightning-base-combobox-item[1]")
	WebElement SelectFirstRCC;
	@FindBy(xpath = "//lightning-combobox[@data-name='Sales_Issue_Collection_Contact__c']//lightning-base-combobox-item[1]")
	WebElement SelectFirstcc;

// -------------Scenario No 1---------------------Action Methods----------------------
	public String getPageTitle() {
		return ldriver.getTitle();
	}

	public void Clickoncontactdropdown() {

		clickoncontactdropdown.click();
	}

	public void SelectDropdownOption_Contacts() {

		SelectContacts.click();
	}

	public void clickondropdown() {

		clickViewDropdown.click();
	}

	public void SelectTestContact() {

		SelectRecentViewcontact.click();
	}

	public void EnterTextGlobaly() {
		EnterTextGolbarsearch.sendKeys("Sarah");
	}

	public void EntercontactNameintosearchfield(String Name) {
		EnterSearchcontact.sendKeys(Name); // To enter Text into search field
		EnterSearchcontact.sendKeys(Keys.RETURN); // To Click on ENter Button
	}

	public void selecttestcontact() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(selecttextcontact));
		selecttextcontact.click();
	}

	public void clickonR4CCaseButton() throws InterruptedException {
		waitUtils.waitForElementVisibility(ClickonNewR4CCaseButton, 10); // Wait for 10 seconds
		ClickonNewR4CCaseButton.click();
	}

	public void selectserviceType() {

		clickonservicetype.click();
	}

	public void clickoncreatebutton() {

		clickoncreatebutton.click();
	}

	public void EnterSoldTo() throws InterruptedException {

		EnterSoldto.click();
		EnterSoldto.sendKeys("6006683685");
	}

	public void EnterSoldToNumber(String string) throws InterruptedException {
		EnterSoldto.click();
		Thread.sleep(4000);
		EnterSoldto.sendKeys(string);

	}

	public void EnterSoldToOptIn() throws InterruptedException {
		EnterSoldto.click();
		EnterSoldto.sendKeys("500908");
	}

	public void Selectsearchedcontact() {

		Clickonsoldtocontacts.click();
	}

	public void clickonreturnreson() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ClickonReturnreasondropdown));
		ClickonReturnreasondropdown.click();
	}

	public void selectstockrotation() {

		selectStandardStockRotation.click();
	}

	public void clickonnectaftersold() {
		clickonnextaftersuldto.click();
	}

	public void clickonPORadiobutton() {
		// waitUtils.waitForElementVisibility(ClickonPO, 10); // Wait for 10 seconds
		ClickonPO.click();
	}

	public void EnterPONumber(String PONumber) {
		// waitUtils.waitForElementVisibility(enterPOnumber, 10); // Wait for 10 seconds
		enterPOnumber.sendKeys(PONumber);
	}

	public void clickonsearch() {
		// waitUtils.waitForElementVisibility(Clickonsearch, 10); // Wait for 10 seconds
		Clickonsearch.click();
	}

	public void selectallcheckbox() {
		// waitUtils.waitForElementVisibility(selectAllcheckbox, 10); // Wait for 10
		// seconds
		selectAllcheckbox.click();
	}

	public void clickonnextPO() {
		// waitUtils.waitForElementVisibility(AfterPONumberclickonNext, 10); // Wait for
		// 10 seconds
		AfterPONumberclickonNext.click();
	}

	public void clickonproductvalidation() {
		// waitUtils.waitForElementVisibility(ProductvalidationButton, 10); // Wait for
		// 10 seconds
		ProductvalidationButton.click();
	}

	public void clickonnextafterPO() {
		// waitUtils.waitForElementVisibility(ClickonNextAfterProductvalidation, 10); //
		// Wait for 10 seconds
		ClickonNextAfterProductvalidation.click();
	}

	public void enterQuantityfirst() {
		// waitUtils.waitForElementVisibility(enterquantityfirst, 10); // Wait for 10
		// seconds
		enterquantityfirst.sendKeys("1");
	}

	public void EnterMore10000Qty() {
		// waitUtils.waitForElementVisibility(enterquantityfirst, 10); // Wait for 10
		// seconds
		enterquantityfirst.sendKeys("100000");
	}

	public void clickongetcreditprice() {
		// waitUtils.waitForElementVisibility(Clickongetcreditprice, 10); // Wait for 10
		// seconds
		Clickongetcreditprice.click();
	}

	public void EnterPrice() {

		EnterPrice.sendKeys("1100");
	}

	public void pricelessthan25k() {
		EnterPrice.sendKeys("24000");
	}

	public void PricerGreterThan25K() {
		EnterPrice.sendKeys("30000");
	}

	public void entertextintoreasonfield() {
		EnterText.sendKeys("Test Case ");
	}

	public void AfterCreditpriceNext() {
		AfterCreditpriceNext.click();
	}

	public void validateallownace() {
		ValidateAllownce.click();
	}

	public void clicksavesummery() {
		SaveSummary.click();
	}

	public void ClickonSubmitAftersummery() {
		ClickonsubmitafterSave.click();
	}

	public void clickonNextAccept() {
		clickonNextAccept.click();

	}

//-------------------- Scenario 2-----------------

	public void EnterSONumber(String SOnumber) {
		EnterSONumber.sendKeys(SOnumber);

	}
//----------------------- Scenario 3--------------------

	public void ReturnResonePSR() {
		ReturnReasonPSR.click();
	}

	public void clickonProductRadioButton() {
		ClickonProductradioButton.click();
	}

	public void SelectMMRadioButton() {
		ClickOnMMRadioButton.click();
	}

	public void EnterMM(String MMID) {
		EnterMMNumber.sendKeys(MMID);
	}

	public void ClickOnSearchAfterMM() {
		ClickonSearchButtonAfterMM.click();
	}

	public void SoldToIdContact() {
		SoldToIdContact.click();
	}

	public void ReturnPSRselect() {
		SelectPSR.click();
	}

	public void clickOnPOHistory() {
		POHistoryButton.click();
	}

	public void clickonNextAfterPOHistory() {
		POHistoryNext.click();
	}

// -------------------Scenario 4 --------- Methods---------

	public void ClickonBulkUpload() {
		BulkUploadRadioButton.click();
	}

	public void clickonUploadfileButton(String string2) {
		UploadFile.click();

	}

	public void ValidateAfterUpload() {

		ClickonValidate.click();
	}

//------------- Scenario 8------------
	public void ClickonCPN() {

		ClickOnCPN.click();
	}

	public void EnterCPN() {
		EnterCPN.sendKeys("4244594");
	}

	public void SearchCPN() {

		AfterCPNSearch.click();

	}

//--------Scenario 9----------------
	public void SelectOPNradiobutton() {
		ClickonOPNRadiobutton.click();
	}

	public void EnterOPN(String OPN) {
		EnterOPN.sendKeys(OPN);
	}

//----------Scenario  12------------------------	
	public void ClickonSaveforlater() {
		MMSaveforlater.click();
	}

	public void ClickonOKButton() {
		ClickonOkButton.click();
	}

	public String StatusValidation() {
		return getSavedstatustext.getText();
	}

//------------------Scenario 14
	public void selectL3User() {
		SelectL3User.click();
	}

	public void clickonL3Select() {
		L3agent.click();
		// ClickonselectL3.click();
	}

	public void selectL3agent() {

		SelectL3user.click();
	}
// --------------------Scenario 15 Edit Case

	public void ClickonAcceptButton() throws AWTException, InterruptedException {

		WebElement xpath = driver.findElement(By.xpath("//ul[contains(.,'Post')]/li/a[@title='Accept']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClickonAccept));
		Actions actions = new Actions(driver);
		actions.moveToElement(xpath).build().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ClickonAccept);
		js.executeScript("arguments[0].click();", ClickonAccept);

	}

	public void ClickOnCaseEdit() {
		ClickonEdit.click();

	}
// --------------------Scenario 16 OptIn Cancel

	public void selectsoldToContact() {
		SoldTOcontactSelect.click();
	}

	public void clickoncancelIMF() {

		IMFCancel.click();
	}

	public void ClickOnFirstSearch() {

		ClickOnFirstSearch.click();
	}

// Scenario 17Optin/Out Ok---------
	public void clickononIMF() {
		ClickOnOKIMF.click();
	}

	public void clickonsoldtobox(String sold) {
		clickonsoldtobox.click();
		clickonsoldtobox.sendKeys(sold);
	}

	public void Entersearchthistext() {
		Entertext.sendKeys("Amy Adamo");
	}

	public void selectsarah() {
		Entertext.sendKeys("Sarah Aggelidis");

	}

	public void selectsearchcontacts() {
		selectsearchcontacts.click();
	}

	public void selecttext() {
		selecttext.click();
	}

	public void clickonreturnreason() {
		Clickonreason.click();

	}

// Scenario 18 Optin/Out GEO---------

	public void ClickOnRCA() {
		ClickonCRA.click();
	}

	public void selectRCA() {
		SelectCRA.click();
	}

	public void ClickonCA() {
		ClickCA.click();
	}

	public void SelectCA() {
		SelectCA.click();
	}

	public void clickonRCC() {
		ClickonRCC.click();
	}

	public void selectRCC() {
		SelectRCC.click();
	}

	public void ClickonCC() {
		ClickonCollectionContact.click();

	}

	public void SelectCC() {
		SelectCollectionContacts.click();

	}

	public void clickonnextIMF() {
		WaitHelper.waitForElementToBeClickable(driver, clickonNextIMF);
		clickonNextIMF.click();
	}

//-------------------Case Edit-----------------

	public void clickonnextafteredit() {
		clickonnextafteredit.click();
	}

	public void ClickonNextAfterEdit() {

		ClickonNextAfterEdit.click();
	}
//-----------------Case Edit TC-Submitted Pending Action-------------

	public void ClickonRelated() {
		ClickonRelated.click();
	}

	public void ClickonALLcase() {
		ClickonALLcases.click();
	}

	public void globaltextenter() {
		globaltextenter.sendKeys("78263786");

	}

	public void ClickonFilter() {
		ClickOnfilter.click();
	}

	public void EnterCaseintofield(String Case) {
		EnterTextIntocasefield.sendKeys(Case);
	}

	public void ClickOnAppy() {
		Clickonapply.click();

	}

	public void SelectSearchedcase() {
		SelectCase.click();
	}

	public void Clickonextedit() {
		Clicknextedit.click();
	}

	public void clickGlobal() {
		clickGlobal.click();
	}

	public void EnterTextGlobalfield(String string) {
		EnterTextGlobalfield.sendKeys(string);

	}

	public void SelectGlobalsearch() throws InterruptedException {
		Thread.sleep(4000);
		SelectGlobalsearch.click();

	}

	@FindBy(xpath = "//lightning-formatted-text[text()=\"Open, Unsubmitted\"]")
	WebElement statusOpenUn;

	public void statusOpenUn() {
		// Fetch the text from the element
		String actualText = statusOpenUn.getText();
		actualText.equals("Open, Unsubmitted");
		Assert.assertEquals(actualText, "Open, Unsubmitted");
	}

	public void enterUserName(String userName) {
		EnterTextGlobalfield.sendKeys(userName);
	}

	public void enterSoldTo(String soldTo) {
		clickonsoldtobox.sendKeys(soldTo);
	}

	public void SelectFirstRCA() {

		SelectFirstRCA.click();
	}

	public void SelectFirstCA() {
		SelectFirstCA.click();
	}

	public void SelectFirstRCC() {
		SelectFirstRCC.click();

	}

	public void SelectFirstcc() {
		SelectFirstcc.click();
	}

	@FindBy(xpath = "//th[@scope='row']")
	List<WebElement> PrintActiveMMIds;

// Print Active MMIds Into Console
	public void PrintActiveMMIds() {
		// Loop through each element in the list and print its text
		for (WebElement mmId : PrintActiveMMIds) {
			String MMId = mmId.getText();
			System.out.println("Active MMId: " + MMId);
		}
	}

	@FindBy(xpath = "(//input[@inputmode='decimal'])")
	List<WebElement> decimalInputFields;

	public void enterValueInDecimalFields() {
		// Loop through each input field and enter the value "1"
		for (WebElement inputField : decimalInputFields) {
			inputField.clear(); // Optional: clear any existing value
			inputField.sendKeys("1"); // Enter the value "100"
		}

	}

	@FindBy(xpath = "//input[@placeholder='Enter Credit Price']")
	List<WebElement> EnterPriceIntoAllFields;

	public void EnterPriceIntoAllFields() {
		// Loop through each input field and enter the value "1"
		for (WebElement inputField : EnterPriceIntoAllFields) {
			inputField.clear(); // Optional: clear any existing value
			inputField.sendKeys("100"); // Enter the value "100"
		}

	}

	@FindBy(xpath = "//input[@placeholder='Enter Reason']")
	List<WebElement> EnterReasonintoAllfileds;

	public void EnterReasonintoAllfileds() {
		// Loop through each input field and enter the value "1"
		for (WebElement inputField : EnterReasonintoAllfileds) {
			inputField.clear(); // Optional: clear any existing value
			inputField.sendKeys("IMF Reason"); // Enter the value "100"
		}

	}

	@FindBy(xpath = "//button[text()=\"Next\"]")
	WebElement CLickNextAfterPO;

	public void CLickNextAfterPO() throws InterruptedException {

		Thread.sleep(10000);
		Actions actions = new Actions(ldriver);
		actions.moveToElement(CLickNextAfterPO).build().perform();
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", CLickNextAfterPO);
		js.executeScript("arguments[0].click();", CLickNextAfterPO);
		Thread.sleep(10000);
	}

}
