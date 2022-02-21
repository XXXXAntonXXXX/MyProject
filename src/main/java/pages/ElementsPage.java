package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends ParentPage {
    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickButtonTextBox() {
        try {
            webDriver.findElement(By.xpath("//li[@id='item-0']")).click();
            logger.info("Button TextBox was clicked");
        } catch (Exception e) {

        }
    }
}
