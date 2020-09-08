package com.chickfilaa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.chickfilaa.basepage.Basepage;

public class Location extends Basepage {
@FindBy(how=How.XPATH,using=("//button[@id='find-location']"))
WebElement Findlocation;
@FindBy(how=How.XPATH,using=("//input[@id='location-search']"))
WebElement Locationsearch;
@FindBy(how=How.XPATH,using=("//form[@class='location-search']//button[@class='icon-search-off']"))
WebElement Searchclick;
@FindBy(how=How.LINK_TEXT,using=("View details"))
WebElement Viewdetails;
@FindBy(how=How.LINK_TEXT,using=("Start catering order"))
WebElement Startcateringorder;
@FindBy(how=How.XPATH,using=("//div[@id='oloorderlbid']/div/div/div/a[2]"))
WebElement Orderpickup;
@FindBy(how=How.XPATH,using=("//div[@id='overlay-lead-time']//input[@id='date']"))
WebElement Calender;
@FindBy(how=How.XPATH,using=("//a[contains(text(),'16')]"))
WebElement Date;
@FindBy(how=How.XPATH,using=("//form[@id='lead-time-form']/div[2]/button"))
WebElement Continue;


	public Location(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public Menupage Checklocation() throws Exception {
		Thread.sleep(3000);
		Findlocation.click();	
		Thread.sleep(3000);
		Locationsearch.sendKeys("15237");
		Thread.sleep(3000);
		Searchclick.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Viewdetails.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		Startcateringorder.click();
		Orderpickup.click();
		Thread.sleep(3000);
		Calender.click();
		Thread.sleep(3000);
		Date.click();
		Thread.sleep(3000);
		Continue.click();
		Thread.sleep(3000);		
		Menupage M=new Menupage(driver);
		PageFactory.initElements(driver, M);
		return M;
		
		
	}
}
