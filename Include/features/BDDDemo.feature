Feature: Test Login Functionality

  Scenario: Check whether the login successful with validcredentials
    Given user is on login page
    When user enter the username and password
    And clicks on login button
    Then user will navigate to the home page
