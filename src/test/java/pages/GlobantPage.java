package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlobantPage extends BasePage{
    public GlobantPage(WebDriver driver,String url) {
        super(driver);
        driver.get(url);
    }

    @FindBy(css = ".globant-hero-heading h1")
    WebElement cookiesButton;

    public String getTextGlobantWebSite(){
        return cookiesButton.getText();
    }


}
