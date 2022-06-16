Feature: Validate the screens under Dietician section

  Background: Dietician user is not logged on Dietician website

  Scenario: Validate the Public section on list of screens
    Given User is on the Dietician website
    When User selects the link with three horizontal lines displayed on top right corner
    Then User should see the "Dietician" sub menu

  Scenario Outline: 
    Given User is on the Dietician website
    When User clicks on the link "<menu_link>" under Dietician section
    Then User is redirected to "Sign In" page

    Examples: 
      | menu_link                          |
      | View Recent Diets                  |
      | View Recent Test Reports           |
      | Add New Patient                    |
      | Dietician Home                     |
      | My Patients                        |
      | Confirm Conditions and Create Plan |
