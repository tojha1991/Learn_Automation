#Feature: Purchase the added cart item
#
#Background: Common login Steps
#
    #Given User Launch Chrome Browser 
    #When User opens url "https://demoblaze.com/"
    #And User clicks on login link
    #And  User enter Email as "auto_01" and Password as "P@ssword@123"
    #And  Click on Login button
    #Then User is able to see loggedin users name
#
#Scenario: Add item into the cart
#
#Given User Selects any product from Product catalogue page 
#When User navigated to Product details page
#And User clicks on Add to cart button
#And User clicks on Ok button for product added confirmation
#And User clicks on Cart link
#Then User is able to see same Product on Cart page
#
#Scenario: Purchase order
#
#Given User clicks on Add to cart button
#And User views the Purchase order form
#And user enter Customers name 
#And user enters Country name 
#And User enters City name
#And User enters Credit card number
#And User enters Month
#And User enters Year
#Then User clicks on Purchase button
#And user views the Order Confirmation screen
#
#
#
