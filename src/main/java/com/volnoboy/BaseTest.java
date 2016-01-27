package com.volnoboy;

import org.apache.log4j.Logger;
import org.junit.AfterClass;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 1/27/16 2:46 PM
 */
public class BaseTest {

	protected static final Logger LOGGER = Logger.getLogger(BaseTest.class);

	@AfterClass
	public static void releaseResources() {
		DriverSingleton.quitDriver();
	}
}
