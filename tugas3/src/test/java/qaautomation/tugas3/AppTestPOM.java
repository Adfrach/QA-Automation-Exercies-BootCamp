package qaautomation.tugas3;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.tugas3.pages.LoginPage;
import qaautomation.tugas3.pages.ProfilePage;

/**
 * Unit test for simple App.
 */
public class AppTestPOM extends BaseWebTest {
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);

	// positif test
	@Test
	public void test1() {

		// login page
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		loginPage.login(username, password);
		

		// profil page
		String actualText = profilePage.getProfileText();
		String expectedText = "You logged into a secure area!";
		System.out.println(expectedText);

		// assertion
		Assert.assertTrue(actualText.contains(expectedText));

		// logout
		profilePage.logout();
		String actualLogoutText = loginPage.getLogoutText();
		String expectedLogoutText = "You logged out of the secure area!";
		System.out.println(expectedLogoutText);

		// assertion
		Assert.assertTrue(actualLogoutText.contains(expectedLogoutText));
	}

	// negatif test = di mana password kita isi salah
	@Test
	public void test2() {
		
		// login page
		String username = "tomsmith";
		String password = "SuperSecretPassword";
		loginPage.login(username, password);

		// invalid password text
		String actualText = profilePage.getProfileText();
		String expectedText = "Your password is invalid!";
		System.out.println(expectedText);
		
		//assert
		Assert.assertTrue(actualText.contains(expectedText));
	}

}
