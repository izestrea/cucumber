Feature: Submit a valid contact form

  Scenario: Submit form using valid data
    Given I am on the Ubuntu site
    When I navigate to contact
    And I submit the form with valid data
      | Fields  | Values          |
      | Name    | John Doe        |
      | Email   | john@doe.com    |
      | Webpage | www.johndoe.com |
    Then I check the the form has been submitted