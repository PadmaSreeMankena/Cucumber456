Feature: Iam doing automation functionality of Add Nationality and Add Jobs in Orange HRM application


Background: Common Steps
Given User opens chrome browser
When User opens applicatyion URL"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"



Scenario: Add Nationality
Given User enters UserName as "Admin" and PassWord as "admin123"
When User navigates to Nationality Page
Then User creats nationality record
  |Indian1|
  |Indian2|
  |Indian3|
When User logout
And User close browser

Scenario: Add Jobs
Given User enters UserName as "Admin" and PassWord as "admin123"
When User creats Jobs record as
  |JobTitle|JobDescription|JobNote |
  |UK1     |UK1 desc      |UK1 note|
  |UK2     |UK2 desc      |UK2 note|
  |UK3     |UK3 desc      |UK3 note|
When User logout
And User close browser



