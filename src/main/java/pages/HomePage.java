package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage{
    @FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[6]")
    private WebElement ButtonBookStoreApplication;
//.//h5[text()='Book Store Application']
//    // .//span[text()='Login']
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
public  void openHomePage(){
        try{
webDriver.get("https://demoqa.com/");
logger.info("Home page was opened");
        }catch (Exception e){
            logger.error("Can not open home page" + e);
            Assert.fail("Can not open home page" + e);
        }
}

public void clickOnButtonBookStoreApplication(){
        try {
            ButtonBookStoreApplication.clear();
            logger.info("Button Book Store Application was clicked");
        }catch (Exception e){
printErrorAndStopTest();
        }
}
    private void printErrorAndStopTest() {
        logger.error("Can not work with element");
        Assert.fail("Can not work with element");
    }
    public void clickOnButtonElements(){
        try {
            webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click();
            logger.info("Button Book Store Application was clicked");
        }catch (Exception e){
            printErrorAndStopTest();
        }
    }
}
