package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends ParentPage{
    @FindBy(xpath = ".//input[@id='userName']")
    private WebElement fullNameField;
    @FindBy(xpath = ".//input[@id='userEmail']")
    private WebElement emailField;
    @FindBy(xpath = ".//textarea[@id='currentAddress']")
    private WebElement currentAddressField;
    @FindBy(xpath = ".//textarea[@id='permanentAddress']")
    private WebElement permanentAddressField;
    @FindBy(xpath = ".//button[@id='submit']")
    private WebElement submitButton;
    @FindBy(xpath = ".//*[text()='qwertyQWERTY12']") //".//p[@id='name'and contains(text()[2],'qwertyQWERTY')]  ")
    private WebElement fieldForCheck;
    public TextBoxPage(WebDriver webDriver) {
        super(webDriver);
    }
public void enterTextInToFieldFullName(){
        enterTextInToElement(fullNameField,"qwertyQWERTY12");
}
    public void enterTextInToFieldEmail(){
        enterTextInToElement(emailField,"qwerty@test.ss");
    }
    public void enterTextInToFieldCurrentAddress(){
        enterTextInToElement(currentAddressField,"qwertyQWERTY");
    }
    public void enterTextInToFieldPermanentAddress(){
        enterTextInToElement(permanentAddressField,"qwertyQWERTY");
    }
public void checkIsButtonSubmitDisplayed(){
        isElementDisplayed(submitButton);
}
    public void clickOnButtonSubmit(){
        clickOnElement(submitButton);
    }

    public void checkCorrectTextName() {
        String text = "Name:qwertyQWERTY12";
        Assert.assertEquals("Text correct ",text,fieldForCheck.getText());
    }
}
//    public ElementsPage checkTextInAlert(String text){
//        Assert.assertEquals("Text in alert ",text,веб елемент откуда взять текст--alertSuccess.getText());
//        return this;
//    }