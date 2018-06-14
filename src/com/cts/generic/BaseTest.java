package com.cts.generic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;







import org.openqa.selenium.Dimension;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;


@Listeners(com.cts.generic.ExtentsListener.class)
public class BaseTest implements Constants {

	
	public WebDriver driver;
	static{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		
	//	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		 
		// create ExtentReports and attach reporter(s)
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
		 
		// creates a toggle for the given test, adds all log events under it    
//		ExtentTest test = extent.createTest("verifyHomePageTitle", "Checking the Title");
		 
		
		
	}
	
	@BeforeTest(alwaysRun=true)
	public void openApplication(){
		driver=new ChromeDriver();
		String url=Lib.getPpt(CONFIG_PATH,"URL");
		driver.get(url);
		String strITO=Lib.getPpt(CONFIG_PATH,"ITO");
		long ITO = Long.parseLong(strITO);
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		//driver.manage().window().maximize();      Not working with current browser  
		System.out.println("beforetest");
		//System.out.println(driver.manage().window().getSize());
		Reporter.log(driver.manage().window().getSize()+"", true);
		/*Dimension d = new Dimension(800,600);
		//Resize the current window to the given dimension
		driver.manage().window().setSize(d);*/
	}
	
	@AfterTest(alwaysRun=true)
	public void closeApplication() throws IOException{
		// Take screenshot and store as a file format 
		
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// now copy the  screenshot to desired location using copyFile method
		//FileUtils.copyFile(src, new File("C:/Users/554484/git/Project/Data/Screenshots.docx"+System.currentTimeMillis()+".png"));
		System.out.println("aftertest");
				driver.quit();
	}
		
	
}