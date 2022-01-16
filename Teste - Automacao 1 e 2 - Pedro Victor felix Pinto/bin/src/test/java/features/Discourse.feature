Feature: Teste

  @Discourse.CY01
  Scenario: US167085 - Cliente Beta
    Given that I access page of "https://www.discourse.org/"
    When click at "Demo"
    And scroll to end of page
    Then print all titles of the closed topics
    And print how many itens there in each category
    And print the title of the highest number of views