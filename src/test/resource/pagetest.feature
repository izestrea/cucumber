Feature: To test the high level functionality of test site

  Background:
    Given I am on test site

  Scenario: To set the start date
    When I click on "Adoption"
    Then I set the start date to "Today"
    Then I close the browser

  Scenario: To populate the contact form
    When I click on "Contact"
    Then I populate the contact form
    Then I close the browser

  Scenario: To set the start date
    When I click on "About"
    Then I close the browser

  Scenario: To populate the contact form
    When I click on "Home"
    Then I close the browser
