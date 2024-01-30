Feature: Calculator

  Background:
    Given We have a calculator

  Scenario: Add two numbers
    When  We add 1 and 2
    Then We get a result of 3

  Scenario: Add a positive and negative number of the same value
    When  We add 1 and -1
    Then We get a result of 0

  Scenario Outline: Add a variety of numbers
    When We add <a> and <b>
    Then We get a result of <sum>

    Examples:
      | a | b  | sum |
      | 1 | 2  | 3   |
      | 1 | -1 | 0   |
      | 2 | 3  | 5   |

  Scenario: Sum a list of of numbers
    Given We have a calculator
    When We have a list of numbers:
      | 1 |
      | 4 |
      | 5 |
    Then We get a sum of 10
