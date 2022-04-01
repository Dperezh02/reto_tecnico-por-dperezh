package co.com.choucair.certification.reto.tecnico.task;

import co.com.choucair.certification.reto.tecnico.model.TablaCampos;
import co.com.choucair.certification.reto.tecnico.userinterface.Contenedordeobjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class Ingresar implements Task {

    private TablaCampos tablaCampos;

    public Ingresar(TablaCampos tablaCampos) {
        this.tablaCampos = tablaCampos;
    }

    public static Ingresar registro(TablaCampos tablaCampos) {
        return Tasks.instrumented(Ingresar.class, tablaCampos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tablaCampos.getStrFirstname()).into(Contenedordeobjetos.FIRSTNAME),
                Enter.theValue(tablaCampos.getStrLastname()).into(Contenedordeobjetos.LASTNAME),
                Enter.theValue(tablaCampos.getStrEmail()).into(Contenedordeobjetos.EMAIL),
                Click.on(Contenedordeobjetos.MONTH),
                Click.on(Contenedordeobjetos.DAY),
                Click.on(Contenedordeobjetos.YEAR),
                Enter.theValue(tablaCampos.getStrLanguage()).into(Contenedordeobjetos.LENGUAGE)
        );

        actor.attemptsTo(Click.on(Contenedordeobjetos.BUTTON_NEXT),
                Click.on(Contenedordeobjetos.CITY),
                Enter.theValue(tablaCampos.getStrZipcode()).into(Contenedordeobjetos.ZIPCODE)
        );

        actor.attemptsTo(Click.on(Contenedordeobjetos.BUTTON_NEXT_DEVICE),
                Click.on(Contenedordeobjetos.BUTTON_LAST_STEP),
                Enter.theValue(tablaCampos.getStrPassword()).into(Contenedordeobjetos.PASSWORD),
                Enter.theValue(tablaCampos.getStrConfirmPass()).into(Contenedordeobjetos.PASSWORD_CONFIRM),
                Click.on(Contenedordeobjetos.CHECK_TERMS),
                Click.on(Contenedordeobjetos.CHECK_PRIVACY)
        );

        actor.attemptsTo(Click.on(Contenedordeobjetos.COMPLETE_BUTTON));



    }
}
