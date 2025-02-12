Feature: Create a new user for demoBlaze app

Scenario: Verify SignUp page for DemoBlaze app

Given User Launches Chrome Browser 
When User enters URL "https://demoblaze.com/"
And Clicks on SignUp link
And Signup with new username as "Auto_10" and password as "P@ssword@089"
And Clicks on SignUp button
Then Clicks on Ok JS alert pop up
And Close the browser