package com.chauhuynh.autoweb.steps.serenity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class SearchFindElementBy {
	
	@Managed(driver = "chrome")
	public WebDriver driver;
	
	@Test 
	public void open_web_lement_by() {
	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.name("q")).sendKeys("AngularJS • TodoMVC", Keys.ENTER); 
	
	driver.findElement(By.partialLinkText("AngularJS • TodoMVC - Home")).click();
    driver.quit();
	
	}

	
}
