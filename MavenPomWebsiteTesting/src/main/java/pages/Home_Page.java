package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
public WebDriver driver;

	
	@FindBy(xpath = "//a[text()='Log out']") WebElement logoutButton;
	

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
		public void clickLogout() {
			logoutButton.click();
			
		}
		
		public String getTxt() { 
			return logoutButton.getText();
		}
		
		public String url() { 
			return driver.getCurrentUrl();
		}
}
