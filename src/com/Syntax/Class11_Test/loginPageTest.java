package com.Syntax.Class11_Test;

import com.Syntax.Class11_Utils.CommonMethods;
import com.Syntax.Class11_Pages.loginPage;

public class loginPageTest {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        loginPage login = new loginPage();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();
    }
}
