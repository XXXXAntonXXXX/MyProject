package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BooksPage;
import pages.HomePage;
import pages.LoginPageInBookStore;
import pages.ProfilePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
protected HomePage homePage;
protected LoginPageInBookStore loginPageInBookStore;
protected ProfilePage profilePage;
protected BooksPage booksPage;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    logger.info("browser was opened");
    homePage = new HomePage(webDriver);
    loginPageInBookStore = new LoginPageInBookStore(webDriver);
    profilePage = new ProfilePage(webDriver);
    booksPage = new BooksPage(webDriver);
    }
    @After
    public void tearDown(){
        webDriver.quit();
        logger.info("browser was closed");
    }
}
