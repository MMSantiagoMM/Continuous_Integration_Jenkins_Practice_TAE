package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import pages.GlobantPage;
import pages.WikiPediaPage;
import pages.YouTubePage;

public class BaseTest {

    WebDriver driver;
    GlobantPage globantPage;
    YouTubePage youTubePage;
    WikiPediaPage wikiPediaPage;

    String globantUrl = "https://www.globant.com/be-kind";
    String youTubeUrl= "https://www.youtube.com/";
    String wikipediaUrl = "https://es.wikipedia.org/wiki/Wikipedia:Portada";

    ChromeOptions options2 = new ChromeOptions();

    @BeforeTest
    public void setBeforeTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        //WebDriverManager.chromedriver().setup();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("disable-infobars");
        driver = new ChromeDriver(options);
    }



    public GlobantPage getGlobantPage(){
        return globantPage = new GlobantPage(driver,globantUrl);
    }

    public YouTubePage getYouTubePage(){
        return youTubePage = new YouTubePage(driver,youTubeUrl);
    }

    public WikiPediaPage getWikiPediaPage(){
        return wikiPediaPage = new WikiPediaPage(driver,wikipediaUrl);
    }


}
