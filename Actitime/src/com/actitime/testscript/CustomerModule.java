package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.Enter_Time_Track;
import com.actitime.pom.Task_List;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
  @Test
  public void testCreateCustomer() throws EncryptedDocumentException, IOException {
	  Reporter.log("CreateCustomer",true);
	  FileLib f=new FileLib();
	  String custName = f.setExcel("createcustomer", 1, 2);
	  String custdesc = f.setExcel("createcustomer", 1, 3);
	  Enter_Time_Track e=new Enter_Time_Track(driver);
	  e.setTaskopt();
	  Task_List t=new Task_List(driver);
	  t.getAddCustBtn().click();
      t.getNewCustAdd().click();
	  t.getCustTxtBx().sendKeys(custName);
	  t.getCustDescTbx().sendKeys(custdesc);
	  t.getSelectDD().click();
	  JavascriptExecutor j=(JavascriptExecutor) driver;
	  j.executeScript("window.scrollBy(0,0)");
	  t.getOurComp().click();
	  t.getCreatCusBtn().click();
  }
  
}
