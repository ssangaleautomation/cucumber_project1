Feature: Order information
              ///Background use as a repeted actions/Steps
Background:
Given User should be logged into the application
When User click on orders link
Then User should redirect to orders page

Scenario: Previously place order information
When User Click on past order button
Then User should be able to see past oredr information

Scenario: Currently placed order information
When User Click on current order button
Then User should be able to see current oredr information

