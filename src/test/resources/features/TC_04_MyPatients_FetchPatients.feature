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
Feature: Fetch patients

  @tag1
  Scenario: Display list of patients.
    Given User is on my patients
    When User clicks on search button with all fields empty
    Then Displays all patients for that dietician only
    
  @tag1
  Scenario: Verify column names
    Given User is on my patients
    When User clicks on search button with or without all fields empty
    Then It shows columns name like Record Number, Cust ID, Name, Details, Last Visit and Actions

  @tag1
  Scenario: Verify Action column has buttons
    Given User is on my patients
    When User clicks on search button with or without all fields empty
    Then It shows action buttons for "View Previous Test Report", "View Previous Diet Plans", "Create New Report/ Plan"


  