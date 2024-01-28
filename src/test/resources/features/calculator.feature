Feature: Calculator
  Scenario: Add two numbers
    Given We have a calculator
    When  We add 1 and 2
    Then We get a result of 3

  Scenario: Add a positive and negative number of the same value
    Given We have a calculator
    When  We add 1 and -1
    Then We get a result of 0

