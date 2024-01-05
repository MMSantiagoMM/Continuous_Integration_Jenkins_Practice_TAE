package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseTest{



    @Test
    public void testApplications() throws InterruptedException {
        String globant = "Globant";
        String beKind = "Be kind";
        //String variable = System.getenv("variable");
        String variable = "1";

        switch (variable){
            case "1" -> {
                getGlobantPage();
                Assert.assertEquals(globantPage.getTextGlobantWebSite(),beKind);
            }
            case "2" -> {
                getYouTubePage();
                youTubePage.sendText(globant);
                youTubePage.clickSearchButton();
                Assert.assertEquals(youTubePage.getTextChannel(),globant);
            }
            case "3" -> {
                getWikiPediaPage();
                wikiPediaPage.sendText(globant);
                wikiPediaPage.clickButton();
                Assert.assertEquals(wikiPediaPage.getText(),globant);
            }
            default -> System.out.println("Enter a valid option");
        }

    }

}
