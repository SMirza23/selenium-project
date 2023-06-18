package com.cydeo.tests.review.week3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class HardvsSoft_Assertion {

    // 1. Open Chrome browser
    // 2. Go to https://practice.cydeo.com/login
    // 3. Enter username: "tomsmith"
    // 4. Enter password: "SuperSecretPassword"
    // 5. Click to Login button
    // 6. Verify text displayed on page
    //    Expected: "You logged into a secure area!"

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Go to https://practice.cydeo.com/login
        driver.get("https://practice.cydeo.com/login");

    }


}
