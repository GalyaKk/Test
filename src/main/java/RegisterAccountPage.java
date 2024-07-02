import Base.BasePage;
import Utils.WaitTool;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

public class RegisterAccountPage extends BasePage {
    private static final By FIRSTNAME_INPUTFIELD = By.cssSelector("#input-firstname");
    private static final By LASTNAME_INPUTFIELD = By.cssSelector("#input-lastname");
    private static final By EMAIL_INPUTFIELD = By.cssSelector("#input-email");
    private static final By TELEPHONE_INPUTFIELD = By.cssSelector("#input-telephone");
    private static final By PASSWORD_INPUTFIELD = By.cssSelector("#input-password");
    private static final By PASSWORD_CONFIRM_INPUTFIELD = By.cssSelector("#input-confirm");
    private static String password = "123456";
    private static final By PRIVACY_CHECKBOX = By.xpath("//a[@class='agree']/following::input[@type='checkbox']");
    private static final By CONTINUE_BUTTON = By.xpath("//a[@class='agree']/following::input[@class='btn btn-primary']");
    private static final By NEW_ACCOUNT_CONFIRMATION_MESSAGE = By.cssSelector("#content>h1");

    private static String createEmail(){
        String emailUsername = RandomStringUtils.randomAlphanumeric(10);
        String emailDomain = RandomStringUtils.randomAlphabetic(5);
        return emailUsername + "@" + emailDomain + ".com";
    }
    public static void writeTextInFirstnameField(){
        WaitTool.waitUntilVisibilityOfElement(FIRSTNAME_INPUTFIELD);
        RegisterAccountPage.writeTextInField(FIRSTNAME_INPUTFIELD, "galya");
    }
    public static void writeTextInLastnameField(){
        RegisterAccountPage.writeTextInField(LASTNAME_INPUTFIELD, "k");
    }
    public static void writeTextInEmailField(){
        RegisterAccountPage.writeTextInField(EMAIL_INPUTFIELD, RegisterAccountPage.createEmail());
    }
    public static void writeTextInTelephoneField(){
        RegisterAccountPage.writeTextInField(TELEPHONE_INPUTFIELD, RandomStringUtils.randomNumeric(10));
    }
    public static void writeTextInPasswordField(){
        RegisterAccountPage.writeTextInField(PASSWORD_INPUTFIELD, RegisterAccountPage.password);
    }
    public static void writeTextInConfirmPasswordField(){
        RegisterAccountPage.writeTextInField(PASSWORD_CONFIRM_INPUTFIELD, RegisterAccountPage.password);
    }
    public static void selectPrivacyCheckbox(){
        RegisterAccountPage.clickOnWebElement(PRIVACY_CHECKBOX);
    }
    public static void clickContinueButton(){
        RegisterAccountPage.clickOnWebElement(CONTINUE_BUTTON);
    }
    public static String getTextFromNewAccountSuccessMessage(){
        WaitTool.waitUntilVisibilityOfElement(NEW_ACCOUNT_CONFIRMATION_MESSAGE);
        return RegisterAccountPage.getTextFromWebElement(NEW_ACCOUNT_CONFIRMATION_MESSAGE);
    }
}
