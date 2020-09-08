package com.chickfilaa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.chickfilaa.basepage.Basepage;

public class Launchingpage extends Basepage{
	public Launchingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public Location Landingpage() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.chick-fil-a.com/");
		Location L= new Location(driver);
		PageFactory.initElements(driver, L);
		return L;
	}

}
