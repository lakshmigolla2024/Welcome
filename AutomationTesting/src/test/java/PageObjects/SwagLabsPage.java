package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabsPage {

	public WebDriver driver;
	public SwagLabsPage(WebDriver driver) {
		this.driver=driver;
	}
	     By username=By.id("user-name");
	     By password=By.id("password");
	     By login=By.id("login-button");
	     By productname=By.xpath("//span[@class='title']");
	
	public void SwagUsername(String nameofuser) {
		this.driver.findElement(username).sendKeys(nameofuser);
	}
	public void Swagpassword(String passwordofuser) {
		this.driver.findElement(password).sendKeys(passwordofuser);
	}
	public void loginbutton() {
		this.driver.findElement(login).click();
	}
	public String productdispaly() {
		return this.driver.findElement(productname).getText();
	}
}
	
