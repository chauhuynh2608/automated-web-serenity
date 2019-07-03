package com.chauhuynh.autoweb.infor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@RunWith(SerenityRunner.class)

public class CheckInputEnterText{
	@Managed
	public WebDriver driver;
	
	@Before
	public void setup() {
		driver.get("http://todomvc.com/examples/angularjs/#/");
	}
	@Test
	public void checkInputEnterText() {
		//Actions action = new Actions(this.driver);	
		WebElement inputEnterText = driver.findElement(By.xpath("//input[@ng-model='newTodo']"));
		inputEnterText.sendKeys("I am the one");
		inputEnterText.sendKeys(Keys.ENTER);
		String expected  = inputEnterText.getText(); 
		Assert.assertEquals(inputEnterText, expected);
	}
}
