package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class SearchPage {

    public WebDriver driver;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public String getTextFromSearchResult (String position) {
        String textFound = driver.findElement(By.xpath("//div[@class='g']["+position+"]//span[@class ='st']")).getText();
        return textFound;
    }
}
