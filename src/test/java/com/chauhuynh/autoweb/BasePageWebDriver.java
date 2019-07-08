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
public class BasePageWebDriver {

	@Managed
	public WebDriver driver;

	private static String baseUrl;

	EnvironmentVariables variables;

	@Before
	public void setup() {

		variables = SystemEnvironmentVariables.createEnvironmentVariables();
		baseUrl = variables.getProperty(ThucydidesSystemProperty.WEBDRIVER_BASE_URL);
		// baseUrl = variables.getProperty("webdriver.base.url");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);

	}

	public void goBack() {
		driver.navigate().back();
	}

	public void scrolDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,1000)");
	}

	public void goForward() {
		driver.navigate().forward();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void acceptAlertPopUp() {
		driver.switchTo().alert().accept();
	}

	public void switchToFrame(String idFrame) {
		driver.switchTo().frame(idFrame);
	}

	public void switchToOriginalFrame() {
		driver.switchTo().defaultContent();
	}

	public void mouseHover(String xpathValue) {
		Actions action = new Actions(driver);

		action.moveToElement(findByXpath(xpathValue)).build().perform();
	}

	public WebElement find(By by) {
		return driver.findElement(by);
	}

	public WebElement findByXpath(String xpathValue) {
		return find(By.xpath(xpathValue));
	}

	public WebElement findById(String id) {
		return find(By.id(id));
	}

	public void clickOnElementByXpath(String xpathValue) {
		findByXpath(xpathValue).click();
	}

	public void clickOnElementByID(String id) {
		findById(id).click();
	}

	public void waitForElementPresent(String locator, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	}

	public void waitForTextPresent(String locator, String text, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.textToBePresentInElement(findByXpath(locator), text));
	}

	public WebElement findByCSS(String css) {
		return find(By.cssSelector(css));
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getTextByXpath(String xpathValue) {
		return findByXpath(xpathValue).getText();
	}

	public void typeAndEnter(String css, String value) {
		findByCSS(css).sendKeys(value, Keys.ENTER);
	}

	public void typeTextByID(String id, String value) {
		findById(id).sendKeys(value);
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
