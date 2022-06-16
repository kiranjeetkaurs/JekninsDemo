Feature: Pagination of Doctor Teams

  Scenario Outline: Validating the first page of Doctor Team
    Given User is on Dietician Website
    When User lands on Teams Page
    Then User sees Doctor name on Doctor team page

  Scenario Outline: Validating default number of doctor names on first doctor team page
    Given User is on Dietician Website
    When User lands on Teams Page
    Then User should see <3 default	Doctor names> on the First Page

    Examples: 
      | Default Doctor Names |
      | Dr. Vijaya Madhavi   |
      | Dr. Geeta Thakur     |
      | Dr. Swati P          |

