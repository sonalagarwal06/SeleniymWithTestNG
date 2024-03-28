package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tutorial127FullPageScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		if (driver instanceof FirefoxDriver) {

			// Full Page
			File fullPage = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fullPage, new File("./screenshot/fullpage.jpg"));

		} else if (driver instanceof ChromeDriver) {

			File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(pageScreenshot, new File("./screenshot/page.jpg"));

		}

	}

}
