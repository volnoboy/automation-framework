package pages;

import com.volnoboy.PageUrl;
import org.apache.log4j.Logger;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 11/19/15 12:15 PM
 */
@PageUrl("http://google.com")
public class HomePage extends CommonPage<HomePage> {

	private static final Logger LOGGER = Logger.getLogger(HomePage.class);

	public HomePage open() {
		openPage(this);
		LOGGER.info("Navigated to " + getDriver().getTitle());
		return this;
	}

	public HomePage enterSearchText(String text) {
		findBy("//input[@id='lst-ib']").sendKeys(text);
		return this;
	}

	public HomePage submitSearch() {
		findBy("//button[@type='submit']").click();
		return this;
	}
}
