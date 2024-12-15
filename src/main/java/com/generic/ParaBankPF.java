package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParaBankPF {
	//constructor
	public ParaBankPF(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

//locators

@FindBy(xpath="//*[@name='username']")
	private WebElement userName;

@FindBy(xpath="//*[@name='password']")
	private WebElement password;

@FindBy(xpath="//*[@type='submit']")
	private WebElement submit;

@FindBy(xpath="//*[text()='Log Out']")
	private WebElement logoutbtn;

@FindBy(xpath="//*[@class='error']")
	private WebElement invalidCredentialMesg;

@FindBy(xpath="//*[@class='error']")
	private WebElement nullCredentialMsg;
	

//getters	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	public WebElement getInvalidCredentialMesg() {
		return invalidCredentialMesg;
	}
	public WebElement getNullCredentialMsg() {
		return nullCredentialMsg;
	}
	
	

}
