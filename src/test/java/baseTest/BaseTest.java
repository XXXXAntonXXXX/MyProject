package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
protected HomePage homePage;
protected LoginPageInBookStore loginPageInBookStore;
protected ProfilePage profilePage;
protected BooksPage booksPage;
protected ElementsPage elementsPage;
protected TextBoxPage textBoxPage;
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
    elementsPage = new ElementsPage(webDriver);
    textBoxPage = new TextBoxPage(webDriver);
    }
    @After
    public void tearDown(){
        webDriver.quit();
        logger.info("browser was closed");
    }
}
