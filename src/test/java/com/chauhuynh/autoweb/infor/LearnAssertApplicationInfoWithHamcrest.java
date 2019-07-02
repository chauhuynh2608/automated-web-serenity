package com.chauhuynh.autoweb.infor;

import org.junit.Test;
import org.openqa.selenium.By;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;

public class LearnAssertApplicationInfoWithHamcrest extends BasePageWebDriver {

	@Test
	public void checkCompareTitle() {
		String acutalPageTitle = driver.getTitle();
		String expectedPageTitle = "AngularJS • TodoMVC";
		assertThat(acutalPageTitle, is(expectedPageTitle));
	}

	@Test
	public void checkHeading() {
		String heading = driver.findElement(By.tagName("h1")).getText();
		String expectedheading = "todos";
		assertThat(heading, is(expectedheading));
	}

	@Test
	public void checkFooter() {
		String footer = driver.findElement(By.xpath("//footer/p[2]")).getText();
		assertThat(footer, containsString("Credits"));
	}

	@Test
	public void checkInputField() {

		String inputField = driver.findElement(By.tagName("input")).getAttribute("placeholder");
		assertThat(inputField, containsString("What needs to be done?"));
	}
}
