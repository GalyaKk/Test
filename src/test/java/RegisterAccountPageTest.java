import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterAccountPageTest extends BaseTest{

    @Test
    public void registerNewAccount (){
        HomePageTest.goToRegisterAccount();
        RegisterAccountPage.waitUntilFirstnameFieldIsVisible();
        RegisterAccountPage.writeTextInFirstnameField();
        RegisterAccountPage.writeTextInLastnameField();
        RegisterAccountPage.writeTextInEmailField();
        RegisterAccountPage.writeTextInTelephoneField();
        RegisterAccountPage.writeTextInPasswordField();
        RegisterAccountPage.writeTextInConfirmPasswordField();
        RegisterAccountPage.selectPrivacyCheckbox();
        RegisterAccountPage.clickContinueButton();
        RegisterAccountPage.waitUntilConfirmationMessageIsVisble();
        Assert.assertEquals(RegisterAccountPage.getTextFromNewAccountSuccessMessage(), "Your Account Has Been Created!");
    }
}
