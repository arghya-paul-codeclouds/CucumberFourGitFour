Feature: This is a feature for learning the Background keyword

  Background: User is successfully logged in
    Given User is on login page
    When User enters valid username and password
    And User clicks on the login button
    Then User is redirected to the Home page

  Scenario: Logout button is showing properly
    When user clicks the breadcrum
    Then Logout button is displayed

  Scenario: Cart icon is working properly
    When user clicks the cart icon
    Then user is redirected to the Cart page
