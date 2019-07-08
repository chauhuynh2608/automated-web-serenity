package com.chauhuynh.autoweb.tiki;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.chauhuynh.autoweb.BasePageWebDriver;

public class WhenUserScrollDownTikiTest extends BasePageWebDriver {

	@Test
	public void user_login_system_tiki() {

		scrolDown();
		sleep(3);
		// https://www.guru99.com/scroll-up-down-selenium-webdriver.html
	}

}
