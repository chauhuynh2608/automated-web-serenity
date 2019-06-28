package com.chauhuynh.autoweb.infor;

import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LearnAssertApplicationInfoWithAssertJ {

	@Managed
	public WebDriver driver;

	@Before
	public void setup() {
		driver.get("http://todomvc.com/examples/angularjs/#/");
	}

	@Test
	public void checkCompareTitle() {
		String acutalPageTitle = driver.getTitle();
		assertThat(acutalPageTitle.contains(acutalPageTitle));
	}

	@Test
	public void checkHeading() {
		String heading = driver.findElement(By.tagName("h1")).getText();
		assertThat(heading.contains(heading));
	}

	@Test
	public void checkFooter() {
		String footer = driver.findElement(By.xpath("//footer/p[2]")).getText();
		assertThat(footer).contains("Credits");
	}

}
