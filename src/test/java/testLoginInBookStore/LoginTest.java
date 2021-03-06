package testLoginInBookStore;

import baseTest.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginInBookStore(){
        homePage.openHomePage();
        homePage.clickOnButtonBookStoreApplication();
        booksPage.checkIsButtonLoginIsDisplayed();
        booksPage.clickOnButtonLogin();
        loginPageInBookStore.checkTransitionToLoginPageInBookStore()
                            .loginWithValidCredOnBookStore()
                            .checkIsButtonLogOutIsDisplayed();
  }
}
