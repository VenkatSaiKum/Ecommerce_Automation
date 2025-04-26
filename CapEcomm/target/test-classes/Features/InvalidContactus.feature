Feature: Automation Invalid ContactUs

  @tag1
  Scenario: Invalid Contactus
    Given user  website home
    When clicks on contactus
    And fillsout get in touch
    And uploads file
    And clicks on submit
    Then verify the message