package qaautomation.tugas3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	By username = By.xpath("//*[@id=\"username\"]"); 
	By password = By.xpath("//*[@id=\"password\"]");
	By loginBtn = By.xpath("//button[@type='submit']");
	By logoutAndInvalidText = By.xpath("//div[@id='flash']");
	
	//construct
	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	//Aksi
	public void login(String user, String pass) {
		setText(username, user);
		setText(password, pass);
		clickAndWait(loginBtn);
	}
	
	public String getLogoutText() {
		return getText(logoutAndInvalidText);
	}
}
