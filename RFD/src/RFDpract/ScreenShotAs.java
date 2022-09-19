package RFDpract;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotAs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/take-screenshot-selenium-webdriver.html");
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement lt= driver.findElement(By.linkText("Must Learn"));
		//driver.
		/*
		 * File temp= ts.getScreenshotAs(OutputType.FILE); File dest= new
		 * File("./screen/pavan.png"); try { FileHandler.copy(temp, dest); } catch
		 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		File temp=lt.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screen/pavan1.png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		}

}
