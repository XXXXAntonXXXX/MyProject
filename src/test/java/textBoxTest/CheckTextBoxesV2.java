package textBoxTest;

import baseTest.BaseTest;
import org.junit.Test;

public class CheckTextBoxesV2 extends BaseTest {
    @Test
    public void enterTextInFieldsCorrectValues(){
homePage.openHomePage();
loginPageInBookStore.enterLoginIntoUserNameField("tosh12345678TOSH!");
loginPageInBookStore.enterPasswordInToPasswordField("tosh12345678TOSH!");
loginPageInBookStore.clickOnButtonLogin();
    }

}
