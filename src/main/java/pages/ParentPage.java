package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentPage {
    Logger logger = Logger.getLogger(getClass());
    WebDriver webDriver;
    WebDriverWait webDriverWait10;


    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
        webDriverWait10 = new WebDriverWait(webDriver,10);
    }

    protected void enterTextInToElement (WebElement webElement,String text){
        try {
            webDriverWait10.until(ExpectedConditions.visibilityOf(webElement));
webElement.clear();
webElement.sendKeys(text);
logger.info(text + "  was inputted  " );
        }catch (Exception e){
            printErrorAndStopTest(e);
        }
    }
protected void clickOnElement(WebElement webElement){
        try {
            webDriverWait10.until(ExpectedConditions.elementToBeClickable(webElement));
            webElement.click();
            logger.info("  Element was clicked  ");
        }catch (Exception e ){
            printErrorAndStopTest(e);
        }
}

    private void printErrorAndStopTest(Exception e) {
    logger.error("  Can not work with element  "+ e);
        Assert.fail("  Can not work with element  "+ e);
    }
    protected boolean isElementDisplayed(WebElement webElement) {
        try {
            webDriverWait10.until(ExpectedConditions.visibilityOf(webElement));
            boolean state = webElement.isDisplayed();
            if (state){
                logger.info("Element is displayed");
            }else {
                logger.info("Element is not displayed");
            }
            return state;
        } catch (Exception e){
            logger.info("Element is not displayed");
            return false;
        }
    }
}
