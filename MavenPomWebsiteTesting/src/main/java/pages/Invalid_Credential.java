package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invalid_Credential {	
public WebDriver driver;
	//Locators using page factory
	@FindBy(id = "username") WebElement usernameField; //username
	@FindBy(id = "password") WebElement passwordField; //password
	@FindBy(id = "submit") WebElement submitButton;
    @FindBy(id = "error")WebElement errorMessage;    // error message
	
	//constructor to initialize page factory elements
	public Invalid_Credential(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);   }
	//actions
	public void enterUserName(String usernmame) {
		usernameField.sendKeys(usernmame);
		
	}
	public void enterPassword(String password) {
		passwordField.sendKeys(password);	
	}
	public void clickLoginButton() {
		submitButton.click();
		}
	
    public boolean isErrorMessageDisplayed() { // check if error message is displayed
        return errorMessage.isDisplayed();
    }
    public String getErrorMessageText() {    // get error message text
        return errorMessage.getText();
    }
}
