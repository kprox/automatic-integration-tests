Meta:
@login

Narrative:
As a user
I want to login using valid credentials
So that I can access MyML sections

Scenario: Login with valid credentials

Given I am on Home page
When I click on Login button
And I use a test username
And I click Continue
And I use a test user password
And I click Login
Then the Nickname shows a valid test user nickname