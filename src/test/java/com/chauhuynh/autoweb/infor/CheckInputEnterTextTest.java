
package com.chauhuynh.autoweb.infor;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.chauhuynh.autoweb.BasePageWebDriver;

public class CheckInputEnterTextTest extends BasePageWebDriver {

	@Test
	public void checkInputEnterText() {
		typeAndEnter(".new-todo", "I am the one");
		String expected = findByXpath("//ul/li//label").getText();
		assertThat("I am the one").contains(expected);
	}
}