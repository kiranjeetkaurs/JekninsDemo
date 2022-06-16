Feature: Validate the links under Dietician section when user is signed in

  Scenario Outline: Title of your scenario
    Given User is signed in on the Dietician website
    When User clicks on the link "<menu_link>" under Dietician section
    Then User is redirected to page "<menu_link>"

    Examples: 
      | menu_link                          |
      | View Recent Diets                  |
      | View Recent Test Reports           |
      | Add New Patient                    |
      | Dietician Home                     |
      | My Patients                        |
      | Confirm Conditions and Create Plan |
