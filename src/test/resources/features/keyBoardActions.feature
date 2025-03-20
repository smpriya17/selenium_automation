@keyBoardActions
  Feature: This feature file has script for keyboard actions

    Scenario: click enter using keyboard
      Given launch google browser
      When user enter text field in search box
      Then hit enter

      Scenario: sample form
        Given launch tutorial practice form