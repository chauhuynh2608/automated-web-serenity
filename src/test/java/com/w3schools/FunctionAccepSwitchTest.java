package com.w3schools;

import com.chauhuynh.autoweb.BasePageWebDriver;
import org.junit.Test;
import com.chauhuynh.autoweb.BasePageWebDriver;
public class FunctionAccepSwitchTest extends BasePageWebDriver{
	public void function_accep_swith() {
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
