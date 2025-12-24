package StepDefinitions;

import Utilites.TextContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllProductStepDefinition {
	
public TextContext session;

public AllProductStepDefinition(TextContext textContext) {
	this.session=textContext;
}

@Then("user click on required product")
public void user_click_on_required_product() throws InterruptedException {
	Thread.sleep(5000);
          this.session.pageObjectManager.AllProductPage(this.session.testBase.driver).ClickProductName();
}

@Then("user click on Add to Cart in swaglabs")
public void user_click_on_add_to_cart_in_swaglabs() {
    this.session.pageObjectManager.AllProductPage(this.session.testBase.driver).ClickAddtoCart();
}

@Then("user click on cart icon")
public void user_click_on_cart_icon() {
	this.session.pageObjectManager.AllProductPage(this.session.testBase.driver).ClickCartlist();
}

@When("user extract full name of the product")
public void user_extract_full_name_of_the_product() {
	this.session.requiredProductName=this.session.pageObjectManager.AllProductPage(this.session.testBase.driver).getProductName();
}





}
