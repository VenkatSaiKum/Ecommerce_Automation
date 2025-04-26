Feature: Automation Cart Add

  @tag1
  Scenario: Add to Cart
    Given User is on products page
    When Add to cart
    And Click on view cart
    And verify product details in cart
    Then cart functionality performed
