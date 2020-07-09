Feature: open the Browser enter The test Url and Login 
Scenario Outline: Homepage must be displayed
Given Enter the login
When  User enters "<name>" and password "<pass>"
And click the Submit button

Examples:
             |name                 |pass       |
             |affsatheesh@gmail.com|Timeover   |
             |affsatheesh@gmail.com|Timeend    |
             |sath@gmail.com       |Timeover   |
             |sath@gmail.com       |Timeeend   |
