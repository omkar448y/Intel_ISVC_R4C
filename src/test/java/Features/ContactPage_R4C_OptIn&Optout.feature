Feature: R4C Case Edit

 
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Cancel" button in popup 
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Amy"
   And Click on the New R4C case creation button
   And Select Service Type Stock Rotation and Click on Create button
   When Enter Sold To Number 
   And Click on Cancel buttton
    And Select Freight Type
    And Close browser
     
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Ok" button in popup 
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Amy"
   And Click on the New R4C case creation button
   And Select Service Type Stock Rotation and Click on Create button
   When Enter Sold To Number 
   And Click on Ok buttton
    And Select Freight Type
    And Close browser
   
   
   Scenario:  Verify the Opt-in & Opt-out functionality for GEO as EMEA
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   And Select Service Type Stock Rotation and Click on Create button
   When Enter Sold To Number case edit
   And Select RCA address
  And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
    
   
   
   
    
    
    
