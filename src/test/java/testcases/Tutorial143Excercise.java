package testcases;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Tutorial143Excercise {
	
	public static void  main(String[] args) {
		
		  ChromeOptions ops= new ChromeOptions();
		  ops.addArguments("--disable-notifications");
		 
		
		WebDriver driver= new ChromeDriver(ops);
		driver.get("https://www.cleartrip.com");
		

		
		
	}

}
