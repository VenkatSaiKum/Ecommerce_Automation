Feature: Automation Invalid Subscription

  @tag1
  Scenario: Invalid Subscribe
    Given User has to be on website hompage
    When enter email address
    And clicks btn of subscribe
    Then error msg validation
