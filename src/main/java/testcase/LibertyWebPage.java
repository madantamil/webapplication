package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibertyWebPage {
	 @Test
	    public void testBrowser() {
	        WebDriver driver;
	     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
	        driver = new ChromeDriver();        
	        driver.get("https://google.com");
	        String title = driver.getTitle();
	        System.out.println(title);    
	        System.out.println("successfully");
	        driver.quit();      
	    }
		}



