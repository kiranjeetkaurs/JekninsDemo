Feature: User verifying Add New Patient Page
  Background: User is logged into Dietician Website as Dietcian
  
  Scenario: Verify Add New Patient Page and Details after login as Dietician
    Given User logged in Dietcian Home Page as Dietician and Clicks AddNewPatient tab
    When  User is on Add New Patient Page
    Then  User should see Add New Patient form displayed with Menu Tabs
    
  Scenario: Verify Add New Patient Page and Details after login as Dietician
    Given User is on Add New Patient Page as Dietician
    When  User clicks on Update Button without filling Madatory fields
    Then  User should see Error Message "Please fillup all the mandatory fields" displayed  
    
 Scenario Outline: Validate Add New Patient page by entering  different data for Full Name
    Given User is on Add New Patient Page as Dietician
    When  User enter invalid data/Empty in "<fullName>" of Add New Patient page and clicks on Update Button
    Then  User should verify the "<fullName>" and display the message
    Examples: 
      | fullName        |
      | j12345ackMaster |
      |                 |
      | Jac)(*&&&kMaster|
      
  Scenario Outline: Validate Address line 1 in Add New Patient page by entering  different data
    Given User is on Add New Patient Page as Dietician
    When  User doesn't enter data in "<Addressline1>" of Add New Patient page and clicks on Update Button
    Then  User should verify the "<Addressline1>" and displayed the message
     Examples: 
      | Addressline1 |
      |              |
      
 Scenario Outline: Validate Address line 2 in Add New Patient page by entering  different data
    Given User is on Add New Patient Page as Dietician
    When  User doesn't enter data in "<Address line2>" of Add New Patient page and clicks Update Button
    Then  User should verify "<Addressline2>" and display the message
    Examples: 
      | Addressline2 |
      |              |
      
 Scenario: Validate Country in Add New Patient page by entering Invalid data
    Given User is on Add New Patient Page as Dietician
    When  User didn't select "Country" of Add New Patient page and clicks on Update Button
    Then  User should see "select Country" message displayed

  Scenario Outline: Validate City in Add New Patient page by entering Invalid data
    Given User is on Add New Patient Page as Dietician
    When  User enters invalid data/Empty in "<city>" in Add New Patient page and clicks Update Button
    Then  User should check "<city>" and display the message for city
      Examples: 
         | city         |
         | Che34ii      |
         |              |
      
  Scenario Outline: Validate State/Province/Region in Add New Patient page by entering Invalid data
    Given User is on Add New Patient Page as Dietician
    When  User enter invalid data/Empty in "<State/Province/Region>" in Add New Patient page and click Update Button
    Then  User should check "<State/Province/Region>" and displays the message for state
    Examples: 
       | State/Province/Region |
       | Tamil566 |
       |          |
       | jj@!#$$6 | 
      
 Scenario Outline: Validate Postal Code in Add New Patient page by entering Invalid data
    Given User is on Add New Patient Page as Dietician
    When  User enter invalid data/Empty in "PostalCode" of Add New Patient and clicks Update Button
    Then  User should check the "PostalCode" and displayes the message for postal code
    Examples: 
      | PostalCode  |
      | 300897654  |   
      
  Scenario Outline: Validate Email in Add New Patient page by entering Invalid data
    Given User is on Add New Patient Page as Dietician
    When  User enter invalid data/Empty in "Email" of Add New Patient page and clicks on Update
    Then  User should check "Email" and displays the message for Email
     Examples: 
       | Email        |
       | samjackgmail.com |
       |                  |      
      
 Scenario Outline: Validate Phone no in Add New Patient page by entering Invalid data
    Given User is on Add New Patient Page as Dietician
    When  User enter invalid data/Empty in "Phoneno" of Add New Patient page and click on Update
    Then  User should check "Phoneno" and displays the message for Phone number
   Examples: 
      | Phoneno   |
      | 3456789   |
      |           |      
      
  
 Scenario Outline: Verify Add New Patient Page after login as Dietician
   Given User is on Add New Patient Page as Dietician
   When  User enters all details for "<fullname>""<Addressline1>""<Address line2>""<Country>""<city>""<State/Province/Region>""<PostalCode>""<Email>""<Phoneno>" and clicks on Update
   Then  User should go to My Patient page 
   Examples: 
      | full Name  |Addressline1|Addressline2 |Country|city    | State     |PostalCode|   Email      | Phoneno     |
      | Sam Rajesh |48 Dam st   |Near temple  |India  |Chennai | TamilNadu |600005    |sam@gmail.com | 8976543210  |   
      
      