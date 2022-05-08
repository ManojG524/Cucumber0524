Feature: Adding card
  Description: This feature file will run adding product card

  Scenario Outline: Adding Iteam to the catd
    Given I want to launch the browser alon with website
    And I Enterd username <Name> and <passcode>
    And I click on Login Button

    Examples: 
      | Name          | passcode     |
      | standard_user | secret_sauce |
