package com.chauhuynh.autoweb.steps.serenity;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.annotations.Managed;

public class TestOpenWebTestMasTer {
	@Managed(driver = "chrome")
	public WebDriver driver;
	 @Test
	    public void testOpenWebTestmaster() {
		 System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();		
	        driver.get("http://testmaster.vn");
	        driver.quit();
	    }

}
