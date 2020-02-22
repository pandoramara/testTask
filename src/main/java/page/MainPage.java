package page;

import helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    public WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    int waitSec = 5;

    @FindBy(xpath = "//input[@class = 'gNO89b']")
    public WebElement searchButton;


    @FindBy(xpath = "//input[@class = 'gLFyf gsfi']")
    public WebElement searchField;



    public WebElement elementPresent(WebElement element, int sec) {
        WebDriverWait wait = new WebDriverWait(driver, sec);
        wait.withMessage(element + " is not found." + "\n");
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public MainPage fillSearchField(String request){
        WebElement element = elementPresent(searchField, waitSec);
        searchField.sendKeys(request);
        return new MainPage(driver);
    }

    public SearchPage clickSearch () {
        WebElement element = elementPresent(searchButton, waitSec);
        searchButton.click();
        return new SearchPage(driver);
    }











}
