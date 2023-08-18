package com.canadiandollarbingo.pages;

import com.canadiandollarbingo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='games']")
    WebElement game;

    @CacheLookup
    @FindBy(linkText = "Bingo")
    WebElement bingo;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Banking')]")
    WebElement banking;



    public void mouseHoverOnGame() {
        mouseHoverToElement(game);
        log.info("Mouse hover on game : " + game.toString());
    }

    public void clickOnBingo() {
        clickOnElement(bingo);
        log.info("Click on bingo : " + bingo.toString());
    }
    public void clickOnBankingTab(){
        clickOnElement(banking);
        log.info("Click on banking : " + banking.toString());
    }

}
