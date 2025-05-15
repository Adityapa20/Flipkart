package com.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FlipkartBaseClass {

	protected static WebDriver driver;

   public FlipkartBaseClass(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofNanos(10));
		

}

}