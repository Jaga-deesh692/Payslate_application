Feature: Login Functionality

  Scenario Outline: : Login the PaySlate App with valid credentials using email and Password
    Given User launches the PaySlate app
    And User click on ngrok settings Button
    And User enter http method into the field successfully
    And User clicks on saveAndApplyBtn Successfully
    And User will click on Email Link
    And User Enters the valid <email> address and <Password>
    And User Clicks on Login with email Button
    Then User will successfully login and navigate to business Page

    Examples:
    |email                             |Password  |
    |bjagadeesh87902@gmail.com         |Aaaa111&  |

