package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibertyWebPage {
	public RemoteWebDriver driver;

	@Test
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		 System.out.println("Success - pipeline 1 multi pipeline - job 1 - WEBAPPLICATION REPO");
		System.out.println("LibertyWebPage - MadanTamil credential");
		
		//

	}
		}



