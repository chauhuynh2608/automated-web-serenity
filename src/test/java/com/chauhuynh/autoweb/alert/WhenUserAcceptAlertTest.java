package com.chauhuynh.autoweb.alert;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.chauhuynh.autoweb.BasePageWebDriver;

public class WhenUserAcceptAlertTest extends BasePageWebDriver {

	@Test
	public void user_accept_alert_popup() {
		clickOnElementByXpath("//a[@title='Change Orientation']");
		switchToFrame("iframeResult");

		sleep(3);
		clickOnElementByXpath("//button[text()='Try it']");
		sleep(3);
		acceptAlertPopUp();

		switchToOriginalFrame();

		clickOnElementByXpath("//a[@title='Change Orientation']");

		sleep(3);
	}

}
