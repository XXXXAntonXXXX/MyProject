package pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends ParentPage {
    @FindBy(xpath = ".//li[@id='item-0']")
    private WebElement buttonTextBox;
    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickButtonTextBox() {
      clickOnElement(buttonTextBox);
    }

public void checkIsButtonTextBoxVisible(){
        isElementDisplayed(buttonTextBox);
}
}
