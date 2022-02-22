package pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends ParentPage{
    @FindBy(xpath = ".//button[@id='submit'and text()='Log out']")
    private WebElement buttonLogOut;
    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
    }
    public boolean isButtonLogOutIsDisplayed(){
        try{
            return buttonLogOut.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
public ProfilePage checkIsButtonLogOutIsDisplayed(){
    Assert.assertTrue("Button LogOut is not displayed",isButtonLogOutIsDisplayed());
return this;
    }
}
