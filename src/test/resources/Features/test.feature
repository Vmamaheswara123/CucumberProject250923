@Test
Feature: Testing tagged hooks
@Regression
Scenario: Test the search results
  Given Google is open in the browser
  When User searches for Lambda Test
  Then Results are displayed
 
@Sanity
Scenario: Test the search results again
  Given Google is open in the browser
  When User searches for Selenium cross browser testing
  Then Results are displayed
 
 @E2E
Scenario: Test the search results for more than two keywords
    Given Google is open in the browser
    When User enters more than two keywords
    Then Results are displayed