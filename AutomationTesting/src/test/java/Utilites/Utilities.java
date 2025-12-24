package Utilites;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	public WebDriver driver;
	
	public Utilities(WebDriver driver) {
		this.driver=driver;
	}

	public void Movetoanotherwindow() {
		List<String> list=new ArrayList<String>(this.driver.getWindowHandles());
		this.driver.switchTo().window(list.get(1));
	}
	/*
	 * public void ExplicitWait() { WebDriverWait wait=new
	 * WebDriverWait(driver,Duration.ofSeconds(10)); WebElement
	 * searchResult=wait.until(ExpectedConditions.visibilityOfElementLocated(this.
	 * driver.findElement(By.id("item_4_title_link")))); }
	 */
}
