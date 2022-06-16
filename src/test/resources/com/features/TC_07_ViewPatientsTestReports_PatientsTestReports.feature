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
Feature: Patients test reports

  @tag1
  Scenario: Verify my patient tab on test report page
    Given User has searched patients after login
    When User is on 'View Patient Test Reports' page
    Then "My Patients" tab is selected/highlighted
    
  @tag1
  Scenario: Verify breadcrumbs on test report page
    Given User has searched patients after login
    When User is on 'View Patient Test Reports' page
    Then It shows breadcrubs as "Dietician Software/ View Recent Test Reports"
 
   @tag1
  Scenario: Verify title
    Given User has searched patients after login
    When User is on 'View Patient Test Reports' page
    Then Title is displayed as 'View Patient Test Reports
        
   @tag1
  Scenario: Display patient's test reports
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then It displays patient's old and latest test reports
    
  @tag1
  Scenario: Verify table heading
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then It shows column heading as Record number, Doc-ID, File Uploaded time, File/Report name, Identified health conditions