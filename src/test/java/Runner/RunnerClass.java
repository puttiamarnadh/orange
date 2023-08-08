package Runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.LoginPage;

public class RunnerClass extends BaseClass {

	@BeforeMethod
	private void setUp() {
		openBrowser();
		maximize();
		enterURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	private void hRMLogin() {
		LoginPage hrm = new LoginPage();
		hrm.LogoTest();
		//hrm.loginPerform("Admin", "admin123");
		hrm.userName("Admin");
		//hrm.password("admin123");
		hrm.loginBtn();
		
	}
	@AfterMethod
	private void tearDown() {
		//close();
	}
}
