Feature: R4C Case Opt In/Out SR case
@TestcaseNo-1
@HighPriority
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Cancel" button in popup 
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
    When User Click on Contact menu
    And Select Contact from list 
    And Select recentview dropdown
    And Enter Contact name and select
    And Click on Contacts name 
    And Click on the New R4C case creation button
   And Select Service Type Stock Rotation and Click on Create button
   When Enter Sold To Number
   And Select return Reason Standard stock rotation
      And Click on Cancel buttton
   	 
 
 @TestcaseNo-2 
 
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Ok" button in popup 
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login  
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Amy" and select
   And Click on the New R4C case creation button
   And Select Service Type Stock Rotation and Click on Create button
   When Enter Sold To Number
   And Select return Reason Standard stock rotation
   And Click on Ok buttton
  
    
@TestcaseNo-3
 Scenario:  Verify the Opt-in & Opt-out functionality for GEO as EMEA
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Stock Rotation and Click on Create button
   When Enter Sold To Number case 
   And Select  Reason as Standard Stock Rotation
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Close browser
   
   
    
   
   
   
    
    
    
