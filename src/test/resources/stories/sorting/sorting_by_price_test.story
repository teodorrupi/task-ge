Meta:
@tag Release: 1.0
@testtype regression
Narrative: Test correct sorting by price

Scenario: Test sort by price sorts correctly
Meta:
@issue #ISSUE.NO
Given user opens home page
When user inputs from destination as 'Berlin'
When user inputs to destination as 'Prague'
When user performs search
Then sorting by price for train is correct
Then sorting by price for airplane is correct
Then sorting by price for bus is correct
