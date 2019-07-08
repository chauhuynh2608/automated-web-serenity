package com.chauhuynh.autoweb.tiki;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.chauhuynh.autoweb.BasePageWebDriver;

public class WhenUserLoginTikiTest extends BasePageWebDriver {

	@Test
	public void user_login_system_tiki() {

		mouseHover("//span[text()='Đăng nhập']");
		// waitForElementPresent("//button[text()='Đăng nhập']", 10);
		sleep(2);
		clickOnElementByXpath("//button[text()='Đăng nhập']");

		waitForElementPresent("onesignal-popover-cancel-button", 10);
		clickOnElementByID("onesignal-popover-cancel-button");
		typeTextByID("email", "chauhuynh@tiki.com");
		typeTextByID("password", "chauhuynh@tiki.com");

		clickOnElementByXpath("//button[text()='Đăng nhập' and starts-with(@class,'UserModalstyle')]");
		waitForTextPresent("//div[starts-with(@class,'InputError')]", "Thông tin đăng nhập không đúng", 10);

		String errMsg = getTextByXpath("//div[starts-with(@class,'InputError')]");

		assertThat(errMsg).isEqualTo("Thông tin đăng nhập không đúng");

		sleep(3);
	}

}
