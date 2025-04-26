Feature: Automation Invalid Login

  @tag1
  Scenario: Invalid Login
    Given On login page
    When Enter mail and password
    And lgn
    And error msg
    Then print error
