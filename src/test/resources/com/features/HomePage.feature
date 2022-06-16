Feature: Title and Logo of the Home Page

  Scenario Outline: Validating the title of the Home Page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see the title of the page as "Home"

  Scenario Outline: Validating the logo on the Home Page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a logo image with company name on the Home Page
