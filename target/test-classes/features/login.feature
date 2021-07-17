@regression  @smoke
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin
Background: Assuming user is on the login page
  Given user is on the login page

@librarian @employee @login
  Scenario: Login as librarian
    #this is how you create comments
   # Given user is on the login page
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

@student
    Scenario: Login as a student
    #Given user is on the login page
    When user enters student username
    And user enters student password
    Then user should see the dashboard

@admin @employee
Scenario: Login as a admin
    #  Given user is on the login page
      When user enters admin username
      And user enters admin password
      Then user should see the dashboard

  Scenario: User search title  verification
    When user is on Google
    And user searches for "wooden spoon"
    Then user should see "wooden spoon" in the title

