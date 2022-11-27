@autoSearch
Feature: AutoSearch

  Scenario: Auto Search Laptop Test
    Given user navigate to best buy
    And search laptop
    When click the laptop selected 
    And click warrenty 
    And add to chart 
    Then go to chart
    And  checkout 

 