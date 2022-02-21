package qaautomation.tugas3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage {
	By profileText = By.xpath("//div[@id='flash']");
	By logoutBtn = By.xpath("//a[@href='/logout']");
	
	//Constructor
	public ProfilePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	//aksi 
	public String getProfileText() {
		return getText(profileText);
	}
	
	public void logout() {
		clickAndWait(logoutBtn);
	}
}
