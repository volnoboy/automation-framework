package com.volnoboy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 11/19/15 11:55 AM
 */
public class DriverSingleton {

	private static WebDriver driver;

	private DriverSingleton() {}

	public static WebDriver getDriver () {
		if(driver == null) {
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static void quitDriver() {
		driver.quit();
	}


}
