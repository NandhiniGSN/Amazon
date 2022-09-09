package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task_List {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addCustBtn;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustAdd;
@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
private WebElement custTxtBx;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement custDescTbx;
@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
private WebElement selectDD;
@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
private WebElement ourComp;
@FindBy(xpath="//div[text()='Create Customer']")
private WebElement creatCusBtn;

public Task_List(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddCustBtn() {
	return addCustBtn;
}
public WebElement getNewCustAdd() {
	return newCustAdd;
}
public WebElement getCustTxtBx() {
	return custTxtBx;
}
public WebElement getCustDescTbx() {
	return custDescTbx;
}
public WebElement getSelectDD() {
	return selectDD;
}
public WebElement getOurComp() {
	return ourComp;
}
public WebElement getCreatCusBtn() {
	return creatCusBtn;
}

}
