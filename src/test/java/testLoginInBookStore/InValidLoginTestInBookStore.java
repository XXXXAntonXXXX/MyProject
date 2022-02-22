package testLoginInBookStore;

import baseTest.BaseTest;
import org.junit.Test;

public class InValidLoginTestInBookStore extends BaseTest {
    @Test
    public void invalidLogin(){
        homePage.openHomePage();
        homePage.clickOnButtonBookStoreApplication();
        booksPage.checkIsButtonLoginIsDisplayed();
        booksPage.clickOnButtonLogin();
        loginPageInBookStore.checkTransitionToLoginPageInBookStore()
                .loginWithInValidCredOnBookStore();
        loginPageInBookStore.checkErrorMessage();
    }
}
