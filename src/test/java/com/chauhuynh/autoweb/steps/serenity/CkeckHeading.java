package com.chauhuynh.autoweb.steps.serenity;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.annotations.Managed;

public class CkeckHeading {
	@Managed(driver = "chrome")
	public WebDriver driver;
	
	@Test 
	public void checkCompareHeading() {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		WebDriver chrome = new ChromeDriver();
		
		driver.get("http://todomvc.com/examples/angularjs/#/");
		
		//String heading = driver.findElement(By.xpath("//header[@name='header']")).getText();
		String heading = driver.findElement(By.tagName("h1")).getText();
		String expectedheading  = "todos";
		
		Assert.assertEquals(heading,expectedheading);
	}

}
