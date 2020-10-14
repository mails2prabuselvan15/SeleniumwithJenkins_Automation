package SeleniumFirstTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	
	public WebDriver driver;

	@BeforeTest
	public void beforeTest() {
//		System.out.println("Chrome driver is initiated");
		System.setProperty("webdriver.chrome.driver", "/Users/prabuselvan/Downloads/chromedriver 5");
		driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "/Users/prabuselvan/Downloads/geckodriver");
//		driver = new FirefoxDriver();
	}
	
//	@Test
//	public void ChromeCase() {
//
//	
//		driver.get("https://testautomationu.applitools.com/");
//		System.out.println("Launched the browser");
//		String title = driver.getTitle();
//		Assert.assertEquals("Test Automation University | Applitools",title);
//	}
	
//	@Test
//	public void Test1() {
//
//		driver.get("https://testautomationu.applitools.com/");
//		System.out.println("Launched the browser");
//		String title = driver.getTitle();
//		Assert.assertEquals("Test Automation University | Applitools",title);
//		
//	}
	
	@Test
	public void Test1() {
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@Test
	public void Test2() {
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test
	public void Test3() {
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
		System.out.println("Successfully closed the browser");
	}
}
