package co.com.choucair.certification.reto.tecnico.stepdefinitions;

import co.com.choucair.certification.reto.tecnico.model.TablaCampos;
import co.com.choucair.certification.reto.tecnico.task.Abrir;
import co.com.choucair.certification.reto.tecnico.task.Ingresar;
import co.com.choucair.certification.reto.tecnico.task.Seleccionar;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class MyStepdefinitions {

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que Daniela ingresa a Utest$")
    public void queDanielaIngresaAUtest() {
        OnStage.theActorCalled("Daniela").wasAbleTo(Abrir.laPagina());
    }

    @And("^Selecciona el botón join Today$")
    public void seleccionaElBotónJoinToday() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.elBoton());
    }

    @When("^digita los campos$")
    public void digitaLosCampos(List<TablaCampos> tablaCampos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.registro(tablaCampos.get(0)));
    }
    
    @Then("^encuentra la opción de registro para acceder con el nuevo usuario creado$")
    public void encuentraLaOpciónDeRegistroParaAccederConElNuevoUsuarioCreado() {
    }
}
