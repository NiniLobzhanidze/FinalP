package ge.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.Utils;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }
    public void enterText(WebElement locator, String text){
        locator.sendKeys(text);
        Utils.log("მოვძებნე ელემენტი: [" + locator + " ] გადავეცი ტექსტი: " + text);


    }
    public void clickToElement(WebElement locator){
        locator.click();
        Utils.log("დავაკლიკე [" + locator + " ] ელემენტზე");

    }
    public void clickToElementWithWait(WebElement locator) {
        waitForElementToBeClickable(locator);
        clickToElement(locator);


    }
    public void waitForElementToBeClickable(WebElement locator){

        wait.until(ExpectedConditions.elementToBeClickable(locator));


    }

    public String getElementText(WebElement locator){
        waitForElementToBeVisible(locator);
        return locator.getText();

    }
    public void waitForElementToBeVisible(WebElement locator){

        wait.until(ExpectedConditions.visibilityOf(locator));

    }

    public String getCssValue(WebElement locator, String propertyName){
        waitForElementToBeVisible(locator);
        return locator.getCssValue(propertyName);



    }

}