Feature: Login Functionality
Scenario: Login validation with credentials
Given User is at login screen
When User enters username
And User enters password
And User click on login button
Then User should get redirect to home page

Scenario: title validation
Given User is at login screen
When User get title of page
Then Page title shold be verified

