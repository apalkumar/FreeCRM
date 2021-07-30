import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;


public class particularlementScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserexecutablePath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
	        
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		// Convert the screenshot into BufferedImage
        BufferedImage fullScreen = ImageIO.read(srcFile);
        
        //Find location of the webelement logo on the page
        org.openqa.selenium.Point location = logo.getLocation();
        
        //Find width and height of the located element logo
        int width = logo.getSize().getWidth();
        int height = logo.getSize().getHeight();
        
      //cropping the full image to get only the logo screenshot
        BufferedImage logoImage = fullScreen.getSubimage(location.getX(), location.getY(),
                width, height);
        ImageIO.write(logoImage, "png", srcFile);
	        
		
		try {
			FileUtils.copyFile(srcFile, new File("E:\\ScreenShotCapture\\CroppedScreenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
//		driver.close();

	}

}
