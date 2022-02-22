package pages;

import libs.TestData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageInBookStore extends ParentPage{
    @FindBy(xpath = ".//input[@placeholder='UserName']")
    private WebElement userNameField;
    @FindBy(xpath = ".//input[@placeholder='Password']")
    private WebElement passwordField;
    @FindBy(xpath = ".//button[@id='login']")
    private WebElement buttonLogin;
    @FindBy(xpath = ".//div[@class='main-header' and text()='Login']")
    private WebElement textLogin;
    @FindBy(xpath = ".//p[@id='name' and text()='Invalid username or password!']")
    private WebElement errorMessageInvalidUsernameOrPassword;


    public LoginPageInBookStore(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterLoginIntoUserNameField(String login) {
   enterTextInToElement(userNameField,login);
    }
public void enterPasswordInToPasswordField(String password){
    enterTextInToElement(passwordField,password);
}
    public void clickOnButtonLogin(){
        clickOnElement(buttonLogin);
    }
public ProfilePage loginWithValidCredOnBookStore(){
        enterLoginIntoUserNameField(TestData.VALID_LOGIN);
        enterPasswordInToPasswordField(TestData.VALID_PASSWORD);
        clickOnButtonLogin();
        return new ProfilePage(webDriver);
}
public LoginPageInBookStore checkTransitionToLoginPageInBookStore(){
        isElementDisplayed(textLogin);
        return this;
}
    public void loginWithInValidCredOnBookStore(){
        enterLoginIntoUserNameField(TestData.INVALID_LOGIN);
        enterPasswordInToPasswordField(TestData.INVALID_PASSWORD);
        clickOnButtonLogin();

}
    public void checkErrorMessage(){
        isElementDisplayed(errorMessageInvalidUsernameOrPassword);

}
}
