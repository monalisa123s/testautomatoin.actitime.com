package com.acti.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;

public class BaseTest extends DriverScript
{
 LoginPage lp;
 EnterTimePage etp;
 @BeforeMethod
 public void setUp()
 {
	 initapp();
	 lp=new LoginPage();
	 etp=new EnterTimePage();
 }
 @AfterMethod
 public void tearDown()
 {
	 quitDriver();
 }
}
