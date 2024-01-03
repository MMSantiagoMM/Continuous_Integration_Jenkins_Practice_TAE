package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YouTubePage extends BasePage{
    public YouTubePage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }

    @FindBy(css = "#search-input #search")
    WebElement inputSearch;

    @FindBy(id = "search-icon-legacy")
    WebElement searchButton;

    @FindBy(css = "#channel-title ")
    WebElement textChannelGlobant;


    public void sendText(String text){
        inputSearch.sendKeys(text);
    }

    public void clickSearchButton(){
        this.clickOnElementAfterWait(searchButton);
    }

    public String getTextChannel(){
        this.isElementPresent(textChannelGlobant);
        return textChannelGlobant.getText();
    }

}
