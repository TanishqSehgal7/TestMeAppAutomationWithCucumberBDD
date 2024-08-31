@Login
Feature: Registered User Login

In order to login, user must be a registered beforehand.

Scenario: The one where the user logins with valid credentials

Given: User Navigates to Login page
When user enters user valid id as "AlexUser" and valid password as "Alex@123"
And Clicks on the Login button
Then User is logged in and navigated to Home page


Scenario: The one where the user logins with invalid credentials

Given: User Navigates to Login page
When user enters user id as invalid "TomUser" and invalid password as "Tom@123"
And Clicks on the Login button
Then Appropriate error message shows up on the screen stating that credentials are invalid.
