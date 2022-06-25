Feature: Search Google

  Scenario: Verify search result title
    Given user open google home page
    When user search with keyword "Gojek"
    Then user see search result title "Gojek"