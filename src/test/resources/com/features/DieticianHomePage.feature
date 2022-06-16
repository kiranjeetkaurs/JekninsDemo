Feature: User verifying Dietican Home page Menu bar,Content and Image 
 
 Background: User is logged into Dietician Website

  Scenario Outline: Verify Dietician Home Page Menu items After Login as Dietician
    Given User logged in to the Dietician website
    When  User is in Dietician Home Page
    Then  User Should see "<Menu Tabs>" are displayed in header menu of Dietician Home Screen
    Examples: 
      | Menu Tabs |
      | Home      |
      |New Patient|
      |My Patients|
      |Diet Plans |
    
  Scenario: Verify Dietician Home Page Side Bar After Login as Dietician
    Given User logged in to the Dietician website
    When  User is in the Dietician Home Page
    Then  User Should see Banner or Announcements section in right side bar of Dietician Home Screen 
    
  Scenario Outline: Dietician Home Page "Logged in as Dietician name" message verification After Login as Dietician
    Given User logged in to the Dietician website
    When  User is  Dietician Home Page
    Then  User Should see Logged in Dietician Name Message in top right side of Dietician Home Screen 
    Examples: 
      | Dietcian Name |
      | Sam Ganguly   |
    
 Scenario: Verify Dietician Home Page Content and Image is Displayed After Login as Dietician
    Given User logged in to the Dietician website
    When  User in the Dietician Home Page of Dietician site
    Then  User should see image and content displayed in Dietician Home Screen
    
 Scenario: Verify Clicking on New Patient link After Login as Dietician
    Given User logged in to the Dietician Home Page
    When  User selects New Patient link/button
    Then  User lands on Add New Patient page
    
 Scenario: Verify Clicking on My Patient link After Login as Dietician
    Given User logged in to the Dietician Home Page
    When  User selects My Patient link/button
    Then  User lands on My Patient page
    
 Scenario: Verify Clicking on Diet Plans link After Login as Dietician
    Given User logged in to the Dietician Home Page
    When  User selects Diet Plans link/button
    Then  User lands on Diet Plans page 
    
 Scenario: Verify Dietician Home Page SIGN OUT After Login as Dietician
    Given User logged in Dietician Home Page of Dietician site
    When  User can see "SIGN OUT" button after successful login
    Then  User can click on "SIGN OUT" button for logging off successfully                       
    
    

   
