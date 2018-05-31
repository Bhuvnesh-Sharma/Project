package com.cts.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Loginpage {
WebDriver driver;

@FindBy(xpath = "//input[@id = 'FromTag']")
private WebElement from;

@FindBy(xpath = "//input[@id = 'ToTag']")
private WebElement to;

@FindBy(xpath = "//input[@id = 'DepartDate']")
private WebElement DepartDate;

@FindBy(xpath = "(//a[@title = 'Next'])[2]")
private WebElement next;

@FindBy(xpath = "//input[@id = 'DepartDate']")
private WebElement adults;


@FindBy(xpath = "//a[@id = 'MoreOptionsLink']")
private WebElement more;

@FindBy(xpath = "//select[@id = 'Class']")
private WebElement fclass;

@FindBy(xpath = "//input[@id = 'SearchBtn']")
private WebElement searchBtn;

Loginpage(WebDriver driver){
	this.driver = driver;
}

	void fromAndTo(String fromValue, String toValue){
		from.sendKeys("");
		to.sendKeys("");
	}
	
	void selectDepart(String date){
		DepartDate.click();
		next.click();
		
	}
	
	void selectAdults(){
		adults.click();
		Select select = new Select(adults);
		select.selectByVisibleText("2");
	}
	
	void selectMore(){
		more.click();
		fclass.click();
		Select select = new Select(fclass);
		select.selectByVisibleText("First");
	}
}
