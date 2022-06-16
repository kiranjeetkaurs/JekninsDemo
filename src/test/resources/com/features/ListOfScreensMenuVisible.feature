Feature: List of Screens menu visibility

  Scenario: Validate the visibility and name of List of screens link on Home page
    Given User is on the Dietician website
    When User selects the link with three horizontal lines displayed on top right corner
    Then User should see name on the list of screens as "Screens"
