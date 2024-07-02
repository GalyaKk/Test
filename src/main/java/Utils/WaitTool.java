package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTool extends Browser{

    private static WebDriverWait wait = new WebDriverWait(Browser.getDriver(), Duration.ofSeconds(3));

    public static void waitUntilVisibilityOfElement(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }



}
