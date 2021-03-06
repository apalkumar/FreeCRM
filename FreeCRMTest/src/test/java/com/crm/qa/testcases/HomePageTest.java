package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		//		loginpage.clickandselectCountry();
		//		loginpage.openLoginForm();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void verifyhomepagetitle() {
		String homepagetitle = homepage.validatehomePageTitle();
		Assert.assertEquals(homepagetitle, str);
		homepage.clickontasksslink();
		//		boolean sFlag = homepage.verifydealpagelogo();
		//		Assert.assertEquals(sFlag, true);
		//		homepage.selectCategory();
	}

	@Test
	public void openContactsPage() throws InterruptedException {
		homepage.clickoncontactslink();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
