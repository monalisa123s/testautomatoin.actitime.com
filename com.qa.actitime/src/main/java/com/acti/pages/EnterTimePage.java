package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class EnterTimePage extends DriverScript{

	//************************************Page Elements*************//

	@FindBy(xpath="//a[@class='userProfileLink username ']") WebElement textboxUserName;
	@FindBy(id = "logoutLink") WebElement linkLogout;



	//************************************Page Init*************//

	public EnterTimePage()
	{
	PageFactory.initElements(driver, this);
	}

	//************************************Page methods*************//

	public void clickLogout()
	{
	linkLogout.click();
	}

	public String verifyUserLogged()
	{
	return textboxUserName.getText();
	}
	}





