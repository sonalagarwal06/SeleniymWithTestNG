package testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial142Excecise {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hollisterco.com/shop/wd");
		
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
		Set s=driver.getWindowHandles();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			driver.switchTo().window((String) i.next());
			System.out.println("The title of the tab is " + driver.getTitle());
		}


	}

}
