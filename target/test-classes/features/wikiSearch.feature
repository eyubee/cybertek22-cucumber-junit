Feature: wikipedia search functionality
  as a user, i should be able to search terms and see relevant information

  Scenario: Wikipedia Search Functionality Title Verification
#  User is on Wikipedia home page
#  2. User types Steve Jobs in the wiki search box
#  3. User clicks wiki search button
#  4. User sees Steve Jobs is in the wiki title

   Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title
#    TC#26: Wikipedia Search Functionality Header Verification
#  1. User is on Wikipedia home page
#2. User types Steve Jobs in the wiki search box
# 3. User clicks wiki search button
#4. User sees Steve Jobs is in the main header
  @wip
  Scenario: Wikipedia Search Functionality Header Verification
   Given  User is on Wikipedia home page
 When User types "Steve Jobs" in the wiki search box
 And User clicks wiki search button
 Then User sees "Steve Jobs" is in the main header



