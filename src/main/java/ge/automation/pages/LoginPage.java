package ge.automation.pages;

import ge.automation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);

    }

   @FindBy(id = "user-name")
    WebElement usernameField;

   @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;

   @FindBy(className = "login_logo")
    WebElement swagLabs;



    public void login(String username, String password) {


        enterText(usernameField, username);
        enterText(passwordField, password);
        clickToElementWithWait(loginButton);


    }
    public String getAppLogoSize(){
        return getCssValue(swagLabs, "font-size");

    }

}
