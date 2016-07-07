Feature: Check the page title

#  Scenario: Check page title for Descopera Ubuntu page
#    Given I am on Ubuntu website
#    When I navigate to "menu-item-24"
#    Then I check page title is "Ubuntu România | Descoperă Ubuntu"
#    And I close the browser
#
#  Scenario: Check page title for Obtine page
#    Given I am on Ubuntu website
#    When I navigate to "menu-item-35"
#    Then I check page title is "Ubuntu România | Obține"
#    And I close the browser
  @web
  Scenario Outline: Check page title for Stiri page
    Given I am on Ubuntu website
    When I navigate to <Link>
    Then I check page title is <Title>
    And I close the browser
    Examples:
      | Link         | Title            |
      | menu-item-24 | Descoperă Ubuntu |
    #  | menu-item-35 | Obține           |
      | menu-item-31 | Ştiri            |
