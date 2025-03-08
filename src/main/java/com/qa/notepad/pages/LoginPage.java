package com.qa.notepad.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.notepad.baseclass.BaseClass;

public class LoginPage extends BaseClass {

	
	@FindBy(xpath="//input[@id='email']")
	WebElement loginid;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='loginbutton']")
	WebElement loginbutton;
	
	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String login(String loginid, String password) {
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = mywait.until(ExpectedConditions.visibilityOf(this.loginid));
		
		element.sendKeys(loginid);
		this.password.sendKeys(password);
		this.loginbutton.click();
		//(20+) Facebook
		//Facebook – log in or sign up
		return driver.getTitle();
		
	}









}
