Feature: Test Login functionality of orangeHrm


Scenario: Test login unctionality with valid username with valid password



Given As a user we launch particular url "https://opensource-demo.orangehrmlive.com/"
When as  user we send the username "Admin" and password "admin123"
And as a user we click the login button
Then as a user we verifies title and url of the orange HRM 