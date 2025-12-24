Feature: user login swaglabs

Background:
Given user navigating to swaglabs page
When user entered valid username "standard_user" and password "secret_sauce"
And  user click on login button




Scenario: checkout  Product in swaglabs
When user extract full name of the product
Then  user click on required product
Then user click on Add to Cart in swaglabs
And user click on cart icon
Then user validate product name with Allproducts page matches with cart page
And user click on checkout
When user entered firstname "lakshmi" and lastname "golla" and postal code "500098"
And  user click on continue button
Then user validate product price with All product page matches with cart page
And  user click on Finish button
Then user ordered product in swaglabs successfully
