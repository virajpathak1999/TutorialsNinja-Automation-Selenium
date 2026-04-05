Feature: feature to test login functionality

  Scenario: successful login with valid credentials
    Given user is on home page
    When user is on login page
    And user enters username and password
    Then click on login button
   
   Scenario Outline: unsuccessful login with invalid or empty credentials
    Given user is on home page
    When user is on login page
    And user enters invalid <username> and <password>
    Then click on login button

    Examples: 
      | username             | password   | 
      | invalid@gmail.com    | invalid123 |
      | pavankumar@gmail.com | pavan      |
