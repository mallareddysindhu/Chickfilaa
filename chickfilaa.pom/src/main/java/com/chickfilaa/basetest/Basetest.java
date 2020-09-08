package com.chickfilaa.basetest;

import org.openqa.selenium.chrome.ChromeDriver;

import com.chickfilaa.basepage.Basepage;

public class Basetest extends Basepage  {
	public void browsertype (String btype) {
		if (btype=="chrome") {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindhu\\Downloads\\85 version chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();	

}
	}
}

