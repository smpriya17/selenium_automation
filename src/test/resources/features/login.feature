@demo
  Feature: This file has a test scripts for login features

    Scenario Outline: log in
      Given launch swag labs demo site
     # When I enter "<userName>" and "<password>"
     # Then click login
      Examples:
      |userName|password|
     |standard_user|secret_sauce|
      #|abc@gmail.com|Java@1      |

  Scenario: read excel sheet
    Given read and run excel data