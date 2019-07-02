package com.chauhuynh.autoweb.infor;

import org.junit.Test;
import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;

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

}
