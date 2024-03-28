package testcases;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;;

public class TestMultipleElementsRelativeLocators {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sonal");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9765309674");
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sonal.fd@gmail.com");
		
		//finding email input box by using above locator
		
		driver.findElement(with(By.tagName("input")).above(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select"))).sendKeys("sonal.fd@gmail.com");
		driver.findElement(with(By.tagName("input")).below(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select"))).sendKeys("Farrukhabad");
		driver.findElement(with(By.tagName("input")).near(By.xpath("//input[@name='city']"))).sendKeys("sonalpkr");
		
		
		
		//driver.findElement(with(By.linkText("Signin")).toLeftOf(By.xpath("(//*[@id=\"load_form\"]/div[1]/div[2]/input)[2]"))).click();
		
		//chaining of locatorss
		
		driver.findElement(with(By.tagName("input"))
				.above(By.linkText("Signin"))
				.below(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")))
				.sendKeys("ksdfksfdsdf");
		//driver.quit();
		
		List<WebElement> list= driver.findElements(with(By.tagName("label")).below(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select")));
		System.out.println(list.size());
		for(WebElement e:list)
		{
			System.out.println(e.getText());
		}
		

	}

}
