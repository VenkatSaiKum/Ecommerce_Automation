Feature: Automation Subscription

  @tag1
  Scenario: Subscription
    Given User on website hompage
    When type in Email-id
    And click on subscribe btn
    Then message validation
	