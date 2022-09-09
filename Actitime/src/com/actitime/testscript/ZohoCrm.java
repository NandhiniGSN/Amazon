package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ZohoCrm {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	WebDriver d=new ChromeDriver();
  
	@FindBy(id="userName")
	private WebElement untBx;
	@FindBy(id="passWord")
	private WebElement pwtBx;
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement signUp;

}
