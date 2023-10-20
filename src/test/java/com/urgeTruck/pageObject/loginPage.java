package com.urgeTruck.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    WebDriver ldriver;

    public loginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(name = "Username")
    @CacheLookup
    WebElement txtUsername;

    @FindBy(name = "UserPassword")
    @CacheLookup
    WebElement txtUserPassword;

    @FindBy(id = "login-btn")
    @CacheLookup
    WebElement btnSubmit;

    public void setUsername(String uName) {
        txtUsername.sendKeys(uName);
    }

    public void setUserPassword(String uPassword) {
        txtUserPassword.sendKeys(uPassword);
    }

    public void clickSubmit() {
        btnSubmit.click();
    }
}
