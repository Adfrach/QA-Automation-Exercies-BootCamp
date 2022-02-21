package qaautomation.tugas4;


import org.testng.annotations.Test;

import qaautomation.tugas4.page.Common;
import qaautomation.tugas4.page.HomePage;
import qaautomation.tugas4.page.PageEmail;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest {
	
	@Test
	public void test1() {
		HomePage homePage = new HomePage(driver, explicitWait);
		Common commonPage = new Common(driver, explicitWait);
		PageEmail pageEmail = new PageEmail(driver, explicitWait);
		
		String username = "testautomation";
		String iFrame = "ifmail";
		
		homePage.inputUsername(username);
		homePage.clickArrowBtn();
		commonPage.switchIframe(iFrame);
		String text = pageEmail.getTextEmail();
		System.out.println(text);
		
	}
	
	
}
