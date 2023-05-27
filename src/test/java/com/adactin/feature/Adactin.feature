Feature: Hotel Booking In Adactin Application

Scenario: User Login The Web Application
Given user Launch The Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigates Search Hotel Page

Scenario: User Search Hotel Page The Web Application
Given user Login The Adactin Application
When user Select The Location In Location Field
And user Select The Hotel Name In Hotel Name Field
And user Select The Roomtype In Roomtype Field
And user Select The Room Number In Room Number Field
And user Enter The Checkin Date In Checkin Date Field
And user Enter The Checkout Date In Checkout Date Field
And user Select The Adultper Room In Adultper Room Field
And user Select The Childrenper Room In Chidrenper Room In Childrenper Room Field
Then user Click The Search Button  And It Navigates Select Hotel Page
 
Scenario: User Select The Hotel Page The Web Application
Given user Select Hotel The Adactin Application
When user Select The Radio Button In The Select Hotel Page
Then user Click The Continue Button And  It Navigates Book A Hotel Page
 
Scenario: Book A Page Functionality
Given user Select The Hotel Name In Adactin Application
When user Enter The Firstname In Firstname Field
And user Enter The Lastname In Lastname Field 
And user Enter The Billing Address In Billing Address Field
And user Enter The Credit Card Number In Credit Card Number Field 
And user Select The Credit Card Type In Credit Card Type Field
And user Select The Month Year In Expirydate Field
And user Enter The Cvv Number In Cvv Field
Then user Click The Booknow Button And It Navigates Logout Page

