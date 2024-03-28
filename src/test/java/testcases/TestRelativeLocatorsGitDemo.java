package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestRelativeLocatorsGitDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sonal");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9765309674");
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sonal.fd@gmail.com");
		
		//finding email input box by using above locator
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select"))).sendKeys("sonal.fd@gmail.com");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select"))).sendKeys("Farrukhabad");
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(By.xpath("//input[@name='city']"))).sendKeys("sonalpkr");
		
		driver.findElement(RelativeLocator.with(By.linkText("Signin")).toLeftOf(By.xpath("(//*[@id=\"load_form\"]/div[1]/div[2]/input)[2]"))).click();
		
		//chaining of locatorss
		
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.above(By.linkText("Signin"))
				.below(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")))
				.sendKeys("ksdfksfdsdf");
		//driver.quit();
		

	}

}
