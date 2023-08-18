package com.canadiandollarbingo.steps;

import com.canadiandollarbingo.pages.BankingPage;
import com.canadiandollarbingo.pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BankingSteps {
    int actualNumberOfPaymentOption;

    @When("^I am click on Banking$")
    public void iAmClickOnBanking() {
        new HomePage().clickOnBankingTab();
    }


    @Then("^I verify list of payment option$")
    public void iVerifyListOfPaymentOption() {
        actualNumberOfPaymentOption = new BankingPage().getTotalNumberOfPaymentOption();
        System.out.println("Total payment option :" + actualNumberOfPaymentOption);
        Assert.assertTrue(actualNumberOfPaymentOption == 11,"Expected payment option is not displayed");

    }
}
