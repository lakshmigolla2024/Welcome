package StepDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utilites.TestBase;
import Utilites.TextContext;
import io.cucumber.java.en.*;

public class SwaglabsStepDefinition {
	String pro="Products";
	public TextContext session;
	
	public SwaglabsStepDefinition(TextContext textContext) {
		
		this.session=textContext;
	}

	@Given("user navigating to swaglabs page")
	public void user_navigating_to_swaglabs_page() throws IOException {
	this.session.testBase.Drivermaintance();
	}
	
	@When("user entered valid username {string} and password {string}")
	public void user_entered_valid_username_standard_user_and_password(String string, String string1) {
	    //this.session.driver.findElement(By.id("user-name")).sendKeys("standard_user");
		this.session.pageObjectManager.SwagLabsPage(this.session.testBase.driver).SwagUsername("standard_user");
	    this.session.pageObjectManager.SwagLabsPage(this.session.testBase.driver).Swagpassword("secret_sauce");
	}
	
	@When("user click on login button")
	public void user_click_on_login_button() {
		this.session.pageObjectManager.SwagLabsPage(this.session.testBase.driver).loginbutton();
	}
	
	@Then("user logged swaglabs successfully")
	public void user_logged_swaglabs_successfully() {
		String Product=this.session.pageObjectManager.SwagLabsPage(this.session.testBase.driver).productdispaly();
	 Assert.assertEquals(Product, pro);
	    
	}

}
