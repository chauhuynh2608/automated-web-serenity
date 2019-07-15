package com.chauhuynh.autoweb.adayroi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.chauhuynh.autoweb.BasePageLoginAdayroi;

public class LoginAdayroiTest extends BasePageLoginAdayroi {

	@Test
	public void user_login_system_Adayroi() {
		// move the mouse cursor to the of the web element(8)
		mouseHover("li.header--user-group a");
		sleep(3);
		clickOnElementfindByCSS(".dropdown-menu button.js-sign-in__popup");
		typeTextByCSS("input#j_username", "ctthuynh2608@gmail.com");
		typeTextByCSS("input#j_password", "270776*nnD");
		clickOnElementfindByCSS("button.js-login-btn");
		// (12)
		refresh();
		sleep(10);
		// (13)
		scrolDown();
	}
	@Test
	public void login_fail_null_username_Adayroi() {
		mouseHover("li.header--user-group a");
		sleep(3);
		clickOnElementfindByCSS(".dropdown-menu button.js-sign-in__popup");
		typeTextByCSS("input#j_password", "270776*nnD");
		clickOnElementfindByCSS("button.js-login-btn");
		// wait until an element is present(9)
		waitForTextPresent(".form-group p", "Quý khách vui lòng không để trống địa chỉ email / Số điện thoại", 10);
		String errMsg = getTextCss(".form-group p");
		assertThat(errMsg).isEqualTo("Quý khách vui lòng không để trống địa chỉ email / Số điện thoại");
	}

	@Test
	public void use_login_fail_password_Adayroi() {
		mouseHover("li.header--user-group a");
		sleep(3);
		clickOnElementfindByCSS(".dropdown-menu button.js-sign-in__popup");
		typeTextByCSS("input#j_username", "ctthuynh2608@gmail.com");
		typeTextByCSS("input#j_password", "270776*nn");
		clickOnElementfindByCSS("button.js-login-btn");
		waitForTextPresent("div span[class='js-login-global-msg']",
				"Email/Số điện thoại/Thẻ VinID hoặc mật khẩu không chính xác!", 10);
		String errMsg = getTextCss("div span[class='js-login-global-msg']");
		assertThat(errMsg).isEqualTo("Email/Số điện thoại/Thẻ VinID hoặc mật khẩu không chính xác!");
	}

	@Test
	public void login_fail_null_password_Adayroi() {
		mouseHover("li.header--user-group a");
		sleep(3);
		clickOnElementfindByCSS(".dropdown-menu button.js-sign-in__popup");
		typeTextByCSS("input#j_username", "ctthuynh2608@gmail.com");
		clickOnElementfindByCSS("button.js-login-btn");
		waitForTextPresent("p.js-login-pwd-msg", "Mật khẩu ít nhất từ 6 ký tự, phải chứa cả số và chữ!", 10);
		String errMsg = getTextCss("p.js-login-pwd-msg");
		assertThat(errMsg).isEqualTo("Mật khẩu ít nhất từ 6 ký tự, phải chứa cả số và chữ!");
	}

}
