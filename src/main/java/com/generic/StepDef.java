package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	WebDriver driver;	
	ParaBankPF pf;
	SoftAssert sa;
	
	@Given("open browser")
	public void open_browser() throws InterruptedException {
		driver = new ChromeDriver();		
		Thread.sleep(3000);	    
		driver.manage().window().maximize();
	}

	@Given("go to application login page")
	public void go_to_application_login_page() {
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");	    
	    
	}

	@When("put valid user name")
	public void put_valid_user_name() {
		pf= new ParaBankPF(driver);
		pf.getUserName().sendKeys("student");    
	    
	}

	@When("enter valid password")
	public void enter_valid_password() {
		pf.getPassword().sendKeys("qa1234");	    
	    
	}

	@When("click login button")
	public void click_login_button() {
		pf.getSubmit().click();	    
	    
	}

	@Then("successfull login and logout button should visible")
	public void successfull_login_and_logout_button_should_visible() throws InterruptedException {
		sa = new SoftAssert();
		sa.assertTrue(pf.getLogoutbtn().isDisplayed());
		Thread.sleep(3000);	 
		driver.quit();
		sa.assertAll();	    
	    
	}

	@When("put invalid user name")
	public void put_invalid_user_name() {
		pf= new ParaBankPF(driver);
		pf.getUserName().sendKeys("ghghghg");
	    
	    
	}

	@When("enter invalid password")
	public void enter_invalid_password() {
		pf.getPassword().sendKeys("hhhhhhhh");	    
	    
	}

	@Then("login fail and error msg An internal error has pccured and has been logged")
	public void login_fail_and_error_msg_An_internal_error_has_pccured_and_has_been_logged() throws InterruptedException {
		sa = new SoftAssert();	
	    sa.assertTrue(pf.getInvalidCredentialMesg().isDisplayed());
	    Thread.sleep(3000);	 
		driver.quit();
		sa.assertAll();
	}

	@When("put null user name")
	public void put_null_user_name() {
		pf= new ParaBankPF(driver);
		pf.getUserName().sendKeys("");	    
	    
	}

	@When("enter null password")
	public void enter_null_password() {
		pf.getPassword().sendKeys("");	    
	    
	}

	@Then("login fail and error msg show Please enter a username and password")
	public void login_fail_and_error_msg_show_Please_enter_a_username_and_password() throws InterruptedException {
		
		sa = new SoftAssert();
		sa.assertTrue(pf.getNullCredentialMsg().isDisplayed());
		
		Thread.sleep(3000);	 
		driver.quit();
		sa.assertAll();
	    
	}



}
