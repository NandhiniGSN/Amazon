package com.amazon.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static WebDriver driver;
@BeforeTest
public void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
@BeforeMethod
public void UrlEnter() throws EncryptedDocumentException, IOException {
	FileLib f=new FileLib();
	String url = f.setExcelFile("Amazon_Inputs", 1, 1);
	driver.get(url);
}
@AfterTest
public void closeBrowser() {
	driver.quit();
}


}
