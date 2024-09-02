Feature: Case Creation Workflow for Technical Service Type with Credit Remedy and Specific Return Reason Using PO Search

Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Failed at Customer Factory Site using PO Search
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create button
   And Select Return Reason
   And Select RCA address
  And Select Return customer contact
   And Select CA Address
   When select Collection Contact
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
  
  
Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Failed at End Customer using SO Search
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create button
   And Select Remedy type is credit
   And Select Return Reason Faild at End Customer
   And Select RCA address
  And Select Return customer contact
   And Select CA Address
   When select Collection Contact
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
   
  Scenario: Verify the SO Search functionality
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
   And Select Purchase/Sales Order button and Enter SO Number "0019141969"
    Then Click on the search button
    
       
  Scenario: Verify the PO Search functionality
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
   And Select Purchase/Sales Order button and Enter PO Number "4511274812"
    Then Click on the search button
    
    @HighPriority
  Scenario: Verify the MM Search functionality
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
   When Clickon Product radiobutton and enter MM Number "99APD4"
    And Click on search button after Entering MM Number 
    And Close browser
    
    
  Scenario: Verify the CPN Search functionality
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
   And click on Product radio button
    And Select CPN Radio button
    When Enter CPN number
    And click on search button 
    And Close browser
    
     
  Scenario: Verify the OPN Search functionality
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
   And click on Product radio button
   And Click on Order Part Number radio button
   When Enter OPN into search box "6576567"
    And click on search button 
    And Close browser
    
    
    Scenario: Verify the MMCPN Bulk Upload functionality
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create button
   And Select Remedy type is credit
   And Select Return Reason Faild at End Customer
   And Select RCA address
  And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   And Upload Bulk File "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1).csv""
   And Click On Validate Button
   And Close browser
   
   
   Scenario: Verify the MM Search functionality
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
   When Clickon Product radiobutton and enter MM Number "99APD4"
    And Click on search button after Entering MM Number 
    And Close browser
     And Select All Line items
   And Enter ProductUniqueID "Value"
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
   
   
   
    
