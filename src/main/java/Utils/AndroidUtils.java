/*
project: Appium Java Project
create by : Johnathan Esguerra Cortes
position : QA Automation Senior
Date : 24/01/2020
description: Utility class
 */
package Utils;

import ClassModel.Environment;
import ClassModel.Usuarios;
import PageObject.FormularioPrincipal;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class AndroidUtils {
    public AppiumDriver<WebElement> driver;
    WebDriverWait wait;

    public void setUp(Environment environment) throws MalformedURLException {
        // Created object of DesiredCapabilities class.

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", environment.getDeviceName());
        cap.setCapability("app", environment.getApp());
        cap.setCapability("platformName", environment.getPlatformName());
        cap.setCapability("appPackage", environment.getAppPackage());
        cap.setCapability("version", environment.getVersion());
        cap.setCapability("udid", environment.getUdid());
        cap.setCapability("noReset", environment.getReset());

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        wait = new WebDriverWait(driver, FormularioPrincipal.TiempoEspera);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(FormularioPrincipal.ButtonLocatorId)));
    }

    public Environment EnvironmentTest(String os) {
        Environment newEnvironment = null;
        String errorMessage = "El nombre del sistema operativo no existe en el archivo de propiedades";
        Map<String, Environment> map = new HashMap<String, Environment>();
        map.put("iOS", new Environment("iOS", "C:\\ApkTest\\iOS.apk", "iOS", "TestiOS", "13.3", "Iphone de jesguerra", "true"));
        map.put("Android", new Environment("Android", "C:\\ApkTest\\AppTest.apk", "Android", "io.selendroid.testapp", "8.0", "emulator-5554", "true"));

        for (String environmentProperties : map.keySet()) {
            Environment environment = map.get(os);
            if (!(environment == null)) {
                newEnvironment = environment;
                break;
            }
            else {
                System.out.println(errorMessage);
            }
        }
        return newEnvironment;
    }

    public Usuarios User(String usuario) {
        Usuarios newUsuario = null;
        String errorMessage = "El nombre de usuario no existe en el archivo de propiedades";
        Map<String, Usuarios> map = new HashMap<String, Usuarios>();
        map.put("Johnathan", new Usuarios("Jesguerra", "jesguerra@hotmail.es", "1234", "Johnathan Esguerra"));
        map.put("Pepito", new Usuarios("Pperez", "perez@hotmail.es", "4567", "Pepito Perez"));
        map.put("Alejo", new Usuarios("Aperez", "Aperez@hotmail.es", "87654", "Alejo Perez"));
        map.put("Pacho", new Usuarios("Paperez", "Paperez@hotmail.es", "34521", "Pacho Perez"));

        for (String nombre : map.keySet()) {
            Usuarios usuarios = map.get(usuario);
            if (!(usuarios == null)) {
                newUsuario = usuarios;
                break;
            } else {
                System.out.println(errorMessage);
            }
        }
        return newUsuario;
    }
}
