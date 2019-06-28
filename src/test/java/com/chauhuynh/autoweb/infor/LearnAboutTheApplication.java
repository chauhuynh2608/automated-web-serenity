package com.chauhuynh.autoweb.infor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LearnAboutTheApplication {

	@Managed
	public WebDriver driver;

	@Before
	public void setup() {
		driver.get("http://todomvc.com/examples/angularjs/#/");
	}

	@Test
	public void checkCompareTitle() {
		String acutalPageTitle = driver.getTitle();
		String expectedPageTitle = "AngularJS • TodoMVC";
		Assert.assertEquals(acutalPageTitle, expectedPageTitle);
	}

	@Test
	public void checkHeading() {
		String heading = driver.findElement(By.tagName("h1")).getText();
		String expectedheading = "todos";
		Assert.assertEquals(heading, expectedheading);
	}

	@Test
	public void checkFooter() {
		String footer = driver.findElement(By.xpath("//footer/p[contains(text(),'Credits')]")).getText();
		String expectedfooter = "Credits: Christoph Burgdorf, Eric Bidelman, Jacob Mumm and Igor Minar";
		Assert.assertEquals(footer, expectedfooter);
	}

	@Test
	public void checkFooter1() {
		String footer = driver.findElement(By.xpath("//footer/p[2]")).getText();
		Assert.assertTrue(footer.contains("Credits"));
	}
}
