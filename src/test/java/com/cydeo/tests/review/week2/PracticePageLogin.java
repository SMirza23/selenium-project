package com.cydeo.tests.review.week2;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PracticePageLogin {

    // TC#2: Practice page Login test

    // 1. Open Chrome browser
    // 2. Go to https://practice.cydeo.com/login
    // 3. Enter username: "tomsmith"
    // 4. Enter password: "SuperSecretPassword"
    // 5. Click to Login button
    // 6. Verify text displayed on page
    //    Expected: "You logged into a secure area!"

    public static void main(String[] args) {
        // 1. Open Chrome browser
        //WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Go to https://practice.cydeo.com/login
        driver.get("https://practice.cydeo.com/login");

        // 3. Enter username: "tomsmith"
        WebElement username1 = driver.findElement(By.name("username"));
        WebElement username2 = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement username3 = driver.findElement(By.cssSelector("input[name='username']"));

        // 4. Enter password: "SuperSecretPassword"



        // 5. Click to Login button


        // 6. Verify text displayed on page
        //    Expected: "You logged into a secure area!"
    }
}
