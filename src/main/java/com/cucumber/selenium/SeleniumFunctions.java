package com.cucumber.selenium;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions {

public static WebDriver driver = null;
public static WebDriverWait waitVar = null;

public static String baseURL = "https://github.com/";

public void createDriver() throws MalformedURLException,
InterruptedException {

driver = new FirefoxDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

driver.get(baseURL);

waitVar = new WebDriverWait(driver, 15);
}

public void teardown() {
driver.quit();
}

public void ishomepageDisplayed() throws InterruptedException {
waitVar.until(ExpectedConditions.presenceOfElementLocated(By
.linkText("Sign in")));

driver.findElement(By.linkText("Sign in")).isDisplayed();
driver.findElement(By.linkText("Sign up")).isDisplayed();

//vuser[login]

driver.findElement(By.id("user[login]")).sendKeys("abcd");
Thread.sleep(4000);

//driver.findElement(By.className("marketing-section-signup"))
//.isDisplayed();
}

public void clickSigninLink() {
driver.findElement(By.linkText("Sign in")).click();
//String s1=driver.findElement(By.xpath("sdfsd")).getText();
}

public void isloginsectionDisplayed() {
waitVar.until(ExpectedConditions.presenceOfElementLocated(By
.className("auth-form-body")));
waitVar.until(ExpectedConditions.presenceOfElementLocated(By
.name("commit")));
}

}