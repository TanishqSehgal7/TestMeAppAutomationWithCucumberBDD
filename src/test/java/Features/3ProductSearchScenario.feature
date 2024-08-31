@SearchProduct
Feature: Product Search

In order to search a product in TestMeApp type minimum 
four character in the search box to display all the products
matching the keyword

After 4 products are typed, appropriate products should be displayed.

Scenario: Where the user enters atleast 4 characters to search for available products and appropriate products show up

Given: Joe is a registered user for TestMeApp
When Joe searches for head phone by the key "Head"
And Clicks the Find button
Then Appropriate products appear on the screen from all brands.


// add to cart feature
Scenario: The one where the user moves to the cart without adding any item in it
Given Joe is a registered user in testmeapp
When Joe searches a headphone
And Add it to the cart
And Checkout for payment
And fills transaction details 
Then Product is successfully ordered