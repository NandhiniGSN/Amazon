package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage{
	@FindBy(id="twotabsearchtextbox")
	private WebElement txtbox;
	@FindBy(id="nav-search-submit-button")
	private WebElement search;
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	public WebElement getTxtbox() {
		return txtbox;
	}
	public WebElement getSearch() {
		return search;
	}

}

