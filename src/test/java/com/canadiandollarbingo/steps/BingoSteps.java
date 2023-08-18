package com.canadiandollarbingo.steps;

import com.canadiandollarbingo.pages.BingoPage;
import com.canadiandollarbingo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BingoSteps {
    String actualBingoText;

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I am mouse hover on game$")
    public void iAmMouseHoverOnGame() {
        new HomePage().mouseHoverOnGame();
    }

    @And("^I am click on Bingo$")
    public void iAmClickOnBingo() {
        new HomePage().clickOnBingo();
    }

    @Then("^I should see 'Bingo' text$")
    public void iShouldSeeBingoText() {
        actualBingoText = new BingoPage().getBingoText();
        Assert.assertEquals("Bingo", actualBingoText,"Bingo Text is not displayed");
    }
}
