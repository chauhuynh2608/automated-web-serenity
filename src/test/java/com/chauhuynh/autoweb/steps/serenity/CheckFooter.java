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
public class CheckFooter {
	@Managed(driver = "chrome")
	public WebDriver driver;
	@Test 
public void checkFooter() {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		WebDriver chrome = new ChromeDriver();
		
		driver.get("http://todomvc.com/examples/angularjs/#/");
		
		//String footer = driver.findElement(By.cssSelector("footer")).getText();
		//String footer = driver.findElement(By.xpath("//footer")).getText();
		String footer = driver.findElement(By.tagName("footer")).getText();
		//System.out.println(driver.getCurrentUrl());
		String expectedheading  = "[Double-click to edit a todo]";
		//driver.Entity.GetValue("footer");
		Assert.assertEquals(footer,expectedheading);
	}

}
