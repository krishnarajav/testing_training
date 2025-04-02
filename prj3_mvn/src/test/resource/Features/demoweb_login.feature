@demowebshop
Feature: Login feature

#Scenario: Verify login is successful with valid login credentials
#Given Login page is displayed
#When User enters valid username and password
#When User clicks login button
#Then User successfully logs in

#Scenario: Verify user adding product to cart is successful
#Given User is logged in
#When User adds a product to cart
#Then Cart contains the same product added to cart

Scenario: Verify deleted item is actually deleted from cart and total amount is updated
Given User is logged in
When User adds multiple products to cart
When User removes one product from cart
Then Cart is updated with items as well as total amount

#Scenario: Verify updated quantity also updates the product specific total and grand total
#Given User is logged in
#When User adds a product to cart and updates quantity
#Then Cart gets updated with the product specific total and grand total

#Scenario: After placing order verify the order number is displayed correctly in the My Account - Orders section
#Given User is logged in
#When User adds a product to cart
#When User confirms the order
#Then Order places successfully and My Account - Order contains the order number