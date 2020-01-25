/*
project: Appium Java Project
create by : Johnathan Esguerra Cortes
position : QA Automation Senior
Date : 24/01/2020
description: Commont Methods class
 */
package Utils;

import PageObject.FormularioPrincipal;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public abstract class CommonMethods {

    public AppiumDriver<WebElement> driver;

    public CommonMethods() throws MalformedURLException {
        this.driver = TestBase.getInstance();
    }

    public WebElement SearchElement(By element) {
        return driver.findElement(element);
    }

    public void Click(WebElement element) {
        String errorMessage = "No fue posible hacer click en el elemento recibido";
        try {
            element.click();
        } catch (Exception e) {
            System.out.println(errorMessage + e);
        }
    }

    public void EnterText(WebElement element, String text) {
        String errorMessage = "No fue posible ubicar el elemento";
        try {
            element.clear();
            element.sendKeys(text);
        } catch (Exception e) {
            System.out.println(errorMessage + e);
        }
    }

    public List<String> GetProgramingLenguagesElements(By elementList) {

        List<WebElement> progrogramingLenguage = driver.findElements
                (FormularioPrincipal.ProgramingLengugeElements);
        List<String> newProgramingLenguageList = new ArrayList<String>();

        for (int i = 0; i < progrogramingLenguage.size(); i++) {
            String elements = progrogramingLenguage.get(i).getText();
            newProgramingLenguageList.add(elements);
        }
        return newProgramingLenguageList;
    }

    public String GetElementText(By element) {
        String elementText = null;
        try {
            WebElement webElement = SearchElement(element);
            elementText = webElement.getText();
        } catch (Exception e) {
            String errorMessage = "This element not contains text value";
            System.out.println(errorMessage + e);
        }
        return elementText;
    }

    public void HideKeyBoard() {
        String errorMessage = "The Hide keyboard action is nos possible";
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
            System.out.println(errorMessage + e);
        }
    }
}
