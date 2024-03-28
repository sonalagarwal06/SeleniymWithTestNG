package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial149ExceciseAjax {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");
		
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//oauth-iframe
		WebElement leavingFrom=driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		System.out.println("Column found");
		
		leavingFrom.sendKeys("Beng");
		leavingFrom.sendKeys(Keys.DOWN);
		leavingFrom.sendKeys(Keys.DOWN);
		leavingFrom.sendKeys(Keys.DOWN);
		leavingFrom.sendKeys(Keys.DOWN);
		Thread.sleep(5000);
		leavingFrom.sendKeys(Keys.ENTER);
		//System.out.println(leavingFrom.getText());
		System.out.println("Click on the link");
		
	}

}
