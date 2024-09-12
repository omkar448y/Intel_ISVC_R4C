 Feature: Case Edit Technical
 
 
 @TestCaseNo-3
 Scenario: Verify the Open Unsubmitted status Case Edit for Technical with Freight type as CRF
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons and Enter Sold To "6006683685"
   And Select Remedy credit and reason Fail Customer End 
    And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
    And Select Purchase/Sales Order button and Enter SO Number "0019141969"
    Then Click on the search button
    And Select All Line items
   And Click on the Next button after All Line Items
    When Click On Warranty Entitlement Check
   When Click on Save for later button
   And Click On Edit Option
   And click accelept
   And Click On Next after edit
   And Click On Next Accept Edit 
   And Click Next After Selection of Check boxes
    When Enter Return Quantity
    And Click On Credit price Validation
     And Enter Credit price <25K
    And Click on the Save and Summary button
     And Click on submit button After Summary
     And Check RMA status
     
     
@TestCaseNo-4
Scenario: Verify the Open Unsubmitted status Case Edit for Technical with Freight type as IMF
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons and Enter Sold To "6006683685"
   And Select Remedy credit and reason Fail Customer End
    When Slect ReurnTo Customer address
   And Select Collection address
   When Return to Customer Contact name
   And Click on next
    And Select Purchase/Sales Order button and Enter SO Number "0019141969"
    Then Click on the search button
    And Select All Line items
   And Click on the Next button after All Line Items
    When Click On Warranty Entitlement Check
   When Click on Save for later button
   And Click On Edit Option
   And click accelept
   And Click On Next after edit
   And Click On Next Accept Edit 
   And Click Next After Selection of Check boxes
    When Enter Return Quantity
    And Click On Credit price Validation
     And Enter Credit price <25K
    And Click on the Save and Summary button
     And Click on submit button After Summary
     And Check RMA status 
         
@TestCaseNo5
Scenario: Verify the Submitted Pending Action status Case Edit for Technical 
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login  
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on Related option
   When Click on View All cases option
   And Click On FilterIcon
   When Enter CAse No into text field "06305605"
   And Click On Apply button
   And Select searched case
	   And click accelept
	   And Click On Edit Option
   And Click Next After Selection of Check boxes four
   And Enter Credit price >25K
    And Click on the Save and Summary button
    And Click on submit button After Summary

@TestCaseNo-6
Scenario: Verify the Submitted Pending Approval status Case Edit for Technical  
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold To "6006683685"
   And Select Remedy credit and reason Fail Customer End
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
   And Click On Edit Option
   And Click on submit button After Summary
   And Close browser
    
 
 @highpriority
 @Status-pass
Scenario: Pending Approval Status {Verify the Submitted Pending Approval status Case Edit for Technical}
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login  
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on Related option
   When Click on View All cases option
   And Click On FilterIcon
   When Enter CAse No into text field "06305536"
    And Click On Apply button
   And Select searched case
   And click accelept
   And Click On Edit Option
  And Click on submit button After Summary
   
    
    
    