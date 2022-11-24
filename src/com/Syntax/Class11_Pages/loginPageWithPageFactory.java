package com.Syntax.Class11_Pages;

import com.Syntax.Class11_Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageWithPageFactory extends CommonMethods {
    @FindBy(id = "txtUsername")
    public WebElement userNameField;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement passwordField;

    @FindBy(css = "input#btnLogin")
    public WebElement loginBtn;

    // Call the constructor to initialize all elements
    public loginPageWithPageFactory() {
        PageFactory.initElements(driver, this);

    }
}
