import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.MainPage;
import page.SearchPage;

public class MainTest {

    @Test
    public void RequestInSearchList(){

        WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        SearchPage searchPage = new SearchPage(driver);

        String url = "https://www.google.com";
        String searchRequest = "Selenium IDE export to C#";
        String textToFound = "Selenium IDE";

        mainPage.driver.get(url);
        mainPage.fillSearchField(searchRequest).clickSearch();
        String textResult = searchPage.getTextFromSearchResult("4");
        Assert.assertTrue(textResult.contains(textToFound));
    }
}
