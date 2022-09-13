package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingCart{
@FindBy(xpath="//div/div/div[1]/span[1]/span[1]/a[1]")
private WebElement goToCart;
@FindBy(xpath="//div/ul/li[1]/span/a/span/span[1]")
		private WebElement topic;
@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
private WebElement buyNow;

public ShoppingCart(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getGoToCart() {
	return goToCart;
}

public WebElement getTopic() {
	return topic;
}

public WebElement getBuyNow() {
	return buyNow;
}




}
