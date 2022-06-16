Feature: User confirming health conditions by toggle on Confirm conditions and Create Plan Page

  Scenario: Validating the visibility of toggle option menu box for updating health conditions
    Given User is logged on to Dietician website
    When User lands on the Confirm Conditions and Create Plan page
    Then User should see toggle option menu box to update health conditions

  Scenario: Validating the visibility of Confirm button on the toggle option menu box
    Given User is logged on to Dietician website
    When User lands on the Confirm Conditions and Create Plan page
    Then User should see Confirm button in the toggle option menu box

  Scenario: Validating the interaction of the toggle buttons for updating health conditions
    Given User is logged on to Dietician website
    When User lands on the Confirm Conditions and Create Plan page
    Then User can update the health conditions using the Toggle buttons

  Scenario: Validating that the toggle buttons are disabled after confirm button is clicked
    Given User is on Create Plan Page
    When User clicks on Confirm button in the toggle option menu box
    Then User cannot update the health conditions in the toggle option menu box
