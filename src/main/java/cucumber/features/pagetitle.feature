Feature: Check the page title

  Scenario: Check page title for Descopera Ubuntu page
    Given I am on Ubuntu website
    When I navigate to Descopera Ubuntu
    Then I check page title is Descopera Ubuntu
    And I close the browser

  Scenario: Check page title for Obtine page
    Given I am on Ubuntu website
    When I navigate to Obtine
    Then I check page title is Obtine
    And I close the browser

  Scenario: Check page title for Stiri page
    Given I am on Ubuntu website
    When I navigate to Stiri
    Then I check page title is Stiri
    And I close the browser
