package com.FlipakartPomClasses;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BaseClass.FlipkartBaseClass;

import net.bytebuddy.asm.Advice.Enter;

public class SearchPage extends FlipkartBaseClass{

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
		@FindBy (xpath = "//input[@class =  'Pke_EE']")WebElement searchtext;
		
		
		
		public void searchproduct(String text) {
			searchtext.sendKeys(text);
			searchtext.sendKeys(Keys.ENTER);
			
		}
		

		
	

}
