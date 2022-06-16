Feature: Sign Up form

Scenario Outline: Validating the Sign Up form heading
Given User is on dietician website
When User lands on register page  
Then User should see a form with heading "Sign Up form", to sign up using mobile number

Scenario Outline: Validating the Sign Up button for the option "Sign up using mobile number" on  Register page.
Given User is on dietician website
When User lands on register page  
Then User should see a button with text "SIGN UP" in the Sign Up form

Scenario Outline: Validating the Sign up process with all fields being empty
Given User lands on register page
When User clicks SIGN UP Button in the Sign Up form with all fields empty  
Then User should see a message "Mandatory fields cannot be empty"

Scenario Outline: Validating the Sign up process with invalid First Name
Given User lands on register page
When User clicks SIGN UP Button in the Sign Up form  by entering numeric text for First Name, valid values for the remaining fields 
Then User should see a message "Invalid data entered for First Name"

Scenario Outline: Validating the Sign up process with invalid Last Name
Given User lands on register page
When User clicks SIGN UP Button in the Sign Up form  by entering numeric text for Last Name, valid values for the remaining fields  
Then User should see a message "Invalid data entered for Last Name"

Scenario Outline: Validating the Sign up process with invalid Mobile Number
Given User lands on register page
When User clicks SIGN UP Button in the Sign Up form  by entering Aphanumeric text for Mobile Number, valid values for the remaining fields .  
Then User should see a message "Invalid data entered for Mobile Number"
 
Scenario Outline: Validating the Sign up process with invalid Any other field
Given User lands on register page
When User clicks SIGN UP Button in the Sign Up form  by entering numeric text for Any other field, valid values for the remaining fields.   
Then User should see a message "Invalid data entered for any other field"

Scenario Outline: Validating the Sign up process with invalid Email
Given User lands on register page
When User clicks SIGN UP Button in the Sign Up form  by entering  invalid email Id for Email, valid values for the remaining fields.   
Then User should see a message "Invalid data entered for Email"

Scenario Outline: Validating the Sign up process with invalid password
Given User lands on register page
When User clicks SIGN UP Button in the Sign Up form  by entering  invalid password, valid values for the remaining fields.   
Then User should see a message "Invalid data entered for password"

Scenario Outline: Validating the Sign up process with all valid input field
Given User lands on register page
When User clicks SIGN UP Button in the Sign Up    
Then User is re-directed to Sign In page.




 