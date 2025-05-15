package com.TestCasesFlipkart;
import com.FlipakartPomClasses.*;

import java.time.Duration;

import javax.naming.directory.SearchControls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.*;
// this is test class calling all pom classes.......
public class Test1 {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofNanos(6));
		
	}
	
	@Test
	public void searchProduct() {
		SearchPage sp = new SearchPage(driver);
		ClickOnIphone14ToOrder cl = new ClickOnIphone14ToOrder(driver);
		Iphone14LIst ip = new Iphone14LIst(driver);
		sp.searchproduct("iphone 14");
		ip.IPhoneDetail();
		cl.CLickIphone14();


	}
	
	
	
	
	

}
