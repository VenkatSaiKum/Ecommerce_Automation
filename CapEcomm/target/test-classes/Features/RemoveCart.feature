Feature: Automation RemoveCart

  @tag1
  Scenario: RemoveCart
    Given On lognpage
    When loggedin
    And productadded to cart
    And Remove from cart
    Then valdiate products
