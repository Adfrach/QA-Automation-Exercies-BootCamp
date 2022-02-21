package qaautomation.tugas4.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common extends BasePage{
	
	public Common(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	
	public void switchIframe(String id) {
		driver.get().switchTo().frame(id);
	}
	
}
