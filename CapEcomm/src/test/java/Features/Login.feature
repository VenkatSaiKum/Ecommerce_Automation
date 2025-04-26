Feature: Automation Login

  @tag1
  Scenario: Login
    Given User on loginpage
    When Enter mailaddress
    And Enter password
    And verify text
    Then User on login
