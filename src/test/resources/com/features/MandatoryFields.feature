Feature: Register Page Mandatory Fields

Scenario Outline: Validating the register page mandatory fields 
Given Users is on dietician website
When Users lands on register page  
Then Users should see all mandatory fields with star symbol on top of those fields   