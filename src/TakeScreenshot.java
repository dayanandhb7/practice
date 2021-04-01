import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenshot {


	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.quora.com/");

		//Convert webdriver to TakeScreenshot
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(scr , new File("C:\\Screenshots\\screenshot2.png"));
		
		
	}

	

	

}
