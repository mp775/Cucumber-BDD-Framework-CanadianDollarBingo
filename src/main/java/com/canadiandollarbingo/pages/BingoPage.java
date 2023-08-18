package com.canadiandollarbingo.pages;

import com.canadiandollarbingo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingoPage extends Utility {
    private static final Logger log = LogManager.getLogger(BingoPage.class.getName());

    public BingoPage() {
        PageFactory.initElements(driver, this);
    }

        @CacheLookup
                @FindBy(xpath = "//h1[normalize-space()='Bingo']")
        WebElement bingoText;

    public String getBingoText(){
        return getTextFromElement(bingoText);
    }
}