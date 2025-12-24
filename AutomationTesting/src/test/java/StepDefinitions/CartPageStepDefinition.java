package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilites.TextContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPageStepDefinition {
	String cartPageproductName;
	public TextContext session;
	public CartPageStepDefinition(TextContext textContext) {
		this.session=textContext;
	}

	@Then("user validate product name with Allproducts page matches with cart page")
	public void user_validate_product_name_with_allproducts_page_matches_with_cart_page() {
		//this.session.utilities.Movetoanotherwindow();
		 cartPageproductName=this.session.pageObjectManager.CartPage(this.session.testBase.driver).getProductName();
		 Assert.assertEquals(this.session.requiredProductName, cartPageproductName);
		 System.out.println("product name is verified");
	}

	@Then("user click on checkout")
	public void user_click_on_checkout() {
	    this.session.pageObjectManager.CartPage(this.session.testBase.driver).CheckOut();
	}

	@When("user entered firstname {string} and lastname {string} and postal code {string}")
	public void user_entered_firstname_and_lastname_and_postal_code(String string, String string2, String string3) {
	   this.session.pageObjectManager.CartPage(this.session.testBase.driver).FistName("lakshmi");
	   this.session.pageObjectManager.CartPage(this.session.testBase.driver).LastName("golla");
	   this.session.pageObjectManager.CartPage(this.session.testBase.driver).PostalCode("500098");
	}

	@When("user click on continue button")
	public void user_click_on_continue_button() {
	    this.session.pageObjectManager.CartPage(this.session.testBase.driver).Continue();
	}

	@Then("user validate product price with All product page matches with cart page")
	public void user_validate_product_price_with_all_product_page_matches_with_cart_page() {
	   this.session.requiredProductPrice=this.session.pageObjectManager.AllProductPage(this.session.testBase.driver).PriceofProduct();
	   this.session.requiredProductCartPrice=this.session.pageObjectManager.CartPage(this.session.testBase.driver).getProductPrice();
		Assert.assertEquals(this.session.requiredProductPrice, this.session.requiredProductPrice);
		System.out.println("Price name is verified");
	}

	@Then("user click on Finish button")
	public void user_click_on_finish_button() {
	    this.session.pageObjectManager.CartPage(this.session.testBase.driver).Finish();
	}

	@Then("user ordered product in swaglabs successfully")
	public void user_ordered_product_in_swaglabs_successfully() {
	   this.session.pageObjectManager.CartPage(this.session.testBase.driver).getConfirmationMsg(); 
	   
	  
	}
}
