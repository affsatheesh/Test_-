Feature: open the Browser enter The test Url and Login username password created
Scenario Outline: Login Email Id Password Must be Created
Given Create login account
When  User enters "<name>" and mailId "<mail>"and password"<pass>"and conform "<conformpass>"
And click the Submit button

Examples:
 |name                    |mail                 |pass       |conformpass|
 |affsatheesh             |affsatheesh@gmail.com|Timeover   |Timeover|
 |affsatheesh             |sath@gmail.com       |Timeover   |Timeover|
 |affsatheesh             |sath@gmail.com       |Timeover   |Timeend|
