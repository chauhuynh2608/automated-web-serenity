package com.chauhuynh.autoweb.steps.serenity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class SearchingKeyWorkWithGoogle {

	@Managed(driver = "chrome")
	public WebDriver driver;

	@Test
	public void searchSeleniumTrainingCourse() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		//WebDriver chome = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Serenity Ensure – Fluent Assertions in Serenity Screenplay", Keys.ENTER);

		//chome.findElement(By.xpath("(//input[@value='Tìm với Google'])[2]")).click();

	}

	public void join_selenium_online_course() {

	}

}
