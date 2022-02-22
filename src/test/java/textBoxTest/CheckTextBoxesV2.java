package textBoxTest;

import baseTest.BaseTest;
import org.junit.Test;

public class CheckTextBoxesV2 extends BaseTest {
    @Test
    public void enterTextInFieldsCorrectValues(){
homePage.openHomePage();
homePage.clickOnButtonElements();
elementsPage.checkIsButtonTextBoxVisible();
elementsPage.clickButtonTextBox();
textBoxPage.checkIsButtonSubmitDisplayed();
textBoxPage.enterTextInToFieldFullName();
textBoxPage.enterTextInToFieldEmail();
textBoxPage.enterTextInToFieldCurrentAddress();
textBoxPage.enterTextInToFieldPermanentAddress();
textBoxPage.clickOnButtonSubmit();
textBoxPage.checkCorrectTextName();
    }

}
