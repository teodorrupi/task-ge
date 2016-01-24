Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Test sort by price sorts correctly
Given user opens home page
When user inputs from destination as 'Berlin'
When user inputs to destination as 'Prague'
When user performs search
Then sorting by price for train is correct
Then sorting by price for airplane is correct
Then sorting by price for bus is correct
