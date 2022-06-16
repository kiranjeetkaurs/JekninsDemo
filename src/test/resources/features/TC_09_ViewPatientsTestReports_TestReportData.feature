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
Feature: Test report data



 @tag1
  Scenario: Verify presence of pdf file for each report
    Given User clicks on button 'View Previous Test Reports'..
    When User is on 'View Patient Test Reports' page..
    Then Every record shows 'view PDF' option
    

 @tag1
  Scenario Outline: Verify columns data on patients Test report data
    Given User clicks on button 'View Previous Test Reports'..
    When User is on 'View Patient Test Reports' page..
    Then Columns <File> <Doc Id> <File upload time> <name> <identified conditions> <Actions>
    Examples: 
      | File      | Doc Id  | File upload time      | name           | identified conditions   |
      | "view PDF"  | "DOC-001" | "Jul 13, 2021 01:23:45" | "Thyroid report" | "None"                    |
      