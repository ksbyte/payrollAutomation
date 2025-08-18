package com.dataprovider;

import com.pay360.home;
import com.utils.ExcelUtils;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginCredentialsTest extends home {

    By usernameField = By.cssSelector("input.p-inputtext[autocomplete='email']");
    By passwordField = By.cssSelector("input.p-inputtext[type='password']");
    By loginButton   = By.cssSelector("button[type='submit']");

    @DataProvider(name = "LoginData")
    public Object[][] dataprovider() throws IOException {
        String filepath = "C:\\Users\\Admin\\IdeaProjects\\payrollAutomation\\src\\test\\resources\\TestData.xlsx";
        return ExcelUtils.getExcelData(filepath, "Sheet1");
    }

    @Test(dataProvider = "LoginData")
    public void validLogin(String username, String password) throws InterruptedException {
        // Always navigate to login page before each attempt
        driver.get("https://pay360.hostbooks.in/auth/login");

        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();

        Thread.sleep(2000); // just for demo
        System.out.println("Logged in with: " + username);
    }
}
