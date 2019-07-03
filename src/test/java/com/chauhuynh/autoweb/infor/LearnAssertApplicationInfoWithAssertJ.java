package com.chauhuynh.autoweb.infor;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class LearnAssertApplicationInfoWithAssertJ extends BasePageWebDriver {

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

	@Test
	public void checkInputEnterText() {
		WebElement inputEnterText = driver.findElement(By.cssSelector(".new-todo"));
		inputEnterText.sendKeys("I am the one", Keys.ENTER);
		WebElement inputafterEnterText = driver.findElement(By.xpath("//ul/li//label"));
		String expected = inputafterEnterText.getText();
		assertThat("I am the one", containsString(expected));
	}

}
