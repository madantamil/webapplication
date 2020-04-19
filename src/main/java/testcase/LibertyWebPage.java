package testcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibertyWebPage {
	 @Test
	    public void testBrowser() {
	        WebDriver driver;
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();        
	        driver.get("https://google.com");
	        String title = driver.getTitle();
	        System.out.println(title);      
	        driver.quit();      
	    }
		}



