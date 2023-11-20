Feature:I want to login to the application

Background:I want to login to the appliction
Given open browser 
And I open login page

Scenario:I want to login to the application
 
When I enter my username 
And I enter my password
Then I should be logged in

Scenario:I want to login invalid 
When I enter invalid username
And I enter my invalid password
And I click submit
Then I should get error message