Feature: Sign In form with Username

  Scenario: Validate Sign In form heading and Sign In button
    Given User is on Dietician website
    When User lands on Sign In page
    Then User should see a form with heading "Sign In form" and SIGN IN button

  Scenario: Validate sign in process with all empty fields
    Given User is on Sign In Page
    When User clicks Sign In Button in the Sign In form with all fields empty
    Then User should get error message"Please fill out the mandatory fields"

  Scenario Outline: Validating Sign InProcess with valid and/or invalid credentials
    Given User is on Sign In Page
    When User enters values for "<Username>" and "<Password>" and click on SIGN IN button
    Then User should get "<message>" response

    Examples: 
      | Username | Password      | message                   |
      |    12345 | User123       | Invalid Username          |
      | TestUser1    | Usertestuser123456789 | Invalid Password          |
      | U1234    | 1234567890abcdefghijkl | Invalid login credentials |
      | TestUser1    | Userpwd@123    | Successfully logged in    |

  Scenario: Validate Sign In with "Forgot password?" link
    Given User is on Sign In Page
    When User clicks on Forgot Password link
    Then User should be directed to "Reset password" link

  Scenario: Validate Sign In with "Not a member yet?" link
    Given User is on Sign In Page
    When User clicks on Not a member yet link
    Then User will land on Register Page
