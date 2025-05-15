package com.FlipakartPomClasses;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BaseClass.*;

public class Iphone14LIst extends FlipkartBaseClass {

	public Iphone14LIst(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath = "(//div[@class = '_6NESgJ'])[3]") List<WebElement> IphoneDEtails;
	
	public void IPhoneDetail() {
     for( WebElement i: IphoneDEtails) {		
    	 System.out.println(i.getText());
     }
	}

}
