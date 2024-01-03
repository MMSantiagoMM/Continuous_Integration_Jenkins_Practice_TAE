package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikiPediaPage extends BasePage{
    public WikiPediaPage(WebDriver driver,String url) {
        super(driver);
        driver.get(url);
    }

    @FindBy(className = "cdx-text-input__input")
    WebElement inputSearch;

    @FindBy(css = ".cdx-button.cdx-search-input__end-button")
    WebElement searchButton;

    @FindBy(className = "mw-page-title-main")
    WebElement textFound;


    public void sendText(String url){
        inputSearch.sendKeys(url);
    }

    public void clickButton() throws InterruptedException {
        Thread.sleep(3000);
        searchButton.click();
    }

    public String getText(){
        return textFound.getText();
    }



}
