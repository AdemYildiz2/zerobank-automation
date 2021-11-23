package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class OnlineBanking extends BasePage {

    @FindBy(id = "account_summary_link")
    WebElement accountSummary;

    @FindBy(linkText = "Savings")
    WebElement savings;

    public void ClickaccountSummary(){
        accountSummary.click();
    }
    public void clickAccount(String s){
        savings.click();
    }
}
