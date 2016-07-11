Feature: To test the high level functionality of test site

  Background:
    Given I am on test site

  Scenario: To set the start date
    When I click on "Adoption"
    Then I set the start date to "Today"
    Then I close the browser