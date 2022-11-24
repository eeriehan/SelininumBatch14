package com.Syntax.Class11_Test;

import com.Syntax.Class11_Pages.loginPageWithPageFactory;
import com.Syntax.Class11_Utils.CommonMethods;

public class loginPageTestWithPageFactory {
    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
                loginPageWithPageFactory login =new loginPageWithPageFactory();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginBtn.click();



    }

}
