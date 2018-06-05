package com.cts.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loginpage {


@FindBy(xpath = "//input[@id = 'FromTag']")
private WebElement from;

@FindBy(xpath = "//input[@id = 'ToTag']")
private WebElement to;

@FindBy(xpath = "//input[@id = 'DepartDate']")
private WebElement DepartDate;

@FindBy(xpath = "(//a[@title = 'Next'])[2]")
private WebElement arrowButton;

@FindBy(xpath = "(//div/span[@class ='ui-datepicker-month' ])[2]")
private WebElement datepickerHeader;

@FindBy(xpath = "//input[@id = 'DepartDate']")
private WebElement adults;


@FindBy(xpath = "//a[@id = 'MoreOptionsLink']")
private WebElement more;

@FindBy(xpath = "//select[@id = 'Class']")
private WebElement fclass;

@FindBy(xpath = "//input[@id = 'SearchBtn']")
private WebElement searchBtn;

public Loginpage(WebDriver driver){
	PageFactory.initElements(driver,this);
}

public	void fromAndTo(String fromValue, String toValue){
		from.sendKeys(fromValue);
		to.sendKeys(toValue);
	}
	
public	void selectDepart(String date) throws InterruptedException{
		// //span[@class='ui-datepicker-month' and text()='June']/../../..//td/a[text()='145']  :: for any date picking 
		////span[@class='ui-datepicker-month' and text()='September']/../../..//a[. = '13']   :: another method
		DepartDate.click();
		while(!datepickerHeader.getText().equalsIgnoreCase("September")){
			Thread.sleep(3000);
			arrowButton.click();
			}
		
		
	}
	
public	void selectAdults(){
	
		adults.click();
		Select select = new Select(adults);
		select.selectByVisibleText("2");
	}
	
public void selectMore(){
		more.click();
		fclass.click();
		Select select = new Select(fclass);
		select.selectByVisibleText("First");
	}
}
