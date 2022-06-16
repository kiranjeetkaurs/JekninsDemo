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
Feature: Patients test reports - Pagination

  @tag1
  Scenario: Verify pagination
    Given User clicks on button 'View Previous Test Reports' on Test Reports page.
    When User is on 'View Patient Test Reports' page.
    Then More than 3 records should be displayed on different pages through pagination
    
  @tag1
  Scenario: Verify next link
    Given User clicks on button 'View Previous Test Reports' on Test Reports page.
    When User is on 'View Patient Test Reports' page.
    Then Pagination has 'VNext' link
 
   @tag1
  Scenario: Verify previous link
    Given User clicks on button 'View Previous Test Reports' on Test Reports page.
    When User is on 'View Patient Test Reports' page.
    Then Pagination has 'VPrevious' link