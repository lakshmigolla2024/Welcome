package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	public WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	By productName=By.id("item_4_title_link");
	By checkOut=By.id("checkout");
	By firstName=By.id("first-name");
	By lastName=By.id("last-name");
	By postalCode=By.id("postal-code");
	By Continue=By.id("continue");
	By productPrice=By.xpath("//div[@class='summary_subtotal_label']");
	By Finish=By.id("finish");
	By confirmationMsg=By.xpath("//h2[@data-test='complete-header']");
	
	public String getProductName() {
		return this.driver.findElement(productName).getText();
	}
	public void CheckOut() {
		this.driver.findElement(checkOut).click();
	}
	public void FistName(String firstname) {
		this.driver.findElement(firstName).sendKeys(firstname);
	}
	public void LastName(String lastname) {
		this.driver.findElement(lastName).sendKeys(lastname);
	}
	public void PostalCode(String postalcode) {
		this.driver.findElement(postalCode).sendKeys(postalcode);
	}
	public void Continue() {
		this.driver.findElement(Continue).click();
	}
	public String getProductPrice() {
		return this.driver.findElement(productPrice).getText();
	}
	public void Finish() {
		this.driver.findElement(Finish).click();
	}
	public String getConfirmationMsg() {
		return this. driver.findElement(confirmationMsg).getText();
	}
}
