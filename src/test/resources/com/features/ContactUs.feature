Feature: Data fields on Contact us Page

  Scenario: Validating all fields on Contact us Page
    Given User is on Contact us page
    When User enters submit button with all fields empty
    Then User should get error message

  Scenario Outline: Validating the first name field on Contact us Page
    Given User is on Contact us page
    When User enters invalid data in <First Name> field
    Then User should get appropriate error message for First Name

    Examples: 
      | First name |
      | di23$%     |
      | na469@     |

  Scenario Outline: Validating the last name field on Contact us Page
    Given User is on Contact us page
    When User enters invalid data in <Last Name> field
    Then User should get appropriate error message for Last Name

    Examples: 
      | Last name |
      | pal28$%   |
      | opea41r9@ |

  Scenario Outline: Validating the email field on Contact us Page
    Given User is on Contact us page
    When User enters invalid data in <Email> field
    Then User should get appropriate error message for email

    Examples: 
      | email        |
      | pal28$%@c.cd |
      | opea41r9@dsl |

  Scenario Outline: Validating the Subject field on Contact us Page
    Given User is on Contact us page
    When User enters junk data in <Subject> field
    Then User should get appropriate error message for Subject

    Examples: 
      | subject   |
      | hioal28$% |
      | weop41r9@ |

  Scenario Outline: Validating the Write your Message Here field on Contact us Page
    Given User is on Contact us page
    When User enters invalid data in <Write your Message Here> field
    Then User should get appropriate error message for Message

    Examples: 
      | write your Message Here |
      | pal28$%fksfs            |
      | opea41r9@ fsjjkjo fhfd  |
