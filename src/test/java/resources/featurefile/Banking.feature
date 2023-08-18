Feature:  Banking Test
  As user I want to login into Canadian DollAr Bingo website

  @smoke
  Scenario: User should navigate to Banking page successfully
    Given I am on homepage
    When I am click on Banking
    Then I verify list of payment option