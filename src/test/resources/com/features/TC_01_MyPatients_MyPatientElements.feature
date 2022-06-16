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
Feature: My Patient elements

  @tag1
  Scenario: Verify my patient tab
    Given User is on any page after login
    When User clicks on "My Patients" tab
    Then My Patients tab is selected and highlighted
    
  @tag1
  Scenario: Verify breadcrumbs
    Given User is on any page after login
    When User clicks on "My Patients" tab
    Then It shows breadcrubs as "Dietician Software/ MyPatients"

  @tag1
  Scenario: Confirm my patient title
    Given User is on any page after login
    When User clicks on "My Patients" tab
    Then Page title is displayed as 'My Patients'


  