package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageInBookStore extends ParentPage{

    public LoginPageInBookStore(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterLoginIntoUserNameField(String login) {
        try {webDriver.findElement(By.xpath(".//input[@placeholder='UserName']")).clear();
webDriver.findElement(By.xpath(".//input[@placeholder='UserName']")).sendKeys(login);
        logger.info(login+"  was inputted into UserName  ");
        }catch (Exception e){
            printErrorAndStopTest();
        }
    }
public void enterPasswordInToPasswordField(String password){
        try {
            webDriver.findElement(By.xpath(".//input[@placeholder='Password']")).clear();
            webDriver.findElement(By.xpath(".//input[@placeholder='Password']")).sendKeys(password);
            logger.info(password + "  was inputted into Password  ");
        }catch (Exception e){
            printErrorAndStopTest();
        }
}
    public void clickOnButtonLogin(){
        try{webDriver.findElement(By.xpath(".//button[@id='login']")).click();
        logger.info("button login was clicked");
    }catch (Exception e){
            printErrorAndStopTest();
        }
    }

    private void printErrorAndStopTest() {
        logger.error("Can not work with element");
        Assert.fail("Can not work with element");
    }


}
