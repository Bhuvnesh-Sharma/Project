package com.cts.test;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cts.generic.BaseTest;
import com.cts.page.SearchFlights;

//@Listeners(com.cts.generic.Extents.class)
public class Validlogin extends BaseTest {

	@Test(enabled = true)
	public void execute() throws InterruptedException, IOException{
		Reporter.log("creation of objects",true);
		SearchFlights lp = new SearchFlights(driver);
		
		lp.fromAndTo("Delhi", "Bangalore");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// now copy the  screenshot to desired location using copyFile method
		FileUtils.copyFile(src, new File("./Data/sel"+".png"));
		lp.selectDepart("dfdfdf");
		Thread.sleep(2000);
		lp.selectAdults();
		Reporter.log("check ", true);
		lp.selectMore();
		Thread.sleep(2000);
		lp.search();
		Thread.sleep(2000);
		
	/*@Test(priority = 1)
	public void demo(){
		System.out.println("priority 1");
		}*/
	
		
	}
	
	
}
