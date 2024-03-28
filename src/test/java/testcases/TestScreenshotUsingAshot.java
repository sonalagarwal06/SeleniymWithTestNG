package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestScreenshotUsingAshot {

	public static void main(String[] args) throws IOException {


		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.way2automation.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//WebElement ele = driver.findElement(By.xpath("/html/body/div[4]/div/header/div[2]/div/div[1]"));
		
		//Full page screenshot
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
        //Element screenshot
		//Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,ele);
		ImageIO.write(screenshot.getImage(), "jpg", new File(".\\screenshot\\ashotimgelement.jpg"));
		
		System.out.println("completed");
		
		
		

	}

}
