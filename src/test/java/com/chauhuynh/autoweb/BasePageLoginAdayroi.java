package com.chauhuynh.autoweb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

@RunWith(SerenityRunner.class)
public class BasePageLoginAdayroi {
	@Managed
	public WebDriver driver;
	
	
	private static String baseUrl;
	EnvironmentVariables variables;
	@Before
	public void setup() {

		variables = SystemEnvironmentVariables.createEnvironmentVariables();
		baseUrl = variables.getProperty(ThucydidesSystemProperty.WEBDRIVER_BASE_URL);
		//The implicit wait(7)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Maximizes the browser window(5)
		driver.manage().window().maximize();
		//get value properties ở file serenity(6)
		driver.get(baseUrl);
	}
	public void scrolDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,1000)");
	}
	public void goBack() {
		driver.navigate().back();
	}
	public void goForward() {
		driver.navigate().forward();
	}

	public WebElement findByXpath(String xpathValue) {
		return find(By.xpath(xpathValue));
	}
	public WebElement find(By by) {
		return driver.findElement(by);
	}
	public WebElement findByCSS(String css) {
		return find(By.cssSelector(css));
	}
	public void mouseHover(String css) {
		Actions action = new Actions(driver);
		action.moveToElement(findByCSS(css)).build().perform();
	}
	public void clickOnElementfindByCSS(String css) {
		findByCSS(css).click();
	}
	
	public void typeTextByCSS(String css, String value) {
		findByCSS(css).sendKeys(value);
	}
	public String getTextCss(String cssValue) {
		return findByCSS(cssValue).getText();
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	//wait until an element is present
	public void waitForTextPresent(String locator, String text, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.textToBePresentInElement(findByCSS(locator), text));
	}
	
	@After
	public void afterTest() {
		driver.quit();
	}		
	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
