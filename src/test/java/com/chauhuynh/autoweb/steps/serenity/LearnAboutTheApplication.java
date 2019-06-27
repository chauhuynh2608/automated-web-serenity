package com.chauhuynh.autoweb.steps.serenity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LearnAboutTheApplication {

	@Managed(driver = "chrome")
	public WebDriver driver;

	 
	 
	@Test 
	public void checkCompareTitle() {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");		
		
		driver.get("http://todomvc.com/examples/angularjs/#/");
		
		String acutalPageTitle = driver.getTitle();
		
		String expectedPageTitle  = "AngularJS • TodoMVC";
		
		Assert.assertEquals(acutalPageTitle,expectedPageTitle);
	}
	
	@Test 
	public void checkHeading() {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		driver.get("http://todomvc.com/examples/angularjs/#/");
		
		String heading = driver.findElement(By.tagName("h1")).getText();
		
		String expectedheading  = "todos";
		
		Assert.assertEquals(heading,expectedheading);
	}	
   
	@Test
	public void checkFooter() {
	
	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");	
	driver.get("http://todomvc.com/examples/angularjs/#/");	
	String footer = driver.findElement(By.xpath("//footer/p[contains(text(),'Credits')]")).getText();
	String expectedfooter  = "Credits: Christoph Burgdorf, Eric Bidelman, Jacob Mumm and Igor Minar";
	Assert.assertEquals(footer,expectedfooter);
	
	}
	
	@Test
	public void checkFooter1() {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");	
		driver.get("http://todomvc.com/examples/angularjs/#/");	
		String footer = driver.findElement(By.xpath("//footer/p[2]")).getText();
		Assert.assertTrue(footer.contains("Credits"));
		}
}
