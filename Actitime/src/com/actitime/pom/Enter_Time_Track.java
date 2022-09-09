package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enter_Time_Track {
@FindBy(xpath="//a[@class='content tasks']")
private WebElement Taskopt;
@FindBy(xpath="Logout")
private WebElement Logout;

public Enter_Time_Track(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	public void setTaskopt() {
		Taskopt.click();
	}
	public void setLogout() {
		Logout.click();
	}
}
