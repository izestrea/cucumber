Feature: To test the high level functionality of test site

  Scenario: To set the start date
    Given I am on test site
    When I click on "Adoption"
    Then I set the start date to "Today"
    Then I close the browser

  Scenario: To populate the contact form
    Given I am on test site
    When I click on "Contact"
    Then I populate the contact form
    Then I close the browser
