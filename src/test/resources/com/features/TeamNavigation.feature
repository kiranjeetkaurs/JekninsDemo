Feature: Validation of Navigation feature of the Doctor Team Page

  Scenario: Validating the previous page button on the Doctor Team Page
    Given: User is on the Dietician Website
    When: User lands on the first page of Doctor Team Page
    Then: user should have the Previous button disabled


  Scenario: Validating the previous page button if previous pages exist on the Doctor Team Page
    Given: User is on the second page of Team 
    When: User clicks on previous button
    Then: User should be directed to previous Team page


  Scenario: Validating the next button on the first page of Doctor Team Page
    Given: User is on the first page of Team
    When: User clicks on Next button
    Then: User should be directed to next Doctor on the Team Page


  Scenario: Validating the next page button on the last page of Doctor Team Page
    Given: User is on the Team Page
    When: User lands on the last page of Team
    Then: Next button should be disabled

