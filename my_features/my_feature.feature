Feature: my validations demo for testme in bdc 

Scenario: User access to guest registration 
Given Application is launched by guest user
When User click on signin link  available
And provides the required data in the form
Then user submits the data
And verifies for the account creation