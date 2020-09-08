package com.chickfilaa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.chickfilaa.basepage.Basepage;

public class Cancelorderpage extends Basepage{
@FindBy(how=How.XPATH,using=("//a[@id='cancel-order']"))
public WebElement cancelorder  ;
@FindBy(how=How.XPATH,using=("//a[@class='btn-round btn-round--red btn-round--inline-spaced clear-order']"))
public WebElement cancelit ;
	public Cancelorderpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void Cancel() throws Exception {
		cancelorder.click();
		Thread.sleep(3000);
		cancelit.click();		
	}

}
