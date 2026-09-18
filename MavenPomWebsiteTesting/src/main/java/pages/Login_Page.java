package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
public WebDriver driver;
	//Locators using page factory
	
	@FindBy(id = "username") WebElement usernameField; //username
	@FindBy(id = "password") WebElement passwordField; //password
	@FindBy(id = "submit") WebElement submitButton;
	
	//constructor to initialize page factory elements
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//actions
	
	public void enterUserName(String usernmame) {
		usernameField.sendKeys(usernmame);
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password);	
	}
	
	public void clickLogin() {
		submitButton.click();
		
	}

}
