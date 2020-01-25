package stepDefinition;/*
project: Appium Java Project
create by : Johnathan Esguerra Cortes
position : QA Automation Senior
Date : 24/01/2019
description: Define test Steps
 */

import ClassModel.Environment;
import ClassModel.Usuarios;
import PageObject.FormularioPrincipal;
import PageObject.VerificarUsuario;
import Utils.AndroidUtils;
import Utils.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class Steps extends CommonMethods {
    Usuarios nombreDeUsuarioActivo = null;
    String username = null;
    Environment environment = null;
    WebDriverWait wait;

    public Steps() throws MalformedURLException {
    }

    @Given("^el usuario (.*) es un usuario activo que quiere registrarse en la app en el sistema Operativo (.*)$")
    public void johnathanEsUnUsuarioActivo(String name, String os) throws MalformedURLException {
        AndroidUtils getUser = new AndroidUtils();
        environment = getUser.EnvironmentTest(os);
        getUser.setUp(environment);
        nombreDeUsuarioActivo = getUser.User(name);
        username = nombreDeUsuarioActivo.getUsername();
    }

    @When("el ingresa los datos solicitados para el registro")
    public void elIngresaLosDatosSolicitadosParaElRegistro() {
        WebElement StartRegisterButton = SearchElement(FormularioPrincipal.StartRegisterButton);
        Click(StartRegisterButton);

        wait = new WebDriverWait(driver, FormularioPrincipal.TiempoEspera);
        wait.until(ExpectedConditions.visibilityOfElementLocated(FormularioPrincipal.UserElement));

        WebElement userName = SearchElement(FormularioPrincipal.UserElement);
        EnterText(userName, username);

        WebElement email = SearchElement(FormularioPrincipal.EmailElement);
        EnterText(email, nombreDeUsuarioActivo.getEmail());

        WebElement password = SearchElement(FormularioPrincipal.PasswordElement);
        EnterText(password, nombreDeUsuarioActivo.getPassword());

        WebElement name = SearchElement(FormularioPrincipal.NameElement);
        EnterText(name, nombreDeUsuarioActivo.getName());
        HideKeyBoard();

        WebElement programingLenguage = SearchElement(FormularioPrincipal.ProgramingLenguajeElement);
        Click(programingLenguage);

        wait.until(ExpectedConditions.visibilityOfElementLocated(FormularioPrincipal.ProgramingLengugeTitleElement));
        List<String> compareList = GetProgramingLenguagesElements(FormularioPrincipal.ProgramingLengugeElements);

        assertThat("Validate web elements of programing Lenguage list", compareList, equalTo
                (FormularioPrincipal.programingLenguageExpectedList));
        List<WebElement> javaProgramingOption = driver.findElements(FormularioPrincipal.ProgramingLengugeElements);

        WebElement javaPrograming = javaProgramingOption.get(5);
        javaPrograming.click();

        WebElement acceptAddsCheck = SearchElement(FormularioPrincipal.CheckBoxAcceptElement);
        Click(acceptAddsCheck);

        WebElement RegisterButton = SearchElement(FormularioPrincipal.ButtonRegisterUserElement);
        Click(RegisterButton);
    }

    @Then("el debe obtener el resumen del registro de usuario con los datos correctos (.*) (.*) (.*) (.*)")
    public void elDebeObtenerElResumenDelRegistroDeUsuarioConLosDatosCorrectos(String fullName,String userName,String password,String email) {

        wait = new WebDriverWait(driver, FormularioPrincipal.TiempoEspera);
        wait.until(ExpectedConditions.visibilityOfElementLocated(VerificarUsuario.RegisterUserButtonElement));

        String NameText = GetElementText(VerificarUsuario.NameDataElement);
        assertThat("Validate Name text is visible and correct Data",NameText,equalTo
                (fullName));

        String UserNameText = GetElementText(VerificarUsuario.UserDataElement);
        assertThat("Validate UserName text is visible and correct Data",UserNameText,equalTo
                (userName));

        String PasswordText = GetElementText(VerificarUsuario.PasswordDataElement);
        assertThat("Validate Password text is visible and correct Data",PasswordText,equalTo
                (password));

        String EmailText = GetElementText(VerificarUsuario.EmailDataElement);
        assertThat("Validate Email text is visible and correct Data",EmailText,equalTo
                (email));

        String ProgrammingLenguageText = GetElementText(VerificarUsuario.ProgrammingDataElement);
        assertThat("Validate Programming lenguage text is visible and correct Data",ProgrammingLenguageText,equalTo
                (VerificarUsuario.ProgrammingLenguageTextExpected));

        String AcceptanOptionText = GetElementText(VerificarUsuario.AcceptanDataElement);
        assertThat("Validate Acceptan Option text is visible and correct Data",AcceptanOptionText,equalTo
                (VerificarUsuario.AcceptanTextExpected));

        WebElement RegisterButtonElement = SearchElement(VerificarUsuario.RegisterUserButtonElement);
        Click(RegisterButtonElement);
    }
}