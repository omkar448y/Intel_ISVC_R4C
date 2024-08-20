Feature:StockRotation Case Edit
    
Scenario: Verify the Open Unsubmitted status Case Edit for Stock Rotation 
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
    When Clickon Product radiobutton and enter MM Number "99APD4"
    And Click on search button after Entering MM Number 
    And Clickon PO History button
    When Click on Save for later button
   And Click On Edit Option
    And click accelept
   And Click On Next after edit
  And Click on Product Validation and Next button
  When Enter Return Quantity
  And Click on the Get credit price
   And Click on the Next button After Credit
   And Click on the Validate Allowance
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Close browser
   
  Scenario: Verify the Submitted Pending Approval status Case Edit for Stock Rotation    
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login  
   When User Click on Contact menu
    And Select Contact from list and enter Text into search field "Sarah"
    And Click on the New R4C case creation button
    Then User can view New R4C Case popup
    And Select service type as "Stock Rotation & Return"
    And Click on the create button
   When User enter Sold to and other details
   And Click on the Next button After Sold To
   And Select Purchase/Sales Order button and Enter SO Number "0019141969"
    Then Click on the search button
    And Select All Line items
    And Click on the Next button after All Line Items
    And Click on Product Validation and Next button
    When Enter Return Quantity
    And Click on the Get credit price
    And Click on the Next button After credit Price
    And Enter Credit price >25K
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
    When User Slect L3 Agent Selection
    And Click on Select Button
     And Click On Edit Option
      And Click on submit button After Summary
      
  Scenario: Verify the Submitted Pending Action status Case Edit for Stock Rotation     
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login  
   When User Click on Contact menu
    And Select Contact from list and enter Text into search field "Sarah"
    And Click on Related option
    When Click on View All cases option
    And Click On FilterIcon
    When Enter CAse No into text field "06280200"
    And Click On Apply button
    And Select searched case
     And Click On Edit Option
    And Click On Next after edit button
    And Click on Product Validation and Next button
     And Click on the Get credit price
    And Enter Credit price
    And Click on the Next button After Credit
    And Click on the Validate Allowance
  And Click on the Save and Summary button
    And Click on submit button After Summary
    
    
    
    
    
    
    
    
    
    