package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }
    public static void openBrowser(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    public static void closeBrowser(){
        driver.quit();
    }


}
