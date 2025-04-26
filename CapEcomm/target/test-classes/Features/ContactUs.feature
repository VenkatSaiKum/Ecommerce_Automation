Feature: Automation ContactUs

  @tag1
  Scenario: Contactus
    Given user on website home
    When click on contactus
    And fillout get in touch
    And upload file
    And click on submit
    Then verify success message