package AllureReporting.AllureReporting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG {
	
	WebDriver driver;
	
	@Test
	public void setup() {
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserexecutablePath\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();
	}
	
	
//	@Test(priority=1)
//	public void logopresence() {
//		boolean logostaatus = driver.findElement(By.xpath("//div[@class='header-logo']")).isDisplayed();
//		assert logostaatus;
//		
//	}

	
//	@Test(priority=2)
//	public void loginTest() {
//		
//	}
//
//	
//	@Test(priority=3)
//	public void registrationTest() {
//		
//	}
//	
//	
//	public void tearDown() {
//		
//	}

	
}
