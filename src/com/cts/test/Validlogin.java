package com.cts.test;


import org.testng.Reporter;
import org.testng.annotations.Test;

import com.cts.generic.Basetest;
import com.cts.page.Loginpage;

public class Validlogin extends Basetest {

	@Test
	public void execute() throws InterruptedException{
		
		Loginpage lp = new Loginpage(driver);
		lp.fromAndTo("Delhi", "Bangalore");
		lp.selectDepart("dfdfdf");
		Thread.sleep(3000);
		
	}
	
	
}
