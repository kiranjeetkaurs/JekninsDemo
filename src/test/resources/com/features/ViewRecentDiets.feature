Feature: User verifying View Recent Diets Page
  Background: User is logged into Dietician Website as View Recent Diets Page
  
Scenario: Validating the heading of the View Recent DietsDiet plans page
    Given User is in logged on to Dietician Website
    When  User clicks on Dietsplan link 
    Then  User should land on View Recent diets page and sees the heading Generated Diet Plans displayed on the page 
    
Scenario: Validating the tabs on the menu bar of View Recent Diets plan page
    Given User in Confirm Conditions and Create Plan Webpage and click generate menu button
    When  User lands on View Recent Diets Webpage  of site
    Then  User should see that Record No, Plan id, Customer Details, Dietplan,View Pdf,Plan Generated time, Comments are displayed 
   
Scenario: Validating the tabs on the menu bar of View Recent Diets plan page
    Given User  in Confirm Conditions and Create Plan Webpagepage of Dietician site
    When  User lands on View Recent Diets Webpage of website
    Then  User should see 5 records displayed on the page 
    
Scenario: Validating next buton of View Recent Diets plan page
    Given User is in View Recent Diets Page
    When  User has more than 5 records and carried to next page
    Then  User should see next page button is enabled with others page buttons disabled
    
Scenario: Validating next buton of View Recent Diets plan page
    Given User is in View Recent Diets Page
    When  User clicks on next page button
    Then  User should go to next page with previous and others pages buttons disabled    
    
Scenario: Validating the previous button of View Recent Diets plan page
    Given User is in View Recent Diets Page
    When  User is in last page of View Diets pagination
    Then  User should see  previous page button is enabled and others page buttons disabled    
    
 Scenario: Validation of generated PDF for a diet plan
    Given User is in View Recent Diets Page
    When  User clicks on View PDF button for a generated diet plan
    Then  User should see the Patient details,Doctor details,Patient health details,7-day menu information, warnings,Comments are displayed in the pdf
    
 Scenario: Validation of download PDF option for a diet plan
    Given User is in View Recent Diets Page
    When  User clicks on View PDF button for a generated diet plan
    Then  User should be able to see download option for the PDF
  
  