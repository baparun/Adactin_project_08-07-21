Feature: Hotel Booking Functionality


#Scenario: User Want to login the application
#Given User launch the adactin application
#When user enter "<Username>" the valid username
#And user enter "<Password>" the valid password
#And User click login button
#Then user validate the username and password



#Background run every scenario individually {Just to run just one scenario}
#Background:  
#   Given User launch the adactin application
#When user enter "SowmiyaSri" the valid username
#And user enter "Sowmiya05" the valid password
#And User click login button
#Then user validate the username and password
@arun
Scenario Outline:  User Want to login the application
Given User launch the adactin application
When user enter "<Username>" the valid username
And user enter "<Password>" the valid password
And User click login button
Then user validate the username and password
Examples:
	|Username|Password|
	|SowmiyaSri|Sowmiya05|
	
Scenario: User want to search Hotel 
    When User want to select location
    And User want to select Hotel
    And User want to select RoomType
    And User want to select number of rooms
    And User want to select CheckIn date
    And User want to select CheckOut date 
    And User want to select Adult per Room
    And User want to select Children per Room
    And user click Search button
    Then  User validate the search

    Scenario: User to check the Hotel Detail
    	When User want to conform  detail
        And User click to continue Button
        Then User validate the continue

       
        Scenario: User want ot Book A Hotel
        	When  User enter the firstname
            And User enter the lastname
            And User enter the Billing_Address
            And User enter the creditcard number
            And User want to select Credit_card_Type
            And User want to select CC_Month and CC_Year
            And User want to CVV Number
            Then User click the BookNow Button 
           
            Scenario: User want to check Booked_Room 
            	When User Want to check the Booked_Room
                Then User want to logout 