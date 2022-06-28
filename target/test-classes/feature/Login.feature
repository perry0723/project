Feature: login functionality

  Background: Background Section
    Given user is on login page

  Scenario Outline: Login with Invalid Credentials
    When user enters invalid username "<username>" and password "<password>"
    And clicks on login
    Then error message pops up

    Examples: 
      | username | password |
      | golu     | gullu    |
      | mush     | mushhu   |
      | small    | large    |

  Scenario Outline: Login with valid Credentials
    When user enters valid username "<username>" and password "<password>"
    And clicks on login
    Then User navigates to homepage

    Examples: 
      | username | password  |
      | admin    | Admin@123 |
