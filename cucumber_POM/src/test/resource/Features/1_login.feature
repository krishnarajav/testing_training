Feature: Login feature

@set1
Scenario: Verify login is successful with valid login credentials
Given Login page is displayed
When User enters valid username and password
When User clicks login button
Then User successfully logs into Products page

@set2
Scenario: Verify login is unsuccessful with invalid login credentials
Given Login page is displayed
When User enters invalid username and password
When User clicks login button
Then User cannot login and error message is displayed

#Scenario Outline: Login with valid and invalid login credentials
#Given Login page is displayed
#When User enters "<username>" and "<password>"
#When User clicks login button
#Then The application should display the message "<message>"
#
#
#Scenario Outline: Login with login credentials
#When User enters "<username>" and "<password>"
#Then User session should be available
#
#
#Examples:
#|	username			|	password			|	message		|
#|	standard_user	|	secret_sauce	|	Products	|
#|	standard_user	|	word					|	Epic sadface: Username and password do not match any user in this service	|
