Feature: Login functionality

  Scenario Outline: Successful login with valid credentials
    Given User is on login page
    When User enters valid "<username>" and "<password>"
    And User clicks the login button
    Then User is redirected to the home page
    And The browser gets closed

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
