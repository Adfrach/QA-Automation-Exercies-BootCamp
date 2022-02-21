package qaautomation.tugas3;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.tugas3.pages.LoginPageFactory;
import qaautomation.tugas3.pages.ProfilePageFactory;

public class AppTestPOMFactory extends BaseWebTest{
	
	// positif test 
	@Test
	public void test1() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		
		//page login
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		loginPage.loginPageFactory(username, password);
		
		//page profil
		String actualText = loginPage.logoutTextFactory();
		String expectedText = "You logged into a secure area!";
		System.out.println(expectedText);
		
		//assertion
		Assert.assertTrue(actualText.contains(expectedText));
		
		//logout
		profilePage.logoutFactory();
		String actualLogoutText = loginPage.logoutTextFactory();
		String expectedLogoutText = "You logged out of the secure area!";
		System.out.println(expectedLogoutText);
		
		//assertion
		Assert.assertTrue(actualLogoutText.contains(expectedLogoutText));
	}
	
	// negatif test = di mana password kita isi salah
	@Test
	public void test2() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		
		//page login
		String username = "tomsmith";
		String password = "SuperSecretPassword";
		loginPage.loginPageFactory(username, password);
		
		//page validasi/page profil
		String actualText = loginPage.logoutTextFactory();
		String expectedText = "Your password is invalid!";
		
		//Assertion
		Assert.assertTrue(actualText.contains(expectedText));
	}
	

	
}
