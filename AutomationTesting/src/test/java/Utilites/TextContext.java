package Utilites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;
import PageObjects.SwagLabsPage;
import io.cucumber.messages.types.Hook;


public class TextContext {
	
	public WebDriver driver;
	public TestBase testBase;
	public Utilities utilities;
	public Hook hook;
	public PageObjectManager pageObjectManager;
	public String requiredProductName;
	public String requiredProductPrice;
	public String requiredProductCartPrice;
	
	
	public TextContext() throws IOException {
	  testBase=new TestBase();
	  pageObjectManager =new PageObjectManager(testBase.Drivermaintance());

	  utilities=new Utilities(testBase.Drivermaintance());
	  //Hook hook =new Hook(testBase.Drivermaintance());
		
	}

	

}
