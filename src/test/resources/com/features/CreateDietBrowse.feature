Feature: User verifying Confirm Conditions and Create Plan Page
  Background: User is logged into Dietician Website as Dietcian and in Confirm Conditions and Create Plan Page
  
Scenario: Validating heading of Confirm Conditions and Create plan page
    Given User is logged on to Dietician website
    When  User lands on Confirm Conditions and Create Plan page
    Then  User sees the heading "Confirm Health Conditions and Generate a new Diet Plan" displayed on the page 
    
Scenario: Validating Browser Button Visibility of Confirm Conditions and Create plan page
    Given User is logged on to Dietician website
    When  User lands on Confirm Conditions and Create Plan page
    Then  User should see a button with name Browse on the page displayed on the page   
   
   Scenario: Validating Upload Button Visibility of Confirm Conditions and Create plan page
    Given User is logged on to Dietician website
    When  User lands on Confirm Conditions and Create Plan page
    Then  User should see a button with name Upload on the page displayed on the page 
    
Scenario: Validating Browse Button operation of Confirm Conditions and Create plan page
    Given User is in Confirm Conditions and Create Plan page
    When  User clicks the Browse button and selects a document
    Then  User should see the selected document in the field next to the Browse button on the page 
    
Scenario: Validating the Upload button with no file selected in Confirm Conditions and Create plan page
    Given User is on Confirm Conditions and Create Plan page
    When  User clicks the Upload button without selecting a document
    Then  User should see error message "Please upload the file"  
    
Scenario: Validating the Upload button functionality with incorrect file in Confirm Conditions and Create plan page
    Given User is on Confirm Conditions and Create Plan page
    When  User clicks the Upload button by selecting a non-PDF file 
    Then  User should see error message displayed "please upload files with extension .pdf" 
    
Scenario: Validating the Upload functionality with incorrect file size in Confirm Conditions and Create plan page
    Given User is on Confirm Conditions and Create Plan page
    When  User clicks the Upload button by selecting a PDF file of size greater than 2MB
    Then  User should see error message as "PDF File exceeding the size limit of 2MB"    
    
Scenario: Validating the Upload functionality with correct file format and size in Confirm Conditions and Create plan page
    Given User is on Confirm Conditions and Create Plan page
    When  User clicks the Upload button by selecting a pdf file of size less than 2MB
    Then  User should see the  message "File uploaded succesfully"               
    
 Scenario: Validating the Generate Menu button operation in Confirm Conditions and Create plan page
    Given User is logged in to Dietician website
    When  User lands on Confirm conditions and Create Plan page of site
    Then  User should see a button with text "GENERATE MENU"  at the bottom of the page               
    
 Scenario: Validating the Generate Menu button operation in Confirm Conditions and Create plan page
    Given User is in Confirm Conditions and Create Plan page of site
    When  User clicks the GENERATE MENU button 
    Then  User should land on "View Recent Diets" page with New Diet Plan generated with the latest confirmed Health conditions             
          

 
