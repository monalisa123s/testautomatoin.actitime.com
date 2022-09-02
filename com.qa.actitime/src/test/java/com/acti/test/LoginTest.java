package com.acti.test;

import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;
import com.acti.utils.Helper;

public class LoginTest extends DriverScript{
	//@Test(priority =1)
	public void testLogin() throws InterruptedException
	{
	//initapp();
	LoginPage lp = new LoginPage();
	lp.enterUsername("admin");
	lp.enterPassword("manager");
	lp.clickLogin();
	Helper.fn_sleep();
	EnterTimePage etp = new EnterTimePage();
	String actual = etp.verifyUserLogged();
	System.out.print(actual);
	etp.clickLogout();
	Helper.fn_sleep();
	//quitDriver();
	}


	@Test (priority = 2)
	public void testValidateForgotPasswordLink() 
	{
	initapp();
	Helper.fn_sleep();
	LoginPage lp = new LoginPage();
	boolean flag = lp.verifyLinkForgotPassword();
	System.out.println(flag);
	Helper.fn_sleep();
	//quitDriver();
	}
	}



