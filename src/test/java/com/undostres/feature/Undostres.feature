Feature: undostres Online Payment Functionality
Scenario:  Login Function for Recarga Celular
Given undostres Webpage launched
When user need to  Cell phone number in Cell phone number field
And User need to click  the network field
And User need to select the network type  in network field
And user need to select the Recharge Balance amount
And user clicks on Following button


Scenario:  payment page 
Given The Application is on payment page
When User need to click the Tarjeta
And User need to click the Usar nueva tarjeta
And User need to enter the card number
And User need to enter the exp month
And User need to enter the exp year
And User need to enter cvv number
And User need to enter emailid
Then User need to click the Pay with Card


Scenario: Login to the accountpage
Given Application is on accountpage page
When  user need to enter the email id  
And user need to enter password
And user need click the reCAPTCHA
Then user need to click the access