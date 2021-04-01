package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void verifypageTitle(String browserName) {

		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Public\\webdrivers\\geckodriver.exe");

			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		 else if (browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\Public\\webdrivers\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
