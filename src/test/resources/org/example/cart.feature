Feature: Buy some stuff

  Scenario: I am at the Apple Store

    Given I have the following items in my cart
      | Item        | Part No | Color | Quantity | Price |
      | iPhone 6S   | 123654  | White | 1        | 899   |
      | iPhone case | 756322  | Black | 1        | 24    |
      | Car Charger | 658741  | Black | 3        | 9.95  |

    When I check out
    Then I will be charged 952.85