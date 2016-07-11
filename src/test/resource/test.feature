Feature: To test the high level functionality of the web test site

  Background:
    Given I am on the web site

    Scenario: Populate the contact form
      When I click on the "Contact"
      And I populate the entire form
      And I submit the contact form
      Then I check I am on the confirmation page
      And I close browser