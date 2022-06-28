Feature: Filter functionality

  Background: Navigation to login page
    When user is on login page
    And enters valid username and password
    And clicks on login
    And user navigates to Affiliates page

  Scenario Outline: Verify filter functionality with name and email
    When user enters Name "<Name>" and Id "<Id>"
    And clicks on filter
    Then List of Affiliates is filtered

    Examples: 
      | Name        | Id                 |
      | Abhi Goyal  |                    |
      | Happy Singh |                    |
      | Happy Singh | Happy171@gmail.com |

  Scenario: Verify filter functionality with Status and Approved
    When user selects Status and Approved dropdowns
    And clicks on filter
    Then List of Affiliates is filtered
