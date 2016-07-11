Feature: To test the high level functionality of the web test site

  Background:
    Given I am on the web site

    Scenario: Populate the contact form
      When I click on the "Contact"
      And I enter "Name test" into the name field
      And I enter "Address test" into the address field
      And I enter "Postcode test" into the poscode field
      And I enter "Email test" into the email field
      And I submit the contact form
      Then I check I am on the confirmation page
      And I close browser