Feature:  Bingo game Test
  As user I want to login into Canadian Dollar Bingo website

  @smoke
  Scenario: User should navigate to Bingo page successfully
    Given I am on homepage
    When I am mouse hover on game
    And  I am click on Bingo
    Then I should see 'Bingo' text