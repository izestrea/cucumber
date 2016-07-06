Feature: Submit a valid contact form

  Scenario: Submit form using valid data
    Given I am on the Ubuntu site
    When I navigate to contact
    And I submit the form with valid data
    Then I check the the form has been submitted