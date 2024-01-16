
@login



Feature: Login functionality


  Scenario: Verify the login functionality by entering the valid username and passward

    Given Launch the brawser and navigates to login

    When Enter the username and passward

    Then User should navigates to home page

    Scenario: Verify the login functionality by entering the invalid username and passward

      Given Launch the brawser and navigates to login

      When Enter the invalid username and passward

      Then user should get the error message


