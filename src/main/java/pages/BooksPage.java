package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BooksPage extends ParentPage{
    public BooksPage(WebDriver webDriver) {
        super(webDriver);
    }
public void clickOnButtonLogin(){
        try {
            webDriver.findElement(By.xpath(".//button[@id='login']")).click();
            logger.info(" Button Login was clicked");
        }catch (Exception e){

        }
}
}
