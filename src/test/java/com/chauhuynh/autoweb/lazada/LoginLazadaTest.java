package com.chauhuynh.autoweb.lazada;

import org.junit.Test;

import com.chauhuynh.autoweb.BasePageWebDriver;

public class LoginLazadaTest extends BasePageWebDriver{
@Test
public void user_login_system_Lazada() {
	mouseHoverLazada("div a[class= 'grey']");
	sleep(1);
	clickOnElementByID("anonLogin");
	typeTextByCSS("div.mod-input-loginName input", "ctthuynh26@gmail.com");
	typeTextByCSS("div.mod-input-password input", "270776*nnD");
	//clickAndHold(".//*[@id='nc_2__bg']");
	//mouseAct(".//*[@id='nc_2_n1z']");
	clickOnElementfindByCSS("a[class=grey]");
	}
}
