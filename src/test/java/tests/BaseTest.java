package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

    @BeforeTest
    public void setBeforeTest(){
        driver = new ChromeDriver();
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
