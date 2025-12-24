package Utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver Drivermaintance() throws IOException {
		/*
		 * FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+
		 * "/AutomationTesting/src/GlobalProperties"); Properties prop=new Properties();
		 * prop.load(fis);
		 */
		String browser="chrome";
		String url="https://www.saucedemo.com/";
		if(driver==null) {
			if(browser.equals("chrome")) {
				 driver=new ChromeDriver();
				
			}
			else if(browser.equals("firefox")){
				 driver=new FirefoxDriver();
				
			}
            else if(browser.equals("edge")){
            	 driver=new EdgeDriver();
				
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get(url);
			}
		return driver;
		}
		
	}
	

