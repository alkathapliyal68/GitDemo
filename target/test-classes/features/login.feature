Feature: Login into application

Scenario Outline: Positive test validating login
Given find driver with chrome driver
Given Hit to "http://qaclickacademy.com" with chrome
Given Click on login button in home page to land on secure sign in page
When user enters <username> and <password> and logs in
Then Varify user is successfully log in
And quit browsers

Examples:
|username					|password|
|ruchithap321@gmail.com		|123@nuKU|
|alka@gmail.com				|1234562 |