Feature: LoginFeature

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And User enters username and password
    When I click on login button
    Then I should see userperform page
