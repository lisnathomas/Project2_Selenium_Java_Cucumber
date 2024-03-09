package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.Base;
import com.Pages.Purchase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class PurchaseStepDef {

	Purchase pp = new Purchase(Base.getDriver());
	Actions act;
	Select sel;
	
	WebDriverWait wait = new WebDriverWait(Base.getDriver(), Duration.ofSeconds(30));
	
	@Given("User will land on website")
	public void user_will_land_on_website() {
	    Base.getDriver().get("http://automationpractice.com/index.php");
	}

	@When("User will click on Women")
	public void user_will_click_on_women() {
		act = new Actions(Base.getDriver());
		act.moveToElement(pp.getMousehover_women()).build().perform();
	}

	@When("User will click on casual dress")
	public void user_will_click_on_casual_dress() {
	    pp.getCasualDress().click();
	}

	@When("User will click on quick view")
	public void user_will_click_on_quick_view() {
	    pp.getPrintedDress().click();
	}

	@When("User will change size to large")
	public void user_will_change_size_to_large() { 
	    sel = new Select(pp.getSize());
	    sel.selectByVisibleText("L");
	}

	@When("User will click on add to cart and then proceed to checkout")
	public void user_will_click_on_add_to_cart_and_then_proceed_to_checkout() throws Throwable {
		
		String price1 = pp.getPrice1().getText();
		System.out.println("Price one is:" +price1);
		pp.getAddToCart().click();
	    Thread.sleep(6000);
	    String price2 = pp.getPrice2().getText();
	    System.out.println("Price two is:" +price2);
	    Assert.assertEquals(price1, price2);
	    
	    pp.getCheckOut_1().click();
	}

	@When("User will again click on proceed to checkout")
	public void user_will_again_click_on_proceed_to_checkout() throws Throwable {
		Thread.sleep(4000);
		pp.getCheckOut_2().click();
	}
	
	@When("user will enter email and password")
	public void user_will_enter_email_and_password() throws Throwable {
		Thread.sleep(5000);
	    pp.getEmail().sendKeys("asdfvcxz@gmail.com");
	    pp.password().sendKeys("qwerty");
	}

	@When("user will click on sign in")
	public void user_will_click_on_sign_in() {
	    pp.signin().click();
	} 

	@When("user will click on proceed to checkout")
	public void user_will_click_on_proceed_to_checkout() {
	    pp.getCheckOut_3().click();
	}

	@When("user will agree to terms and service")
	public void user_will_agree_to_terms_and_service() {
	    pp.getTermsandService().click();
	}

	@When("user will click o final nproceed to checkout")
	public void user_will_click_o_final_nproceed_to_checkout() {
	    pp.getCheckOut_4();
	}

	@Then("close the browser")
	public void close_the_browser() {
	   // Base.getDriver().quit();
	    System.out.println("Print success");
	}
	
	//=======================================================================================================
	
	@When("user will give {string} for creating account.")
	public void user_will_give_for_creating_account(String email) {
		pp.getCreateEmail().sendKeys(email);
	}

	@When("user will click on create an account.")
	public void user_will_click_on_create_an_account() {
	    pp.SubmitCreate().click();
	}

	@When("user enter {string} {string} {string} {string}")
	public void user_enter(String title, String fname, String lname, String password) throws Throwable {
		Thread.sleep(5000);
		
		if(title.equals(pp.gender1())) {
			pp.gender1().click();
		}
        else pp.gender().click();
		
	    pp.fname().sendKeys(fname);
	    pp.lname().sendKeys(lname);
	    pp.password1().sendKeys(password);
	}

	@When("user then enter {string} {string} {string} {string}")
	public void user_then_enter(String days, String months, String years,  String company) {
		
		Select day = new Select(pp.getDays());
		day.selectByValue(days);
		Select month = new Select(pp.getMonth());
		month.selectByValue(months);
		Select year = new Select(pp.getYears());
		year.selectByValue(years);
		
	    pp.company().sendKeys(company);
	    pp.newsLetter().click();
	    pp.option().click();
	}

	@When("user then again enter {string} {string} {string} {string} {string}")
	public void user_then_again_enter(String address1, String address2, String city, String postcode, String province) {
	    pp.Address1().sendKeys(address1);
	    pp.Address2().sendKeys(address2);
	    pp.city().sendKeys(city);
	    pp.postcode().sendKeys(postcode);
	    sel = new Select(pp.province());
	    sel.selectByVisibleText(province);
	}

	@When("user then enter values {string} {string} {string}")
	public void user_then_enter_values(String extrainfo, String homephone, String mobilephone) {
	    pp.other().sendKeys(extrainfo);
		pp.phone().sendKeys(homephone);
	    pp.phoneMobile().sendKeys(mobilephone);
	}

	@Then("user will click on register button and succesfully created account")
	public void user_created_account() {
	  System.out.println("Succesfully created account");
		
	}
}
