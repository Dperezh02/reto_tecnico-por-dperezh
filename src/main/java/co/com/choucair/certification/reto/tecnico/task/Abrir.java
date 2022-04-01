package co.com.choucair.certification.reto.tecnico.task;

import co.com.choucair.certification.reto.tecnico.userinterface.PaginaUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    public static Abrir laPagina() {
        return Tasks.instrumented(Abrir.class);
    }

    private PaginaUtest paginaUtest;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaUtest));
    }
}
