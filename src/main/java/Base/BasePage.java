package Base;

import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected static WebDriver driver;

    static {
        driver = Browser.getDriver();
    }
    public static void clickOnWebElement(By locator){
        driver.findElement(locator).click();
    }
    public static void writeTextInField(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }
    public static String getTextFromWebElement(By locator){
        return driver.findElement(locator).getText();
    }
}
