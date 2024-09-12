Feature: BulkUpload

@MMIDs-ULT
@highpriority
 Scenario: Verify the ULT Bulk Upload functionality(Useing Two excel Sheet)
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold through Excel
    And Select Remedy credit and reason Fail Customer End 
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Upload Bulk File "C:\\Users\oyadavx\\OneDrive - Intel Corporation\\Desktop\\ULT Bulk Upload Sheet\\ULT_BulkUploadTemplate (3).csv" ULT
   And Click On Validate Button
   When Click on Next After PO history check
   When Click On Warranty Entitlement Check
   When Click on Next After PO history check
   And Print Active MM Ids into console
   And Clickon PO History check button
    And Click Next button After PO     
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console
   
 
Scenario: Verify the MMIDs-ULT Bulk Upload functionality with case creation 
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold through Excel
   And Select Remedy credit and reason Fail Customer End 
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number 
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Enter ULT IDs
    When Click On Warranty Entitlement Check
    And Validate the Status
    And Click Ok button 
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    
    
@ScenarioNo-1

Scenario: Verify the MMIDs-ULT(Mandatory)IMF Bulk Upload functionality with case creation 
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold through Excel
   And Select Remedy credit and reason Fail Customer End 
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number 
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Enter ULT IDs
    When Click On Warranty Entitlement Check
    And Validate the Status
    And Click Ok button 
    And Click on next
    And Print Active MM Ids into console
    And Clickon PO History check button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console
    
    

Scenario: Verify the MMIDs-ULT(ULT NotMandatory)IMF Bulk Upload functionality with case creation 
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold through Excel
   And Select Remedy credit and reason Fail Customer End 
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number 
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click Next button after All Item selection
    And Clickon PO History check button
    And Click Next button After PO     
    And Enter Quantity into All fields
    And Click Next button After PO     
    And Click On Credit price Validation
    And Enter Price Into All Fields
    And Enter Reason into All Fields
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console
    
    
 
    