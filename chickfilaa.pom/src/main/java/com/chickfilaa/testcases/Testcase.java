 package com.chickfilaa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.chickfilaa.basetest.Basetest;
import com.chickfilaa.pages.Cancelorderpage;
import com.chickfilaa.pages.Launchingpage;
import com.chickfilaa.pages.Location;
import com.chickfilaa.pages.Menupage;

public class Testcase  extends Basetest{
@Test
	public void testcase() throws Exception {
		browsertype ("chrome");
		Launchingpage LP=new Launchingpage(driver);
		PageFactory.initElements(driver, LP);
		Location L =LP.Landingpage();
		PageFactory.initElements(driver, L);
		Menupage M=L.Checklocation();
		PageFactory.initElements(driver, M);
		Cancelorderpage C=M.Selectfood();
		PageFactory.initElements(driver, C);
		C.Cancel();
	}
}

