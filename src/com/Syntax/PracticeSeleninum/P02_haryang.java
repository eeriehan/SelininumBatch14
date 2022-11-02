package com.Syntax.PracticeSeleninum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_haryang {
    public static void main(String[] args) {
        String DRIVER_ID = "webdriver.chrome.driver";
        String DRIVER_PATH = "Drivers/chromedriver.exe";

        System.setProperty(DRIVER_ID, DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        String base_url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";
    //    driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

    }

}
