import static com.volnoboy.Constans.REGULAR_WAIT;

import com.volnoboy.BaseTest;
import org.junit.Test;
import pages.HomePage;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 1/27/16 12:33 PM
 */
public class SampleTest extends BaseTest {

	@Test
	public void testGoogle() {
		LOGGER.info("Starting google test");
		HomePage page = new HomePage();
		page.open().enterSearchText("selenium").submitSearch().waitFor(REGULAR_WAIT);
	}

}
