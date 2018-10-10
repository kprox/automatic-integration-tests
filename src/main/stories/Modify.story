Meta:
@modify

Narrative:
As a user
I want to be able to check or uncheck the local pickup option
So that I can decide wether to have it or not

Lifecycle:
Before:
Scope: STORY

Given I logged in using an impersonalization link
Then the Nickname shows a valid test user nickname

Scenario: Verify Local Pickup checkbox

Given I am on Modify page
Then the Local Pickup checkbox is unchecked
When I click on Local Pickup checkbox
And I click on Save button
And I go to Modify page
Then the Local Pickup checkbox is checked
When I uncheck the Local Pickup checkbox
And I click on Save button