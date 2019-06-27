package com.chauhuynh.autoweb.steps.serenity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LearnAssertApplicationInfoWithHamcrest {
	@Managed(driver = "chrome")
	public WebDriver driver;

	@Test
	public void checkCompareTitle() {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver.get("http://todomvc.com/examples/angularjs/#/");
		String acutalPageTitle = driver.getTitle();
		String expectedPageTitle = "AngularJS • TodoMVC";
		assertThat(acutalPageTitle, is(expectedPageTitle));
	}

	@Test
	public void checkFooter() {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver.get("http://todomvc.com/examples/angularjs/#/");
		String footer = driver.findElement(By.xpath("//footer/p[2]")).getText();
		assertThat(footer, containsString("Credits"));
	}

	@Test
	public void checkHeading() {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver.get("http://todomvc.com/examples/angularjs/#/");
		String heading = driver.findElement(By.tagName("h1")).getText();
		String expectedheading = "todos";
		assertThat(heading, is(expectedheading));
	}

}
