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
Feature: Search patients

  @tag1
  Scenario: Search feature
    Given User is on any page after login
    When User clicks on "My Patients" tab
    Then Name, email and phone number filter options and search button are displayed.
    
  @tag1
  Scenario: Verify search button text
    Given User is logged in
    When User is on my patients1
    Then Button used for search has text as 'Search'

  @tag1
  Scenario: Verify default text in name filter input box goes away
    Given User is on my patients 
    When User starts typing inside name filter box
    Then Text inside name filter box should disappear

  @tag1
  Scenario: Verify default text in email input box goes away
    Given User is on my patients
    When User starts typing inside email address filter box
    Then Text inside email address filter box should disappear
    
       @tag1
    Scenario: Verify default text in phone number input box goes away
    Given User is on my patients
    When User starts typing inside phone number filter box
    Then Text inside phone number filter box should disappear
    
      @tag1
    Scenario Outline: Search patients by name
    Given User is on my patients
    When User clicks on search with <name phrase> into name filter box.
    Then Button Records for <name phrase> are shown.
    Examples: 
      | name phrase  | 
      | Test Patient1 |  
      | Test Patient2 |    
    
      @tag1
   Scenario Outline: Search patients by email
    Given User is on my patients
    When User clicks on search with <email phrase> into email address filter.
    Then  Records for <email phrase> are shown.
    Examples: 
      | email phrase  | 
      | TestPatient1@dummy.com |  
      | TestPatient2@dummy.com |  
    
    
      @tag1
   Scenario Outline: Search patients by phone number
    Given User is on my patients
    When User clicks on search with <phone number> into phone number filter.
    Then Records for <phone number> are shown.
        Examples: 
      | phone number  | 
      | 1234567890 |  
      | 1234567891 |  
    
      @tag1
  Scenario Outline: Search patients by name and phone number
    Given User is on my patients
    When User clicks on search button with <name phrase> into name filter box, <phone number> into phone number filter
    Then Records for <name phrase> and <phone number> are shown.
      Examples: 
      | name phrase  | phone number |
      |Test Patient1 | 1234567890 |  
      |Test Patient2 | 1234567891 |  
    
          @tag1
  Scenario Outline: Search patients by name and email address
    Given User is on my patients
    When User clicks on search button with <name phrase> into name filter box, <email phrase> into email address filter box
    Then Records for <name phrase> and <email phrase> are shown.
     Examples: 
      | name phrase  | email phrase |
      |Test Patient1 | TestPatient1@dummy.com |  
      |Test Patient2 | TestPatient2@dummy.com  |  
    
      @tag1
  Scenario Outline: Search patients by email address and phone number
    Given User is on my patients
    When User clicks on search button with <phone number> into phone number filter box, <email phrase> into email address filter box
    Then Records for <phone number> and <email phrase> are shown.
    Examples: 
      | phone number  | email phrase |
      |1234567890 | TestPatient1@dummy.com |  
      |1234567890 | TestPatient2@dummy.com  |   
      