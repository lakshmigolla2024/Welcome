package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
    public SwagLabsPage SwagLabsPage(WebDriver driver) {
    	SwagLabsPage swagLabsPage=new SwagLabsPage(driver);
    	return swagLabsPage;
    }
    
    public AllProductPage AllProductPage(WebDriver driver) {
		
    	AllProductPage allProductPage=new AllProductPage(driver);
    	return allProductPage;
    }
    
    public CartPage CartPage(WebDriver driver) {
		
    	CartPage cartPage=new CartPage(driver);
    	return cartPage;
    }
}
