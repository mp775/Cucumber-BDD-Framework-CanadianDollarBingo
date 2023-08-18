package com.canadiandollarbingo.pages;

import com.canadiandollarbingo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BankingPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankingPage.class.getName());

    public BankingPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//div[@class='content-img']/div")
    List<WebElement> listOfPaymentOption;


    public int getTotalNumberOfPaymentOption(){
        return getSizeOfElement(listOfPaymentOption);

    }
}

