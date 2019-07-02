package com.chauhuynh.autoweb.infor;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class BasePageWebDriver {
	@Managed
	public WebDriver driver;
	

	public BasePageWebDriver() {
		super();
	}
	
	@BeforeTest
	 public void setUp(){		
		driver = new ChromeDriver();
		driver.get("http://todomvc.com/examples/angularjs/#/");
	}
	@Before
	public void setup() {
		driver.get("http://todomvc.com/examples/angularjs/#/");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
