package SeleniumFirstTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	
	private WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.out.println("Chrome driver is initiated");
		System.setProperty("webdriver.chrome.driver", "/Users/prabuselvan/Downloads/chromedriver 5");
		driver = new ChromeDriver();
	}
	
	@Test
	public void firstTestCase() {
	
		driver.get("https://testautomationu.applitools.com/");
		System.out.println("Launched the browser");
		String title = driver.getTitle();
		Assert.assertEquals("Test Automation University | Applitools",title);
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
		System.out.println("Successfully closed the browser");
	}
}
