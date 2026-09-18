package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
	}
	
	@Test
	public void test() throws InterruptedException {
		   driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("jibi");
		
		driver.findElement(By.id("idOfButton")).click(); //click
		
		Actions act = new Actions(driver); // double click and alert handling
		
		WebElement d = driver.findElement(By.id("dblClkBtn"));
		act.doubleClick(d);
		act.build().perform();
		
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		  //click female radio button
        driver.findElement(By.id("female")).click();
        
        // select 2 checkbox
        driver.findElement(By.className("Automation")).click();

        driver.findElement(By.className("Performance")).click();
        
	}	

}
