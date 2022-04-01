package co.com.choucair.certification.reto.tecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Contenedordeobjetos extends PageObject {
    public static final Target BUTTON = Target.the("Click en el botón Join Today").located(By.cssSelector("body > ui-view > unauthenticated-container > div > div > unauthenticated-header > div > div.unauthenticated-nav-bar__links.navbar-right.hidden-sm.hidden-xs > ul:nth-child(2) > li:nth-child(2) > a"));
    public static final Target FIRSTNAME = Target.the("Campo Firt Name").located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("Campo Last Name").located(By.cssSelector("#lastName"));
    public static final Target EMAIL = Target.the("Campo Email").located(By.id("email"));
    public static final Target MONTH = Target.the("Campo Email").located(By.xpath("//option[@label='March'][@value='number:3']"));
    public static final Target DAY = Target.the("Campo Email").located(By.xpath("//option[@label='2'][@value='number:2']"));
    public static final Target YEAR = Target.the("Campo Email").located(By.xpath("//option[@label='2002'][@value='number:2002']"));
    public static final Target LENGUAGE = Target.the("Campo Email").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));
    public static final Target BUTTON_NEXT = Target.the("Botón Next").located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div.form-group.col-xs-12.text-right > a"));
    public static final Target CITY = Target.the("Campo Ciudad").located(By.cssSelector("#city"));
    public static final Target ZIPCODE = Target.the("Code").located(By.id("zip"));
    public static final Target BUTTON_NEXT_DEVICE = Target.the("Botón Next").located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div:nth-child(2) > div > a"));
    public static final Target BUTTON_LAST_STEP = Target.the("Botón Next last Step").located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > div:nth-child(2) > div > a"));
    public static final Target PASSWORD = Target.the("Creación de contraseña").located(By.id("password"));
    public static final Target PASSWORD_CONFIRM = Target.the("Confirmación de contraseña").located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS = Target.the("Casilla de verificación").located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div:nth-child(5) > label > span.checkmark.signup-consent__checkbox.error"));
    public static final Target CHECK_PRIVACY = Target.the("casilla de verificación Privacidad y politicas de seguridad").located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div:nth-child(6) > label > span.checkmark.signup-consent__checkbox.error"));
    public static final Target COMPLETE_BUTTON = Target.the("Botón completar pasos").located(By.id("laddaBtn"));
}
