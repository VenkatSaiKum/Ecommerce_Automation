Feature: Automation Register

  @tag1
  Scenario: Register
    Given User on Website
    When Signup username and password
    And Enter Acc Info
    And Enter Address Info
    And Logout funtion
    Then On homepage
