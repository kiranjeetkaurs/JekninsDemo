Feature: Validate the screens under public section

  Scenario: Validate the Public section on list of screens
    Given User is on the Dietician website
    When User selects the link with three horizontal lines displayed on top right corner
    Then User should see the sub menu with text "Public"

  Scenario Outline: Validate User Sign In link under public section
    Given User is on the Dietician website
    When User clciks on the link with text "<link>" displayed under Public section
    Then User should be redirected to the "<link>" page

    Examples: 
      | link             |
      | User Sign In     |
      | Register         |
      | Team             |
      | Testimonials     |
      | Forgot Password  |
      | Product Features |
      | Contact          |
      | Blogs            |
      | Featured Content |
      | Home             |
