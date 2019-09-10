package com.mavenproject.SampleMavenProj.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenproject.SampleMavenProj.BaseTest3;

public class PageObjectClass extends BaseTest3{

	@FindBy(linkText="Sign in")WebElement SignIn;
	@FindBy(id="email_create")WebElement emailCreate;
	@FindBy(id="SubmitCreate")WebElement Submit;
	@FindBy(id="id_gender1")WebElement Mr;
	@FindBy(id="customer_firstname")WebElement firstName;
	@FindBy(id="customer_lastname")WebElement lastName;
	@FindBy(id="passwd")WebElement Password;
	@FindBy(id="days")WebElement day;
	@FindBy(id="months")WebElement month;
	@FindBy(id="years")WebElement year;
	@FindBy(id="address1")WebElement address;
	@FindBy(id="city")WebElement City;
	@FindBy(id="id_state")WebElement State;
	@FindBy(id="postcode")WebElement PostCode;
	@FindBy(id="id_country")WebElement Country;
	@FindBy(id="phone_mobile")WebElement Mobile;
	@FindBy(id="submitAccount")WebElement SubmitAccount;
	
	public PageObjectClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void customerRegistration() throws InterruptedException
	{
		SignIn.click();
		//emailCreate.sendKeys("qatest12344@gmail.com");
		emailCreate.sendKeys(dataload.getProperty("firstname")+dataload.getProperty("lastname")+randomNumber()+dataload.getProperty("domain"));
		System.out.println(emailCreate.getAttribute("value"));
		Submit.click();
		//Thread.sleep(3000);
		Mr.click();
		firstName.sendKeys("qatestIBM");
		lastName.sendKeys("OpenBanking");
		Password.sendKeys("sairam1234");
		day.sendKeys("23");
		month.sendKeys("August");
		year.sendKeys("1995");
		address.sendKeys("Bangalore");
		City.sendKeys("Bangalore");
		State.sendKeys("California");
		PostCode.sendKeys("34567");
		Country.sendKeys("United States");
		Mobile.sendKeys("123456789");
		//SubmitAccount.click();
		
		
		
	}

	
}
