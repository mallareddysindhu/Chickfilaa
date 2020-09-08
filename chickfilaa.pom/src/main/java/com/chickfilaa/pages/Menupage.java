package com.chickfilaa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.chickfilaa.basepage.Basepage;

public class Menupage extends Basepage {
@FindBy(how=How.XPATH,using=("//a[@id='#entrées']"))
public WebElement Entree;
@FindBy(how=How.XPATH,using=("//a[@id='menu-chick-fil-a-nuggets']"))
public WebElement Nuggets;
@FindBy(how=How.XPATH,using=("//div[@id='pdp-sticky']/div/div/div/button"))
public WebElement Addtoorder;
@FindBy(how=How.XPATH,using=("//div[@id='saucequantityerror']/div/a[2]"))
public WebElement Skipsauces;
@FindBy(how=How.XPATH,using=("//div[@id='btn-cart']"))
public WebElement Cart;

	public Menupage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public Cancelorderpage Selectfood() throws Exception {
		Entree.click();
		Thread.sleep(3000);
		Nuggets.click();
		Thread.sleep(3000);
		Addtoorder.click();
		Thread.sleep(3000);
		Skipsauces.click();
		Thread.sleep(3000);
		Cart.click();
		Thread.sleep(3000);
		Cancelorderpage C=new Cancelorderpage(driver);
		PageFactory.initElements(driver, C);
		return C;
	}

}
