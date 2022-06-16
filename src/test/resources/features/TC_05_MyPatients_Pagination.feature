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
Feature: My Patients - Pagination

  @tag1
  Scenario: Verify that page needs pagiation
    Given Patients records are displayed
    When Records are more than 10
    Then It must show pagination links
    
  @tag1
  Scenario: Verify next pagination link functionality
    Given Patients records are displayed
    When User clicks on next pagination link
    Then It goes to next page and shows different patients on that page
    
      @tag1
  Scenario: Verify previous link functionality
    Given Patients records are displayed
    When  User clicks on previous pagination link
    Then It goes to previous page
    


  