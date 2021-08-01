/*
 * Author
 * 
 */

package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//button[@class='ui linkedin button']//i[@class='edit icon']")
	WebElement btnCreate;
	
	@FindBy(name="first_name")   //-- For Free CRM and Mehar
	WebElement firstname;
	
	@FindBy(name="last_name")   //-- For Free CRM and Mehar
	WebElement lastname;
	
	@FindBy(name="middle_name")   //-- For Free CRM and Mehar
	WebElement middlename;
	
	@FindBy(name="company")   //-- For Free CRM and Mehar
	WebElement companyname;
	
	@FindBy(xpath="//div[@class='ui active visible fluid multiple search selection dropdown']")
	WebElement tags;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contacts;
	
	@FindBy(xpath="//*[@class=\"save icon\"]//parent::button")
	WebElement contactsSavebtn;
	
//	Initialize Page Objects
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void openContatcForm(String fname, String lname, String mname) throws InterruptedException {
		Thread.sleep(3000);
		firstname.sendKeys(fname);
		Thread.sleep(1000);
		middlename.sendKeys(mname);
		Thread.sleep(1000);
		lastname.sendKeys(lname);
		Thread.sleep(1000);
//		companyname.sendKeys("test");
//		tags.sendKeys("test");
		contactsSavebtn.click();
		Thread.sleep(5000);
	}
	
	

}
