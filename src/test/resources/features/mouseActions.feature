@mouseActions
  Feature: This feature file has test scripts for mouse actions
    Scenario: mouse hover
      Given launch mouse actions dummy website
      When move mouse to self paced video course and click SCC

      Scenario: right click
        Given launch right click dummy url
        Then right click the button

        Scenario: drag and drop
          Given launch mouse actions dummy website
          Then drag and drop the element

          Scenario: double click
            Given launch mouse actions dummy website
            And double click the element
