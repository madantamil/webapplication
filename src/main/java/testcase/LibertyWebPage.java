package testcase;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LibertyWebPage {
	

	@Test
	public void execute() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
	WebDriver	driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.close();

	}

}
