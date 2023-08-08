package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

import BaseClass.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='orangehrm-login-logo-mobile']/img[1]")
	private WebElement logoL;

	@FindBy(css = "input[name=username]")
	private WebElement txtUsername;

	@FindBy(xpath = " //input[@placeholder='Password']")
	private WebElement txtPass;

	@FindBy(xpath = " //button[normalize-space()='Login']")
	private WebElement btnLogin;

	public WebElement getLogoL() {
		return logoL;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public boolean LogoTest() {
		boolean flag = getLogoL().isDisplayed();
		System.out.println(flag);
		return flag;
	}

	public void userName(String userName) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value="username",getTxtUsername());
		//sendKeys(getTxtUsername(), userName);
	}

	public void password(String password) {
		sendKeys(getTxtPass(), password);
	}

	public void loginBtn() {
		click(btnLogin);
	}
	
	  public void loginPerform(String userName, String passWord) {
	  sendKeys(getTxtUsername(), userName); 
	  sendKeys(getTxtPass(), passWord);
	  click(getBtnLogin()); }
	 

}
