package testcases;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Tutorial146ExceciseScreenshot {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hollisterco.com/shop/wd");
		
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement column=driver.findElement(By.cssSelector(".footer_info-links-child > ul"));
		System.out.println("Column found");
		List<WebElement> links = column.findElements(By.tagName("a"));
		System.out.println("The number of links in the column is" + links.size());
		for(WebElement e: links)
		{
			System.out.println(e.getText());
			e.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			System.out.println("The link clicked  is " + e.getText());
			
		}
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		src.renameTo(new File("C:\\Users\\91976\\eclipse-workspace\\SeleniumTesting\\resources\\screenshots\\image.jpg"));
	}

}
