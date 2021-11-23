package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.pages.OnlineBanking;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActivityNavigationStepDefs {
    @Given("the user is logged in")
    public void the_user_is_logged_in() throws InterruptedException {

        Driver.get().get(ConfigurationReader.get("url"));

        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");

        Thread.sleep(2000);
        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);

    }

    @Given("the user clicks Online Banking")
    public void the_user_clicks_Online_Banking() throws InterruptedException {
        Thread.sleep(2000);
        OnlineBanking onlineBanking = new OnlineBanking();
        onlineBanking.ClickOnlineBanking();

    }

    @Given("the user clicks Account Summary")
    public void the_user_clicks_Account_Summary() throws InterruptedException {
        Thread.sleep(2000);
       OnlineBanking onlineBanking = new OnlineBanking();
       onlineBanking.ClickaccountSummary();
    }

    @When("the user clicks on {string} on the Account Summary page")
    public void the_user_clicks_on_on_the_Account_Summary_page(String savings) throws InterruptedException {
        Thread.sleep(3000);
       OnlineBanking onlineBanking = new OnlineBanking();
       onlineBanking.clickAccount(savings);




    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        System.out.println();
    }

    @Then("Account	drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {
        System.out.println();
    }


}
