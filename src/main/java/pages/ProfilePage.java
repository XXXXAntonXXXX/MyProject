package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends ParentPage{
    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
    }
    public boolean isButtonLogOutIsDisplayed(){
        try{
            return webDriver.findElement(By.xpath(".//button[@id='submit'and text()='Log out']")).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
}
