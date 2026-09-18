package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
public WebDriver driver;
	//Locators using page factory
	
	@FindBy(xpath = "//a[text()='Log out']") WebElement logoutButton;
	
	//constructor to initialize page factory elements
	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//actions
	
		public void clickLogout() { // to perform button click
			logoutButton.click();
			
		}
		
		public String getTxt() {  //1.a  to get the text of button - the expecting code write this page class - comparison code write in Test class
			return logoutButton.getText();
		}
		
		public String url() {  //2. a to get the current url - the expecting code write this page class - comparison code write in Test class
			return driver.getCurrentUrl();
		}
}
