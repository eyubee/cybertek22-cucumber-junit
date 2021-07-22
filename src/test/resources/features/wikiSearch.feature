Feature: wikipedia search functionality
  as a user, i should be able to search terms and see relevant information

  Scenario: Wikipedia Search Functionality Title Verification
#  User is on Wikipedia home page
#  2. User types Steve Jobs in the wiki search box
#  3. User clicks wiki search button
#  4. User sees Steve Jobs is in the wiki title

   Given User is on Wikipedia home page
    When User types "Elon Musk" in the wiki search box
    And User clicks wiki search button
    Then User sees "Elon Musk" is in the wiki title
#    TC#26: Wikipedia Search Functionality Header Verification
#  1. User is on Wikipedia home page
#2. User types Steve Jobs in the wiki search box
# 3. User clicks wiki search button
#4. User sees Steve Jobs is in the main header

  Scenario: Wikipedia Search Functionality Header Verification
   Given  User is on Wikipedia home page
 When User types "Steve Jobs" in the wiki search box
 And User clicks wiki search button
 Then User sees "Steve Jobs" is in the main header
@ScenarioOutline
  Scenario Template: Wikipedia Search Functionality Header Verification
    Given  User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedMainHeader>" is in the main header
    Then User sees "<expectedTitle>" is in the wiki title

    Examples: search terms we are going to use in this template
      | searchValue       | expectedMainHeader | expectedTitle     |
      | Steve Jobs        | Steve Jobs         | Steve Jobs        |
      | Albert Einstein   | Albert Einstein    | Albert Einstein   |
      | James Bond        | James Bond         | James Bond        |
#      | Eyerusalem Tefera | Eyerusalem Tefera  | Eyerusalem Tefera |




