package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class LoginPage extends DriverScript {
//************************************Page Elements*************//

@FindBy(id="username") WebElement textboxUserName;
@FindBy(name = "pwd") WebElement textboxPassword;
@FindBy(xpath = "//div[text()='Login ']") WebElement buttonLogin;
@FindBy(xpath = "//a[@id='toPasswordRecoveryPageLink']") WebElement lnkForgotPassword;



//************************************Page Init*************//

public LoginPage()
{
PageFactory.initElements(driver, this);
}


//************************************Page Actions*************//

public void enterUsername(String username)
{
textboxUserName.sendKeys(username);
}
public void enterPassword(String password)
{
textboxPassword.sendKeys(password);
}
public void clickLogin()
{
buttonLogin.click();
}

public boolean verifyLinkForgotPassword()
{
return lnkForgotPassword.isDisplayed();
}

}


