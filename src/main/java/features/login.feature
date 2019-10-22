Feature: validate login functionality

Background:








Scenario Outline: validate login with valid credentials

Given browser should lounch
When user is on loginpage
And click on loginlink
Then loginwindow should display
When user enter valid username and password " <username>"  "<password>"
And click on login button


Examples:
|username|password|
|sajadhav51@yahoo.com|jadhav123|

