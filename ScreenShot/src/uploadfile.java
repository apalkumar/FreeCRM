import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadfile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		
		String CSVFile = "C:\\D\\Projects\\file.csv";
		WebElement fileElement=driver.findElement(By.xpath("//[text()='fileElement']"));
		WebDriverWait wait = new WebDriverWait (driver, 15);
		            wait.until(ExpectedConditions.elementToBeClickable(fileElement ));
		            fileElement .click();

		            StringSelection ss = new StringSelection(CSVFile);
		            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		            //native key strokes for CTRL, V and ENTER keys
		            Robot robot = new Robot();

		            robot.keyPress(KeyEvent.VK_CONTROL);
		            robot.keyPress(KeyEvent.VK_V);
		            robot.keyRelease(KeyEvent.VK_V);
		            robot.keyRelease(KeyEvent.VK_CONTROL);
		            robot.keyPress(KeyEvent.VK_ENTER);
		            robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
