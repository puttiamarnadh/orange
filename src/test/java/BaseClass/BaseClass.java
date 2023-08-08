package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}
	public void enterURL(String text) {
		driver.get(text);
	}
	
	public void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void click(WebElement element) {
	element.click();
	}
	public void maximize() {
		driver.manage().window().maximize();
	}
	public void close() {
		driver.close();
	}
	
		}
