package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemo {
	
	@Test
	public void login() {
		
		System.out.println("Login test");
		Assert.fail("Failing the test deliberately");
	}

}
