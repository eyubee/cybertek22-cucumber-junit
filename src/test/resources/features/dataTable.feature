Feature: Examples of Cucumber data table implementations

  Scenario: something happens
    #Given user does something
  Then user should below words display
    | Apple      |
    | Kiwi       |
    | Orange     |
    | Strawberry |
    | Mango      |
    | Tomato     |
  @wip
    Scenario:  Library login example using data table
      Given user is on the login page of library app
      When user entres username and password as below
      |username |librarian13@library.cm|
      |password | 9rf6azdD             |
      Then user should see title is something
