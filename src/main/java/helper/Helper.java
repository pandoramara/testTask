package helper;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.MainPage;

public class Helper {

    public WebDriver driver;

    public Helper(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:chromedriver.exe");
        driver = new ChromeDriver();
        PageFactory.initElements(driver, MainPage.class);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @After
    public void after(){
        driver.quit();
    }
}
