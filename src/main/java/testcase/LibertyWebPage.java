package testcase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriverService;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibertyWebPage {
	
	private static ChromeDriverService service;
	  private WebDriver driver;

	  @BeforeClass
	  public static void createAndStartService() throws IOException {
	    service = new ChromeDriverService.Builder()
	        .usingDriverExecutable(new File("./chromedriver"))
	        .usingAnyFreePort()
	        .build();
	    service.start();
	  }

	  @AfterMethod
	  public static void createAndStopService() {
	    service.stop();
	  }

	  @BeforeMethod
	  public void createDriver() {
	    driver = new RemoteWebDriver(service.getUrl(),
	        DesiredCapabilities.chrome());
	  }

	  @AfterClass
	  public void quitDriver() {
	    driver.quit();
	  }

	  @Test
	  public void testGoogleSearch() throws InterruptedException {
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    WebElement searchBox = driver.findElement(By.name("q"));
	    searchBox.sendKeys("webdriver");
	    Thread.sleep(2000);
	  }
	}



