#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Fetch patients with invalid dat

  @tag1
  Scenario: Search Filters
    Given User is on my patients page
    When User types in anything other than [0-9] in phone number field
    Then It must throw error message and discontinue search action.
    
  @tag1
  Scenario: Search Filters
    Given User is on my patients page
    When User types in anything other valid character in email address field
    Then It must throw error message and discontinue search action.

  @tag1
  Scenario: Search Filters
    Given User is on my patients page
    When User types in anything other alphabets in name field
    Then It must throw error message and discontinue search action.


  