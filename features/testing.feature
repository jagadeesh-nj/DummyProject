Feature: customers feature
  
  Background :  User Open the Chrome driver

 @grid
  Scenario Outline: Add a new customer
    Given user open the "www.gooogle.com"
    And user clic on add customer link
    When user enters the "<email>" and "<password>"
    And user clicks on save button
    And user verifies that credentials are saved

    Examples: 
      | email     | password |
      | jagadeesh | royal    |
      | kalyan    | chowdary |
