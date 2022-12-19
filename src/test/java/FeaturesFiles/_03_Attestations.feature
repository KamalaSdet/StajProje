Feature: Attestations Feature

  Background:
    Given Naviagate to Campus
    When Enter username and password and click Login button
    Then User should login successfuly
    And Naviagate to Attestations Categories

    Scenario Outline:Create Name in Attestations Categories with Outline
      When User add "<name>" in Attestations Categories
      Then Success message should be displayed

      When User delete the "<name>"
      Then Success message should be displayed

      Examples:
        | name  |
        | Ali1 |
        | Ali2 |
