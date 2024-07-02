import Base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    
    private static final By MY_ACCOUNT_DROPDOWN = By.xpath("//i[@class='fa fa-user']/following-sibling::span");
    private static final By REGISTER_ACCOUNT_BUTTON = By.xpath("//i[@class='fa fa-user']/following::ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a");


    public static void openHomePage(){
         driver.get("https://shop.pragmatic.bg/");
     }
     public static void clickOnMyAccountDropDown(){
         HomePage.clickOnWebElement(MY_ACCOUNT_DROPDOWN);
     }
     public static void clickOnRegisterAccountButton(){
        HomePage.clickOnWebElement(REGISTER_ACCOUNT_BUTTON);
     }

}
