package com.volnoboy;

import static com.volnoboy.Constans.REGULAR_WAIT;
/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 1/27/16 2:27 PM
 */
public class WaitUtils {

	public static void regularWait() {
		try {
			Thread.sleep(REGULAR_WAIT);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
