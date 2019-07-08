package com.chauhuynh.autoweb.infor;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import com.chauhuynh.autoweb.BasePageWebDriver;

public class LearnAboutTheApplication extends BasePageWebDriver {

	@Test
	public void checkCompareTitle() {
		String acutalPageTitle = driver.getTitle();
		String expectedPageTitle = "AngularJS • TodoMVC";
		Assert.assertEquals(acutalPageTitle, expectedPageTitle);
	}

	@Test
	public void checkHeading() {
		String heading = find(By.tagName("h1")).getText();
		String expectedheading = "todos";
		Assert.assertEquals(heading, expectedheading);
	}

	@Test
	public void checkFooter() {
		String footer = find(By.xpath("//footer/p[contains(text(),'Credits')]")).getText();
		String expectedfooter = "Credits: Christoph Burgdorf, Eric Bidelman, Jacob Mumm and Igor Minar";
		Assert.assertEquals(footer, expectedfooter);
	}

	@Test
	public void checkFooter1() {
		String footer = find(By.xpath("//footer/p[2]")).getText();
		Assert.assertTrue(footer.contains("Credits"));
	}
}
