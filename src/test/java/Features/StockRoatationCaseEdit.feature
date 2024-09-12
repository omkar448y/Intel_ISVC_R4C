Feature:StockRotation Case Edit
 @TestCaseNo-1pass
 
Scenario: Verify the Open Unsubmitted status Case Edit for Stock Rotation 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as Stock roatation
   And Enter Sold To details
   And Select Promotional Stock option
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number 
   And Clickon PO History button
   When Click on Save for later button
   And Click On Edit Option
   And click accelept
   And Click On Next after edit
   And Click On Next Accept Edit
   And Click on next Case Validation 
   And Click on Product Validation and Next button
   When Enter Return Quantity
   And Click on the Get credit price
   And Click on the Next button After Credit
   And Click on the Validate Allowance
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Close browser
   
   @TestCaseNo-2pass
   @HighPriority
  Scenario: Verify the Submitted Pending Approval status Case Edit for Stock Rotation    
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login  
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as Stock roatation
   And Enter Sold To details
   And Select Promotional Stock option
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
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
   And Close browser
     
 @TestCaseNo3
 
  Scenario: Verify the Submitted Pending Action status Case Edit for Stock Rotation     
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login   
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on Related option
   When Click on View All cases option
   And Click On FilterIcon
   When Enter CAse No into text field "06295402"
   And Click On Apply button
   And Select searched case
   And Click On Edit Option
   And Click On Next after edit Case edit
   And Click on Product Validation and Next button
   And Click on the Get credit price
   And Enter Credit price
   And Click on the Next button After Credit
   And Click on the Validate Allowance
   And Click on the Save and Summary button
   And Click on submit button After Summary
    
    
    
    
    
    
    
    
    