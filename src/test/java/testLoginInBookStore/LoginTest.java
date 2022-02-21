package testLoginInBookStore;

import baseTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginInBookStore(){
        homePage.openHomePage();
        homePage.clickOnButtonBookStoreApplication();
        booksPage.clickOnButtonLogin();
        loginPageInBookStore.enterLoginIntoUserNameField("tosh12345678TOSH!");
        loginPageInBookStore.enterPasswordInToPasswordField("tosh12345678TOSH!");
        loginPageInBookStore.clickOnButtonLogin();
        Assert.assertTrue("Button LogOut is not displayed", profilePage.isButtonLogOutIsDisplayed());
    }
}
