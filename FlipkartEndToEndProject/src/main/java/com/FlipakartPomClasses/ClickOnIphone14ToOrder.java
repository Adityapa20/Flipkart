package com.FlipakartPomClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BaseClass.*;
public class ClickOnIphone14ToOrder extends FlipkartBaseClass {

	public ClickOnIphone14ToOrder(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		
		
	}
	
	@FindBy(xpath = "((//div[contains(text(), 'Apple iPhone 14')])[1]") WebElement ClickOnIphone14;
	
	public void CLickIphone14() {
		ClickOnIphone14.click();
		
	}
	
	

}
