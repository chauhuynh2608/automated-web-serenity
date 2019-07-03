package com.chauhuynh.autoweb.infor;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class BasePageWebDriver {

	@Managed
	public WebDriver driver;

	@Before
	public void setup() {
		driver.get("http://todomvc.com/examples/angularjs/#/");
	}

	@After
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
