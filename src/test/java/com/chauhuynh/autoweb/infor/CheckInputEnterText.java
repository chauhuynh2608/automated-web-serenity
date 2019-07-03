
package com.chauhuynh.autoweb.infor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import net.serenitybdd.junit.runners.SerenityRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SerenityRunner.class)
public class CheckInputEnterText extends BasePageWebDriver {

	@Test
	public void checkInputEnterText() {
		WebElement inputEnterText = driver.findElement(By.cssSelector(".new-todo"));
		inputEnterText.sendKeys("I am the one", Keys.ENTER);
		WebElement inputafterEnterText = driver.findElement(By.xpath("//ul/li//label"));
		String expected = inputafterEnterText.getText();
		assertEquals("I am the one", expected);
	}
}