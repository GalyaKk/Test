import Base.BasePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public static void goToRegisterAccount(){
        HomePage.openHomePage();
        HomePage.clickOnMyAccountDropDown();
        HomePage.clickOnRegisterAccountButton();
    }
}
