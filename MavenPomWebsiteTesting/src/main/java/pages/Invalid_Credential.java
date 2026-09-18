package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invalid_Credential {	
public WebDriver driver;

	@FindBy(id = "username") WebElement usernameField;
	@FindBy(id = "password") WebElement passwordField; 
	@FindBy(id = "submit") WebElement submitButton;
    @FindBy(id = "error")WebElement errorMessage;   
	
	
	public Invalid_Credential(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);   }

	public void enterUserName(String usernmame) {
		usernameField.sendKeys(usernmame);
		
	}
	public void enterPassword(String password) {
		passwordField.sendKeys(password);	
	}
	public void clickLoginButton() {
		submitButton.click();
		}
	
    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }
    public String getErrorMessageText() {  
        return errorMessage.getText();
    }
}
