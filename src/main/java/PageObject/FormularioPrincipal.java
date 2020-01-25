/*
project: Appium Java Project
create by : Johnathan Esguerra Cortes
position : QA Automation Senior
Date : 24/01/2020
description: Page Object for test class
 */
package PageObject;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormularioPrincipal {

    public static long TiempoEspera = 10;
    //region localizadores de elementos
    public static String ButtonLocatorId = "io.selendroid.testapp:id/buttonTest";
    public static By FormButton = By.id(ButtonLocatorId);
    public static String StartRegisterButtonId = "io.selendroid.testapp:id/startUserRegistration";
    public static By StartRegisterButton = By.id(StartRegisterButtonId);
    public static String UserName = "io.selendroid.testapp:id/inputUsername";
    public static By UserElement = By.id(UserName);
    public static String Email = "io.selendroid.testapp:id/inputEmail";
    public static By EmailElement = By.id(Email);
    public static String Password = "io.selendroid.testapp:id/inputPassword";
    public static By PasswordElement = By.id(Password);
    public static String Name = "io.selendroid.testapp:id/inputName";
    public static By NameElement = By.id(Name);
    public static String ProgramingLenguajeLocator = "io.selendroid.testapp:id/input_preferedProgrammingLanguage";
    public static By ProgramingLenguajeElement = By.id(ProgramingLenguajeLocator);
    public static String CheckBoxAccept = "io.selendroid.testapp:id/input_adds";
    public static By CheckBoxAcceptElement = By.id(CheckBoxAccept);
    public static String ButtonRegisterUser = "io.selendroid.testapp:id/btnRegisterUser";
    public static By ButtonRegisterUserElement = By.id(ButtonRegisterUser);
    public static String ProgramaningLenguageLocator = "android:id/alertTitle";
    public static By ProgramingLengugeTitleElement = By.id(ProgramaningLenguageLocator);
    public static String ProgramingLenguagesLocator = "android.widget.CheckedTextView";
    public static By ProgramingLengugeElements = By.className(ProgramingLenguagesLocator);
    //endregion
    //region Expected Elements
    public static List<String> programingLenguageExpectedList = Arrays.asList("Ruby","PHP","Scala","Python","Javascript","Java","C++","C#");
    //endregion

}
