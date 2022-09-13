package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Specification_Page{
@FindBy(id="add-to-cart-button")
private WebElement addcart;
public Specification_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddcart() {
	return addcart;
}


}
