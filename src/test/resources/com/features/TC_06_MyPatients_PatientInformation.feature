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
Feature: Patient information

  @tag1
  Scenario Outline: Verify patients information
    Given User has searched patients
    When Patients records are displayed
    Then Columns <Record Number> <Cust Id> <Name> <Details> <LastVisit> <Actions>
    Examples: 
      | Record Number  | Cust Id | Name  | Details                                   | LastVisit   |  Actions                    |
      |"1"               | "C123"    | "Nisha" | "TestPatient1@dummy.com 0123456789 Seattle" | "Jul 7, 2021" |  "View Previous Test Reports" |
      |"1"               | "C123"    | "Nisha" | "TestPatient1@dummy.com 0123456789 Seattle" | "Jul 7, 2021" |  "View Previous Diet Plans"   |
      |"1"               | "C123"    | "Nisha" | "TestPatient1@dummy.com 0123456789 Seattle" | "Jul 7, 2021" |  "Create New Report  Plan"   |
      
   
    Scenario: View pateints previous diet plans
    Given Patients records are displayed
    When User clicks on button 'View Previous Diet Plans'
    Then It redirects user to 'Generated Diet Plans' page
    
    Scenario: Create new diet plan
    Given Patients records are displayed
    When User clicks on button 'Create New Report/Plan'
    Then It redirects user to 'Confirm Health Conditions and Generate a New Diet plan' page
    
    Scenario: View patients previous test reports
    Given Patients records are displayed
    When User clicks on button 'View Previous Test Reports'
    Then It redirects user to 'View Patient Test Reports' page
    
       
      
    
 
  