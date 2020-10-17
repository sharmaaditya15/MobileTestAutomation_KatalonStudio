Feature: Register user and Login To Mobile App

  Background: 
    Given User opens the app

  Scenario Outline: Register a new user
    When Clicks on the link to create account
    And Enters the <name> in name field
    And Enters the <email> in email field
    And Enters the <password> in password field
    And Enters the <password> in confirm password field
    And User clicks on Register button

    Examples: 
      | name     | email                 | password |
      | testuser | testuser@testmail.com | testuser |

  Scenario Outline: Verify user is able to login successfully
    When User enters the <username> and <password>
    And User clicks on Login button
    Then User <username> is logged in successfully

    Examples: 
      | username              | password |
      | testuser@testmail.com | testuser |
