package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import pages.GlobantPage;
import pages.WikiPediaPage;
import pages.YouTubePage;

public class BaseTest {

    WebDriver driver = null;
    GlobantPage globantPage;
    YouTubePage youTubePage;
    WikiPediaPage wikiPediaPage;

    String globantUrl = "https://www.globant.com/be-kind";
    String youTubeUrl= "https://www.youtube.com/";
    String wikipediaUrl = "https://es.wikipedia.org/wiki/Wikipedia:Portada";


    @BeforeTest
    public void setBeforeTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver(options);
        String driverPath="C:\\Users\\s.mosquera\\IdeaProjects\\TAE\\CI-practice\\src\\chromedriver";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();

        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
        //driver = new ChromeDriver(options);


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
