package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();	
//		loginpage.clickandselectCountry();
	}


	@Test(priority = 1)
	public void loginPagetitleTest() {
		//		String Expectedtile = "Indian Dresses-Buy Traditional Indian Women Clothes Online @ Mehar- Best Online Shop in India";
		String Actualtitle = loginpage.validateLoginPageTitle();
		Assert.assertEquals(Actualtitle, "Cogmento CRM");
		//		Assert.assertEquals(Actualtitle, "Login | Mailchimp");
		Assert.assertEquals(Actualtitle, str);
	}

	@Test (priority = 2)
	public void loginTest() {
		//		loginpage.openLoginForm();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(true, loginpage.validateloginSuccessful(), "Didn't Login");
	}


	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
