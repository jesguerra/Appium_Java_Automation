/*
project: Appium Java Project
create by : Johnathan Esguerra Cortes
position : QA Automation Senior
Date : 24/01/2019
description: Define test Steps
 */
package PageObject;

import org.openqa.selenium.By;

public class VerificarUsuario {
    //region  Elements locators
    public static String NameData = "io.selendroid.testapp:id/label_name_data";
    public static By NameDataElement = By.id(NameData);
    public static String UserNameData = "io.selendroid.testapp:id/label_username_data";
    public static By UserDataElement = By.id(UserNameData);
    public static String PasswordData = "io.selendroid.testapp:id/label_password_data";
    public static By PasswordDataElement = By.id(PasswordData);
    public static String EmailData = "io.selendroid.testapp:id/label_email_data";
    public static By EmailDataElement = By.id(EmailData);
    public static String ProgrammingData = "io.selendroid.testapp:id/label_preferedProgrammingLanguage_data";
    public static By ProgrammingDataElement = By.id(ProgrammingData);
    public static String AcceptanData = "io.selendroid.testapp:id/label_acceptAdds_data";
    public static By AcceptanDataElement = By.id(AcceptanData);
    public static String RegisterUserButton = "io.selendroid.testapp:id/buttonRegisterUser";
    public static By RegisterUserButtonElement = By.id(RegisterUserButton);
//endregion
    //region Expected Elements
    public  static String NameTextExpected = "Johnathan Esguerra";
    public  static String UserNameTextExpected = "Jesguerra";
    public  static String PasswordTextExpected = "1234";
    public  static String EmailTextExpected = "jesguerra@hotmail.es";
    public  static String ProgrammingLenguageTextExpected = "Java";
    public  static String AcceptanTextExpected = "true";
    //endregion
}
