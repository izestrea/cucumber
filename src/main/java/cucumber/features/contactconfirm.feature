Feature: To test contact form works when there are no errors

  Scenario: Check form is validated when there are no errors
    Given I am on my zoo website
    When I click on the contact link
    And populate the contact form
    Then I should be on the contact confirmation page
