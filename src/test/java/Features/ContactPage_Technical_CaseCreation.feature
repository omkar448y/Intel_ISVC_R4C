Feature: Case Creation Workflow for Technical Service Type with Credit Remedy and Specific Return Reason Using PO Search
@ScenarioNo-1
  
Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Failed at Customer Factory Site using PO Search
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit and reason
   When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   And Select Purchase/Sales Order button and Enter PO Number "4511274812"
    Then Click on the search button
    And Select All Line items
    And Click on the Next button after All Line Items
    And Enter ProductUniqueID "Value"
    When Click On Warranty Entitlement Check 
    And Click on next
    And Clickon PO History check button
    And Click on PO Change popup Ok button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Select All Line items check box
    And Select First Check box
    And Enter Credit price
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Close browser
  
    Scenario: Technical testAccept
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
  When  Seach global click 
  And Enter Case Number "06188824"
  And Click Case
  And click accelept
  
 @ScenarioNo-2
Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Failed at End Customer using SO Search
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit and reason Fail Customer End
   When Slect ReurnTo Customer address 
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
    And Select Purchase/Sales Order button and Enter SO Number "0019141969"
    Then Click on the search button
    And Select All Line items
   And Click on the Next button after All Line Items
    And Enter ProductUniqueID "Value"
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Enter Credit price
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Close browser
   
   @ScenarioNo-13
  Scenario: Verify the SO Search functionality
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit and reason
   When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   And Select Purchase/Sales Order button and Enter SO Number "0019141969"
   Then Click on the search button
    
   @ScenarioNo-12     
  Scenario: Verify the PO Search functionality
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit and reason
   When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   And Select Purchase/Sales Order button and Enter PO Number "4511274812"
   Then Click on the search button
    
    @ScenarioNo-14
  Scenario: Verify the MM Search functionality
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit and reason
   When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99APD4"
    And Click on search button after Entering MM Number 
    And Close browser
    
    @ScenarioNo-15
  Scenario: Verify the CPN Search functionality
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit
   When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   And click on Product radio button
    And Select CPN Radio button
    When Enter CPN number
    And click on search button 
    And Close browser
    
       @ScenarioNo-16  
       
  Scenario: Verify the OPN Search functionality
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit and reason Fail Customer End
   When Slect ReurnTo Customer address 
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   And click on Product radio button
   And Click on Order Part Number radio button
   When Enter OPN into search box "6576567"
    And click on search button 
    And Close browser
    
  @ScenarioNo-17   
    Scenario: Verify the MMCPN Bulk Upload functionality
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit
    When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   And Upload Bulk File "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1).csv""
   And Click On Validate Button
   And Close browser
   
       @ScenarioNo-19
   Scenario: Verify the PO History functionality
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit and reason
   When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99C6A3"
   And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
   
   
        @ScenarioNo-23
      
    Scenario: Verify the Price Override functionality with >=25K 
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
    When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit
   When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99C6A3"
   And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Return Quantity
    And Click On Credit price Validation
    And Enter Credit price >25K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    When User Slect L3 Agent Selection
    And Click on Select Button
    And Close browser
    
    
 @ScenarioNo-22
 Scenario: Verify the Price Override functionality with <=25K Tech
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
    When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit
   When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99C6A3"
   And Click on search button after Entering MM Number
   And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Return Quantity
    And Click On Credit price Validation
    And Enter Credit price <25K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Close browser
   
  @ScenarioNo-24
  
    Scenario: Verify the Price Override functionality with >=100K Tech
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
    When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create button
   And Select Return Reason
   When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99C6A3"
   And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Return Quantity
    And Click On Credit price Validation
    And Enter Credit price <100K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Click on the Save and Summary button
    And Click on submit button After Summary
    When User Slect L3 Agent Selection
    And Click on Select Button
    And Close browser
    
 @Scenariono-4
 
    Scenario: Verify the Case creation for Service Type as Technical & Remedy as NPR-Credit & Return Reason as Failed at Customer Factory Site using ULT Bulk Upload
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Click On create button and select remedy and select reason
   And Click on the Next button After Sold To
   And Upload Bulk File "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1).csv""
   And Click On Validate Button
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Enter Credit price <100K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    When User Slect L3 Agent Selection
    And Click on Select Button
    And Close browser
    
 @ScenarioNo-5
 
    Scenario: Verify the Case creation for Service Type as Technical & Remedy as NPR-Credit & Return Reason as Failed at End Customer using CPN Search
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Click On create button and select remedy and select reason customer site
   And Click on the Next button After Sold To
    And click on Product radio button
    And Select CPN Radio button
    When Enter CPN number
    And click on search button
    And Select All Line items with RM
    And Select First Item
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Return Quantity
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
   
 @ScenarioNo-6
   @Pendingwithmm
   
    Scenario: Verify the Case creation for Service Type as Technical & Remedy as NPR-Credit & Return Reason as Warranty Service/Software using MM Search
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Click On create button and select remedy and select reason  Warranty Service/Software 
    And Click on the Next button After Sold To
    When Clickon Product radiobutton and enter MM Number "99C6A3"
    And Click on search button after Entering MM Number
    And Select All Line items with RM
    And Select First Item
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Return Quantity
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
       
@ScenarioNo-7
  @PendingwithOPN 
    Scenario: Verify the Case creation for Service Type as Technical & Remedy as NPR-Credit & Return Reason as Sample using OPN Search
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Click On create button and select remedy and select reason  Simple 
   And Click on the Next button After Sold To
   And click on Product radio button
   And Click on Order Part Number radio button
   When Enter OPN into search box "6576567"
   And click on search button
   And Select All Line items with RM
   And Select First Item
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   When Click on Next After PO history check
   When Enter Return Quantity
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary 
    
 @ScenarioNo-8
     Scenario: Verify the Case creation for Service Type as Technical with ULT is mandatory
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Click On create button and select remedy and select reason customer site
   And Click on the Next button After Sold To
   When Clickon Product radiobutton and enter MM Number "950804"
   And Click on search button after Entering MM Number
   And Select All Line items with RM
   And Click Next button after All Item selection
   And Enter ULT Number "G6AY123002WE"  
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Enter Credit price <25K
   And Click on the Save and Summary button
   And Click on submit button After Summary
    
 @ScenarioNo-9
  
  Scenario: Verify the Case creation for Service Type as Technical with ULT is not mandatory
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create button select remedy credit
   When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99C4XK"
   And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   When Click on Next After PO history check
   When Enter Return Quantity
   And Click On Credit price Validation
   And Enter Credit price <25K
   And Click on the Save and Summary button
    And Click on submit button After Summary
    
    
 @Scenariono-21
 
 Scenario: Verify the Warranty Entitlement Check functionality with ULT
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Click On create button and select remedy and select reason customer site
   And Click on the Next button After Sold To
   When Clickon Product radiobutton and enter MM Number "99A3P3"
   And Click on search button after Entering MM Number
   And Select All Line items with RM
   And Click Next button after All Item selection
   And Enter ULT Number "BQKY12501810" 
   When Click On Warranty Entitlement Check
   
   @ScenarioNo-20
   
 Scenario: Verify the Warranty Entitlement Check functionality without ULT
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit and reason Fail Customer End
   When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
    
    
 @ScenarioNo-18
 
 Scenario: Verify the ULT Bulk Upload functionality
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Click On create button and select remedy and select reason
   And Click on the Next button After Sold To
   When User Click on Download ULT Template
   And Upload Bulk File "C:\\Users\\oyadavx\\Downloads\\ULT_BulkUploadTemplate.csv" ULT
   And Click On Validate Button
   
   

   @ScenarioNo-3
   
   Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Technical Sample using MMCPN Bulk Upload
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit
    When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   And Upload Bulk File "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1).csv""
   And Click On Validate Button
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Enter Credit price <25K
   And Click on the Save and Summary button
    And Click on submit button After Summary
   
   @scenariono-18
   Scenario: Verify the ULT Bulk Upload functionality
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Click On create button and select remedy and select reason
   And Click on the Next button After Sold To
   And Upload Bulk File "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1).csv""
   And Click On Validate Button
   
   
   @ScenarioNo24
   
  Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Failed at Customer Factory Site using PO Search
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons only
   And Select Remedy credit and reason
   When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   And Select Purchase/Sales Order button and Enter PO Number "4511732714"
    Then Click on the search button
     And Select All Line items with RM
    And Select First Item
       And Click Next button after All Item selection
    When Click On Warranty Entitlement Check 
    And Click on next
    And Clickon PO History check button
    And Click on PO Change popup Ok button
    When Click on Next After PO history check
    When Enter Return Quantity >=100K
    And Click On Credit price Validation
    And Select All Line items check box
    And Select First Check box
    And Enter Credit price
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Close browser
    
   Scenario: Enter Text global
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons and Enter Sold To "6006683685"
   And Select Remedy credit
    When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   And Upload Bulk File "C:\Users\oyadavx\Downloads\MMCPN_BulkUploadTemplate (1) - Copy.csv"" with MM Ids
   And Click On Validate Button   
      
      
      
      
  @POC
 @testMMupload
 Scenario: Verify the MMCPN Bulk Upload functionality
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah" and select Contacts
   And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons and Enter Sold To "6006683685"
   And Select Remedy credit
    When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
   And Upload Bulk File "C:\Users\oyadavx\Downloads\MMCPN_BulkUploadTemplate (1) - Copy.csv"" with MM Ids
   And Click On Validate Button
   And Close browser
   