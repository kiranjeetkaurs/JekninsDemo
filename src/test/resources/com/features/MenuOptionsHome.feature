Feature: Menu bar options on the Home Page
  I want to use this template for my feature file

  Scenario Outline: Verifying the top Menu bar tabs on the Home Page
    Given User is on the browser
    When User opens the Dietician Website and checks the "<Top Menu Tabs>" on the Home Page
    Then User should see the Top Menu Tabs displayed in the Home Page

    Examples: 
      | Top Menu Tabs |
      | PRODUCT       |
      | CLIENTS       |
      | TEAM          |
      | REGISTER      |

  Scenario Outline: Verifying the bottom Menu bar tabs on the Home Page
    Given User is on the browser
    When User opens the Dietician Website and checks the "<Bottom Menu Tabs>" on the Home Page
    Then User should see the Bottom Menu Tabs present in the Home Page

    Examples: 
      | Bottom Menu Tabs |
      | About            |
      | Featured         |
      | Blog             |
      | Contact us       |

  Scenario Outline: Verifying the visibility of the search option on the menu bar of the Home Page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a search option symbol on the bottom menu bar of the Home Page

  Scenario Outline: Verifying the visibility of the SignIn option on the menu bar of the Home Page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a SignIn option symbol on the bottom menu bar of the Home Page
