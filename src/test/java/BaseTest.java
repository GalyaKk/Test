import Base.BasePage;
import Utils.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void openBrowser(){
        Browser.openBrowser();
    }

    @AfterTest
    public void closeBrowser(){
      //  Browser.closeBrowser();
    }
}
