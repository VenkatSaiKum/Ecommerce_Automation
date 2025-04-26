Feature: Automation Product Search

  @tag1
  Scenario: Product Search
    Given User on products page
    When User type-in product
    And Click on Search
    And Validate product
    Then verify product
