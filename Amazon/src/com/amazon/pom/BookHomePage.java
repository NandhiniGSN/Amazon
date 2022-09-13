package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BookHomePage {
@FindBy(xpath="//span[text()='The Psychology of Money']")
private WebElement first_Book;

public BookHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setFirst_Book() {
     first_Book.click();
}




}
