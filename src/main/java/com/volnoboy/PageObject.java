package com.volnoboy;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 11/19/15 11:54 AM
 */
public abstract class PageObject<T extends PageObject> {


	private static final Logger LOGGER = Logger.getLogger(PageObject.class);

	private WebDriver driver = DriverSingleton.getDriver();


	protected WebDriver getDriver() {
		return driver;
	}

	protected WebElement findBy(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public T open(String url) {
		getDriver().get(url);
		return (T)this;
	}

	public void openPage(T page) {
		String url  = page.getClass().getAnnotation(PageUrl.class).value();
		getDriver().get(url);
	}

	public void waitFor(int milliseconds) {
		try {
			LOGGER.info("Waiting for " + milliseconds/1000 + " seconds.");
			Thread.sleep(milliseconds);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void executeScript(String script) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(script);
	}

	public void selectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public String getElementColor(WebElement element) {
		return element.getCssValue("color");
	}
}
