package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base {
	
public WebDriver driver;
	
	String url = "https://practicetestautomation.com/practice-test-login/";
	
	
	@BeforeTest  
	
	public void setup() {
		driver = new ChromeDriver();
		driver.get(url);
	}

}
