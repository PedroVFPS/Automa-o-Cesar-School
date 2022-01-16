Feature: Teste

  @Cesar.CY01
  Scenario: Cesar - Print informations
    Given that I access page of "https://www.cesar.school/"
    When click at "Blog"
    And I go to the second page
    Then print date and title of second publication
    And acess the third publication
    Then print title and author
    And scroll to end of page
    And print cesar school address
