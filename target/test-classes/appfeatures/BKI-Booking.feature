Feature: Etailpet Web features
@Smoke
Scenario:  BKI- Login as a Retailer 
Given user is in landing page
When user enters valid username
And user enters vaid  password
And clicks on Sign-in button
Then user select Bookit from dashboard
Then user click on booking tab
Then user click on Schedule tab 
Then user click on new Appointment tab
Then User Select Customer
Then User Select pet type
Then User Select service type
Then User select service name
#Then User select Attendant 
Then User Select TimeSlot