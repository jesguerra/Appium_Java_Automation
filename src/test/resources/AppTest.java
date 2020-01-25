/*
project: Appium Java Project
create by : Johnathan Esguerra Cortes
position : QA Automation Senior
Date : 24/01/2020
description: Define test methods class
 */
package TestFeatures;

import Utils.AndroidUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class AppTest  {
    WebDriver driver;

    @Before
    public  void launchApp() throws MalformedURLException {
        //region Instance class
        AndroidUtils androidUtils;
        androidUtils = new AndroidUtils();
        //endregion
        androidUtils.setUp(); //Launch App
    }

    @Test
    public void RegistrarUsuario(){
        //region Instance class
        //endregion

        //driver.findElement (By.id("test"));
    }
    @After
    public  void CloseDriver(){
        driver.close();
        driver.quit();
    }
}
