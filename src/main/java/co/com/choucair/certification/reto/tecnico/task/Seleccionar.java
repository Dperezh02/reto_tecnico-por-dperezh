package co.com.choucair.certification.reto.tecnico.task;

import co.com.choucair.certification.reto.tecnico.userinterface.Contenedordeobjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionar implements Task {
    public static Seleccionar elBoton() {
        return Tasks.instrumented(Seleccionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Contenedordeobjetos.BUTTON));
    }
}
