Feature: R4C Case Creation

  As a user
  I want to be able to create a new R4C case
  So that I can track and manage the case effectively
  
  @passwithimf
 Scenario: Verify the Case creation for Service Type as 
     Stock Rotation & Return Reason as Standard Stock Rotation with Freight type as CRF using PO Search
  
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
    Then User can view New R4C Case popup
    And Select service type as "Stock Rotation & Return"
    And Click on the create button
    And Enter Sold To details
    And Select Promotional Stock option
    And Select RCA address
    And Select Return customer contact
    And Select CA Address
    When select Collection Contact
    And Click on next
    And Select Purchase/Sales Order button and Enter PO Number "4511274812"
    Then Click on the search button
    And Select All Line items
    And Click on the Next button after All Line Items
    And Click on Product Validation and Next button
    When Enter Return Quantity
    And Click on the Get credit price
    And Click on the Next button After credit Price
    And Enter Credit price
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
    
@pass
Scenario: Verify the Case creation for Stock Rotation & Return Reason as
      Standard Stock Rotation with Freight type as IMF using SO Search  
 
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as "Stock Rotation & Return"
   And Click on the create button
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
   And Enter Credit price
   And Click on the Next button After Credit
   And Click on the Validate Allowance
   And Click on the Save and Summary button
   And Click on submit button After Summary
   Then User can view Case creation Popup message
   And Click on the Submit button
   Then User can view Successful message
   And Close browser
    
   
   @pass
 Scenario: Verify the Case creation for Stock Rotation & Return Reason as Promotional Stock Rotation with Freight type as CRF using MM Search
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
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
   And Clickon PO History 
   And Click on Product Validation and Next button
   When Enter Return Quantity
   And Click on the Get credit price
   And Click on the Next button After credit Price        
   And Click on the Next button After Credit
   And Click on the Validate Allowance
   And Click on the Save and Summary button
   And Click on submit button After Summary
   Then User can view Case creation Popup message
   And Click on the Submit button
   Then User can view Successful message
   And Close browser
    

Scenario: Verify the Case creation for Stock Rotation & Return Reason as 
      Promotional Stock Rotation with Freight type as IMF using Bulk Upload
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
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
   And Click On Bulk upload "C:\Users\oyadavx\OneDrive - Intel Corporation\Desktop\MMCPN_BulkUploadTemplate.csv"
    And Click On Validate Button
    And Clickon PO History 
    And Click on Product Validation and Next button
    When Enter Return Quantity
    And Click on the Get credit price
    And Click on the Next button After credit Price        
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
    
    
  
 Scenario: Verify the PO Search functionality
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   And Select Purchase/Sales Order button and Enter PO Number "4511274812"
    Then Click on the search button
   And Close browser
    
    
 Scenario: Verify the SO Search functionality
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   And Select Purchase/Sales Order button and Enter SO Number "0019141969"
   Then Click on the search button
   And Close browser
     
 Scenario: Verify the MM Search functionality
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number 
   And Close browser
    
        
 Scenario: Verify the CPN Search functionality
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   And click on Product radio button
   And Select CPN Radio button
   When Enter CPN number
   And click on search button 
   And Close browser
  
    
 Scenario: Verify the OPN Search functionality
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   And click on Product radio button
   And Click on Order Part Number radio button
   When Enter OPN into search box "6576567"
   And click on search button 
   And Close browser
    
       
 Scenario: Verify the Bulk Upload functionality
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation and Upload Bulk File "C:\Users\oyadavx\OneDrive - Intel Corporation\Desktop\MMCPN_BulkUploadTemplate.csv"
   And Click On Validate Button
   And Close browser
   
         
 Scenario: Verify the PO History functionality
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number 
   And Clickon PO History 
   And Close browser
    
    
 Scenario: Verify the Save for Later functionality Search/Upload Line item page
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number 
   And Clickon PO History button
   When Click on Save for later button
   And Close browser
    
  
 Scenario: Verify the Price Override functionality with L<=25K   
 
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
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
    And Enter Credit price <25K
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
    
 
 Scenario: Verify the Price Override functionality with G>=25K   
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah"
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
    And Close browser
    
    
   
       

  
    
    
    