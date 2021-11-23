package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="signin_button")
    WebElement signButton;

    @FindBy (id ="user_login")
    WebElement userName;

    @FindBy (id ="user_password")
    WebElement password;

    @FindBy (name ="submit" )
    WebElement signIn;

    @FindBy(id = "primary-button")
    WebElement backToSafety;

    public void login(String userNamestr, String passwordStr){
        signButton.click();
        userName.sendKeys(userNamestr);
        password.sendKeys(passwordStr);
        signIn.click();
        backToSafety.click();

    }

}
