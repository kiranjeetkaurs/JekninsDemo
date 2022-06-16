Feature: Log in with email on Sign In Form

  Scenario: Validate heading and Log in button on "Log in with  your email" form
    Given User is on Dietician website
    When User is on Sign In Page
    Then User should see a form with heading "Log in with  your email" and Log in button

  Scenario: Validate sign in process with all empty fields on form
    Given User is on Sign In Page
    When User clicks on Log in Button in the Sign In form with all fields empty
    Then User should get error message "Please fill out fields in textbox"

  Scenario Outline: Validating Sign In process with valid and/or invalid email and/or password
    Given User is on Sign In Page
    When User click on Log in button with email and password from sheetname "<SheetName>" and rownumber <RowNumber>
    Then User should get a message as in sheetname "<SheetName>" and rownumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | inputdata |         1 |
      | inputdata |         2 |
      | inputdata |         3 |
      | inputdata |         4 |
      | inputdata |         5 |

  Scenario: Validate Sign In with "Forgot your password?"
    Given User is on Sign In Page
    When User clicks on Forgot your password link
    Then User is redirected to Reset password link

  Scenario: Validate Sign In with Facebook button
    Given User is on Sign In Page
    When User click on facebook button
    Then User is redirected to facebook login page

  Scenario: Validate Sign In with Google button
    Given User is on Sign In Page
    When User click on Google button
    Then User is redirected to Google login page

  Scenario: Validate Sign In with Sign up button
    Given User is on Sign In Page
    When User click on Sign up here link
    Then User is redirected to Register page
