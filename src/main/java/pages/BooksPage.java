package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends ParentPage{
    @FindBy(xpath = ".//button[@id='login']")
    private WebElement buttonLogin;

    public BooksPage(WebDriver webDriver) {
        super(webDriver);
    }
public void clickOnButtonLogin(){
      clickOnElement(buttonLogin);
}
public void checkIsButtonLoginIsDisplayed(){
      isElementDisplayed(buttonLogin);
    }
}
