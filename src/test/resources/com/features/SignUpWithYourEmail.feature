Feature: Sign Up with your Email

Scenario: Validating the Sign Up form heading

When User lands on register page  
Then User should see a form with heading "Sign Up with your email", to sign up using Email Id


Scenario: Validating the Sign Up button for the option "Sign up using Email Id" on  Register page


Then User should see a button with text "Sign Up" in the Sign Up with your Email form

Scenario: Validating the Sign up process with all fields being empty

When User clicks SIGN UP Button in the Sign Up with your Email form with all fields empty
Then Users should see a message "Mandatory fields cannot be empty"

Scenario: Validating the Sign up process with invalid Name

When User clicks SIGN UP Button in the Sign Up with your Email form  by entering numeric text for First Name, valid values for the remaining fields
Then Users should see a message "Invalid data entered for First Name"

Scenario: Validating the Sign up process with invalid Last Name

When User clicks SIGN UP Button in the Sign Up form with your Email by entering numeric text for Last Name, valid values for the remaining fields 
Then Users should see a message "Invalid data entered for Last Name"

Scenario: Validating the Sign up process with invalid User Name

When User clicks SIGN UP Button in the Sign Up form with your Email by entering numeric text for User Name, valid values for the remaining fields 
Then Users should see a message "Invalid data entered for User Name"

Scenario: Validating the Sign up process with invalid Email Address
 
When User clicks SIGN UP Button in the Sign Up form with your Email by entering invalid Email Address, valid values for the remaining fields 
Then Users should see a message "Invalid data entered for Email Address"
 
Scenario: Validating the Sign up process with invalid Password

When User clicks SIGN UP Button in the Sign Up form with your Email by entering invalid password, valid values for the remaining fields 
Then Users should see a message "Invalid password"

Scenario: Validating the Sign up process with invalid Confirm Password
 
When User clicks SIGN UP Button in the Sign Up form with your Email by entering a value that is different than the Password field value ,valid values for the remaining fields 
Then Users should see a message "Confirm Password should same as Password"

Scenario: Validating the Sign up process with all valid  input field 

When  User clicks SIGN UP Button in the Sign Up with your Email form  by entering valid values for the all fields
Then User is re-directed to Sign In page


