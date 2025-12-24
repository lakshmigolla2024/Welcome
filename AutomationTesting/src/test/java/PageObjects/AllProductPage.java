package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllProductPage {
public  WebDriver driver;

public AllProductPage(WebDriver driver) {
	this.driver=driver;
	}
By productname=By.id("item_4_title_link");
By addtocart=By.id("add-to-cart");
By cartlist=By.id("shopping_cart_container");
By price=By.xpath("(//div[@data-test='inventory-item-price'])[1]");

public void ClickProductName() {
	this.driver.findElement(productname).click();
}
public String getProductName() {
	return this.driver.findElement(productname).getText();
}
public void ClickAddtoCart() {
	this.driver.findElement(addtocart).click();
}
public void ClickCartlist() {
	this.driver.findElement(cartlist).click();
}
public String PriceofProduct() {
	return this.driver.findElement(price).getText();
}
}
