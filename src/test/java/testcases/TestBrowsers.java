package testcases;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestBrowsers {

	@Test(groups = "functional")
	public void testCase1() {
		
		//Selenium 4 changes
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.get("http://way2automation.com");
		
		 System.out.println("Actual Test");
			/*
			 * //implicit wait
			 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); WebElement
			 * e= driver.findElement(By.id("")); //Explicit wait WebDriverWait wait= new
			 * WebDriverWait(driver, Duration.ofSeconds(5));
			 * wait.until(ExpectedConditions.elementToBeClickable(e)).sendKeys("");
			 * 
			 * //Fluent wait
			 * 
			 * Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
			 * .withTimeout(Duration.ofSeconds(30)) .pollingEvery(Duration.ofSeconds(5))
			 * .withMessage("Time out as the condition is not met")
			 * .ignoring(NoSuchElementException.class);
			 * 
			 * wait1.until(ExpectedConditions.elementToBeClickable(e)).sendKeys("");
			 */
		 
		

	}
	
	@Test(priority = 1, groups = {"functional","smoke"})
	
	public void secondTest()
	{
		System.out.println("Second Test");
	}

	@Test(priority = 1, groups = {"functional"})
	
	public void thirdTest()
	{
		System.out.println("Third Test");
	}
	
	@Test(priority = 1, groups = {"smoke"})
	
	public void fourthTest()
	{
		System.out.println("Fourth Test");
	}
	
	
}
