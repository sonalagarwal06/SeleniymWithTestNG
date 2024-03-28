package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial147ExceciseFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.paytm.com/ ");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// oauth-iframe
		WebElement column = driver.findElement(By.xpath("//div[@class='_1YPz_']"));
		System.out.println("Column found");
		System.out.println("Click on the link");
		column.click();
		Thread.sleep(5000);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);

		System.out.println(driver.findElements(By.tagName("iframe")).size());

		driver.switchTo().frame(0);

		
		  WebElement privacy=driver.findElement(By.xpath("//div[@class='_1GUnr3lkQq1DIrgXMpn4d3 x-applink-footer-desc']"));
		  System.out.println(privacy.getText()); System.out.println("Read the text");
		  
		  driver.findElement(By.xpath("(//div[@class='_3NG4-yOlawf2yCGLW1iqWa'])[1]/span")).click();
		 
		// privacy.click();

	}

}
