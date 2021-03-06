package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

//	PageFactory or OR
	@FindBy(id="box")
	WebElement selectCoutrydropdown;

	@FindBy(xpath ="//a[text()=' Log In ']")
	WebElement openLoginform;

	@FindBy(xpath ="//b[text()='India']")
	WebElement SearchedCountry;

	@FindBy(name="email")   //-- For Free CRM and Mehar
//	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//div[text()='Login']")//--Free CRM
//	@FindBy(xpath="//button[@type='submit']") //--For Mailchimp
//	@FindBy(name="login")
	WebElement loginbtn;

	@FindBy(xpath="//a[text()='Sign Up']")//-- For Free CRM
//	@FindBy(xpath="//a[@title='Signup for a Mailchimp account']")
	WebElement SignUpbtn;

//	@FindBy(xpath = "//span[text()='Anil Kumar.']") //--- For Mehar
	@FindBy(xpath = "//span[text()='Anil Pal']")  // For Free CRM
	WebElement loggedinUser;

	//	Initialize Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
//		PageFactory.initElements(driver, LoginPage.class);
	}

//	Click on Select Country --- For Mehar Project
//	public void clickandselectCountry() {
//		selectCoutrydropdown.click();
//		selectCoutrydropdown.sendKeys("India");
//		SearchedCountry.click();
//	}

//	Validate Login Page Title
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

//	For Mehar Project
//	public void openLoginForm() {
//		openLoginform.click();;
//	}

	public boolean validateloginSuccessful() {
		loggedinUser.isDisplayed();
		return true;
	}

	public HomePage login(String un, String pwd)  {
		try {
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginbtn.click();
			Thread.sleep(3000);

	}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return new HomePage();
	}
}
