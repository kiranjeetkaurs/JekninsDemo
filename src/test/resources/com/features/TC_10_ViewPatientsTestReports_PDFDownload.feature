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
  Scenario: Verify test report PDF file
    Given User is on 'View Patient Test Reports' pagee
    When user clicks on 'View PDF'
    Then PDF is opened in proper readable format
    

 @tag1
  Scenario: Verify content of PDF file
    Given User has clicked view PDF button
    When User is on PDF
    Then PDF has patients details like patient ID, name, email, address, phone number
    
  @tag1
  Scenario: Verify content of PDF file
    Given User has clicked view PDF button
    When User is on PDF
    Then PDF has doctor details like doc ID, doctor name, email address, clinic/facility name, doctor's specialization
    
   @tag1
  Scenario: Verify content of PDF file
    Given User has clicked view PDF button
    When User is on PDF
    Then PDF shows list of conditions, preferences list, Co-morbidites
    
     @tag1
  Scenario: Verify content of PDF file
    Given User has clicked view PDF button
    When User is on PDF
    Then PDF shows diet menu for 7 days, any warning and comments mentioned by doctor.

      