Feature: BDC validation on demowebshop
@Sanity
Scenario: Register user access to cart in Demowebshop
Given user launched demo webshop app in chrome browser
Then user search for the item for his choice 
And adds that item to the cart

@Regression
Scenario: Register user access track the ordered item in DemoWebshop  
Given user has already placed an order for his favourite item
And user tries to access the order tracking dashboard
Then identifies the state of order