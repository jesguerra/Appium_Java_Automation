package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    private static AppiumDriver  driver = null;

    public TestBase() {
    }

    public static AppiumDriver getInstance() throws MalformedURLException {
        if ( driver== null){
            DesiredCapabilities cap = new DesiredCapabilities();
            driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        }
        return driver;
    }
}
