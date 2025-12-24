package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Utilites.TextContext;


public class Hook {

	public TextContext session;
	public Hook(TextContext textContext) {
		this.session=textContext;
	}
	
	public void CloseBrowser() throws IOException {
		this.session.testBase.Drivermaintance().quit();
	}
	
	
}
