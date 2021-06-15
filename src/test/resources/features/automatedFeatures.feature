Feature: Buying into SauceDemo

Scenario Outline: Adding and article and send it to my adress

Given I have valid credentials as <username> and <password>
When Adding backpack to my cart
And finishing my purchase entering deliver information as <name> <lastname> <postalCode>
Then I should see a succesful message
 Examples:
 |username|password|name|lastname|postalCode|
 |standard_user|secret_sauce|Felipe|Perez|400100 |

 Scenario Outline: Looking the max and min value articles to buy

  Given I have valid credentials as <username> and <password>
  When Adding the max and min value articles to buy
  And finishing my purchase entering deliver information as <name> <lastname> <postalCode>
  Then I should see <total> price in my cart
  Examples:
   |username|password|name|lastname|postalCode|total|
   |standard_user|secret_sauce|Felipe|Perez|400100 |57.98|