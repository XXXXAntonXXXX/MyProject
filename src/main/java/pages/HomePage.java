package pages;





import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage{
    @FindBy(xpath ="//*[@id='app']/div/div/div[2]/div/div[6]/div")// ".//div[@id='app']/div/div/div[2]/div/div[6]")
    private WebElement buttonBookStoreApplication;
    @FindBy(xpath = ".//div[@id='app']/div/div/div[2]/div/div[1]")
    private WebElement buttonElements;
//.//h5[text()='Book Store Application']
//.//span[text()='Login']
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
      waitElementToBeHide();
    clickOnElement(buttonBookStoreApplication);
}
protected void waitElementToBeHide(){
        //TODO
    try {Thread.sleep(10000);
    }catch (InterruptedException e){
        e.printStackTrace();
    }
}

    public void clickOnButtonElements(){
        clickOnElement(buttonElements);
    }
}
