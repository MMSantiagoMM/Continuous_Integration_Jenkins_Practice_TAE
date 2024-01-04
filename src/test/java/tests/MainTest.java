package tests;

import org.testng.annotations.Test;

public class MainTest extends BaseTest{



    @Test
    public void testApplications() throws InterruptedException {
        String text = "Globant";
        String variable = System.getenv("variable");
        //getGlobantPage();
        //System.out.println(globantPage.getTextGlobantWebSite());

        switch (variable){
            case "1" -> {
                getGlobantPage();
                System.out.println(globantPage.getTextGlobantWebSite());
            }
            case "2" -> {
                getYouTubePage();
                youTubePage.sendText(text);
                youTubePage.clickSearchButton();
                System.out.println(youTubePage.getTextChannel());
            }
            case "3" -> {
                getWikiPediaPage();
                wikiPediaPage.sendText(text);
                wikiPediaPage.clickButton();
                System.out.println(wikiPediaPage.getText());
            }
            default -> System.out.println("Enter a valid option");
        }

    }

}
