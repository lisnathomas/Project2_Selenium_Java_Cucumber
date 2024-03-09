package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Purchase {

	private WebDriver driver;
	
	public Purchase(WebDriver driver) {
		this.driver = driver;
	}
	
	private By mousehover_women = By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]/a");
	private By casual_dress = By.linkText("Casual Dresses");
	private By printed_dress = By.linkText("Printed Dress");
	private By size = By.id("group_1");
	private By addToCart = By.name("Submit");
	private By price1 = By.id("our_price_display");
	private By checkout_first = By.linkText("Proceed to checkout");
	private By price2 = By.id("layer_cart_product_price");
	private By checkout_second = By.linkText("Proceed to checkout");
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By Signin = By.id("SubmitLogin");
	private By checkout_third = By.name("processAddress");
	private By terms_and_service = By.name("cgv");
	private By checkout_fourth = By.name("processCarrier"); 
	
	private By createEmail = By.id("email_create");
	private By submitCreate = By.id("SubmitCreate");
	private By gender1 = By.id("id_gender1");
	private By gender = By.id("id_gender2");
	private By firstName = By.name("customer_firstname");
	private By lastName = By.name("customer_lastname");
	private By pswd = By.name("passwd");
	private By days = By.id("days");
	private By months = By.name("months");
	private By years = By.name("years");
	private By company = By.id("company");
	private By newsLetter = By.name("newsletter");
	private By option = By.id("uniform-optin");
	private By address1 = By.id("address1");
	private By address2 = By.id("address2");
	private By city = By.id("city");
	private By postCode = By.id("postcode");
	private By province = By.name("id_state");
	private By other = By.id("other");
	private By phone = By.id("phone");
	private By phoneMobile = By.id("phone_mobile");
	
	
	public WebElement getMousehover_women() {
		return driver.findElement(mousehover_women);
	}
	
	public WebElement getCasualDress() {
		return driver.findElement(casual_dress);
	}
	
	public WebElement getPrintedDress() {
		return driver.findElement(printed_dress);
	}
	
	public WebElement getSize() {
		return driver.findElement(size);
	}
	
	public WebElement getAddToCart() {
		return driver.findElement(addToCart);
	}
	
	public WebElement getPrice1() {
		return driver.findElement(price1);
	}
	
	public WebElement getCheckOut_1() {
		return driver.findElement(checkout_first);
	}
	
	public WebElement getPrice2() {
		return driver.findElement(price2);
	}
	
	public WebElement getCheckOut_2() {
		return driver.findElement(checkout_second);
	}
	
	public WebElement getEmail() { 
		return driver.findElement(emailId);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement signin() {
		return driver.findElement(Signin);
	}
	
	public WebElement getCheckOut_3() {
		return driver.findElement(checkout_third);
	}
	
	public WebElement getTermsandService() {
		return driver.findElement(terms_and_service);
	}
	
	public WebElement getCheckOut_4() {
		return driver.findElement(checkout_fourth);
	}
	
	public WebElement getCreateEmail() {
		return driver.findElement(createEmail);
	}
	
	public WebElement SubmitCreate() {
		return driver.findElement(submitCreate);
	}
	
	public WebElement gender() {
		return driver.findElement(gender);
	}
	
	public WebElement gender1() {
		return driver.findElement(gender1);
	}
	
	public WebElement fname() {
		return driver.findElement(firstName);
	}
	
	public WebElement lname() {
		return driver.findElement(lastName);
	}
	
	public WebElement password1() {
		return driver.findElement(pswd);
	}
	
	public WebElement getDays() {
		return driver.findElement(days);
	}
	
	public WebElement getMonth() {
		return driver.findElement(months);
	}
	
	public WebElement getYears() {
		return driver.findElement(years);
	}
	
	public WebElement company() {
		return driver.findElement(company);
	}
	
	public WebElement newsLetter() {
		return driver.findElement(newsLetter);
	}
	
	public WebElement option() {
		return driver.findElement(option);
	}
	
	public WebElement Address1() {
		return driver.findElement(address1);
	}
	
	public WebElement Address2() {
		return driver.findElement(address2);
	}
	
	public WebElement city() {
		return driver.findElement(city);
	}
	
	public WebElement postcode() {
		return driver.findElement(postCode);
	}
	
	public WebElement province() {
		return driver.findElement(province);
	}
	
	public WebElement other() {
		return driver.findElement(other);
	}
	
	public WebElement phone() {
		return driver.findElement(phone);
	}
	
	public WebElement phoneMobile() {
		return driver.findElement(phoneMobile);
	}
	
	}
