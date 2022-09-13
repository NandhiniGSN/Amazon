package com.amazon.testscripts;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.amazon.generic.BaseClass;
import com.amazon.generic.FileLib;
import com.amazon.pom.BookHomePage;
import com.amazon.pom.HomePage;
import com.amazon.pom.ShoppingCart;
import com.amazon.pom.Specification_Page;
@Listeners(com.amazon.generic.ListenerImplementation.class)
public class View_Cart extends BaseClass {
@Test
public void viewCart() throws EncryptedDocumentException, IOException {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	FileLib f=new FileLib();
	String book_name = f.setExcelFile("Amazon_Inputs", 2, 1);
	
	HomePage h=new HomePage(driver);
    h.getTxtbox().sendKeys(book_name);
    h.getSearch().click();	
	
    BookHomePage bh=new BookHomePage(driver);
    bh.setFirst_Book();
   
    String parent = driver.getWindowHandle();
    Set<String> tabs = driver.getWindowHandles();
     for(String wh:tabs) {
    	 if(!(parent.equals(wh))) {
    driver.switchTo().window(wh);
    Specification_Page sp=new Specification_Page(driver);
	sp.getAddcart().click();
    	 
	ShoppingCart sc=new ShoppingCart(driver);
	sc.getGoToCart().click();
	
	String result = sc.getTopic().getText();
	if(result.contains("The Psychology of Money")) {
	Reporter.log("Pass",true);}
	else
		Reporter.log("Failed", true);
}
}}}