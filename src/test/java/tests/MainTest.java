package tests;

import org.testng.annotations.Test;

public class MainTest extends BaseTest{

    String text = "Globant";
    String envVariable = System.getenv("variable");

    @Test
    public void testApplications() throws InterruptedException {

        switch (envVariable){
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
