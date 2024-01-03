package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnElementAfterWait(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public Boolean isElementPresent(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

}
