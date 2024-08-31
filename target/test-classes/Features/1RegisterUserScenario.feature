Feature: TestMeApp Registration

In order to login to TestMeApp as a User, I need to register first.

Business Rules:
	- Registration is a mandatory step
	
@Register
Scenario: The one where user registers in the TestMeApp

Given Alex Opens TestMeApp Register page
When Alex Enters username as "AlexUser"
And Enters firstname as "Alex"
And Enters lastname as "Range"
And Enters password as "Alex@123"
And Enters confirm password as "Alex@123"
And Enters the Gender as "Male"
And Enters email address as "alex@gmail.com"
And Enters mobile number as "9130897889"
And Enters date of birth as "12/20/1989"
And Enters address as "Pune"
And Selects the security question as "What is you Pet Name?"
And Enters the answer as "Ellie"
And Clicks on Register button
Then Alex is successfully registered