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
public class CheckHeading {
	@Managed(driver = "chrome")
	public WebDriver driver;
	@Test 
	public void checkHeading() {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		WebDriver chrome = new ChromeDriver();
		
		driver.get("http://todomvc.com/examples/angularjs/#/");
		
		String heading = driver.findElement(By.tagName("h1")).getText();
		
		String expectedheading  = "todos";
		
		Assert.assertEquals(heading,expectedheading);
	}

	@Test 
	public void checkCompareTitle() {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		WebDriver chrome = new ChromeDriver();
		
		driver.get("http://todomvc.com/examples/angularjs/#/");
		
		String acutalPageTitle = driver.getTitle();
		
		String expectedPageTitle  = "AngularJS • TodoMVC";
		
		Assert.assertEquals(acutalPageTitle,expectedPageTitle);
	}
}
