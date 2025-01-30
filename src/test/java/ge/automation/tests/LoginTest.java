package ge.automation.tests;

import ge.automation.BaseTest;
import ge.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {




    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL არ ემთხვევა");



    }
        @Test

        public void testAppLogoFontSize(){

        LoginPage loginPage = new LoginPage(driver);
        String expectedSize = "24px";
        String actualSize = loginPage.getAppLogoSize();
        Assert.assertEquals(actualSize, expectedSize, "ზომა არ ემთხვევა");
    }
    }















