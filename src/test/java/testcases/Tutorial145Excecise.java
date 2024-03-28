package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tutorial145Excecise {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.americangolf.co.uk");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		if (driver.findElement(By.xpath("//div[@class='EGn_M-close']")).isDisplayed()) {
			driver.findElement(By.xpath("//div[@class='EGn_M-close']")).click();
			System.out.println("Warning closed");
		}

		if (driver.findElement(By.xpath("//div[contains(@class,'termly-styles-buttons')]/button[2]")).isDisplayed()) {
			driver.findElement(By.xpath("//div[contains(@class,'termly-styles-buttons')]/button[2]")).click();
			System.out.println("Cookies  closed");
		}

		if (driver.findElement(By.xpath("//div[@class='EGn_M-close']")).isDisplayed()) {
			driver.findElement(By.xpath("//div[@class='EGn_M-close']")).click();
			System.out.println("Warning closed by the second loop");

		}

		WebElement column = driver.findElement(By.xpath("(//a[@class='a-level-1'])[4]"));

		System.out.println("Element found" + column.getText());

		//column.click();

		
		/*
		 * WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));
		 * w.until(ExpectedConditions.elementToBeClickable(column));
		 */
		  
		  
		  Actions a= new Actions(driver); 
		  a.moveToElement(column).build().perform();
		  
			/*
			 * driver.findElement(By.
			 * xpath("//div[@id='CLUBS_1']//ul[@class='category-group-block ul-level-2 toggle-content expanded']/li[2]"
			 * )).click();
			 * 
			 * 
			 * WebElement grid =
			 * driver.findElement(By.xpath("//div[@class='grid-row cat-teaser-row']"));
			 * grid.findElement(By.xpath("//span[contains(text(),'Drivers')]")).click();
			 */

	}

}
