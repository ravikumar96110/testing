Feature: Login and adding items to cart in Demo Webshop 

Background: Launching of the webshop
Given user clicks on Demo Web shop icon
And  it will directed to home page

Scenario: Login to DemoWebshop 


Given Click on to Login button
Then Enter login mail id and password
And click the login button

Scenario: Adding any other item to the cart


Given Click on to the Electronics in Categories
Then Click on any Cellphones
When User clicks on Smartphone add to cart
And item is added to cart

Scenario: Adding book to the cart
Given Click on to the Books in Categories
Then Click on any books
When User clicks on books add to cart
And item is added to cart