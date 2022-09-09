package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.Enter_Time_Track;
import com.actitime.pom.LoginPage;

public class BaseClass {
public static WebDriver driver;
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@BeforeTest
public void openBrowser() {
	Reporter.log("",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterTest
public void closeBrowser() {
	Reporter.log("",true);
	//driver.close();
}
@BeforeMethod
public void Login() throws IOException {
	Reporter.log("",true);
	FileLib f=new FileLib();
	String url = f.setProperty("url");
	String un = f.setProperty("un");
	String pw=f.setProperty("pw");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setLogin(un, pw);
}
@AfterMethod
public void Logout() {
	Reporter.log("",true);
	Enter_Time_Track e=new Enter_Time_Track(driver);
	e.setLogout();
}
}
