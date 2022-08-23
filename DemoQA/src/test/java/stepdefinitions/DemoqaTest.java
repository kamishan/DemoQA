package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import interactions.AbrirNavegador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.*;
import userinterfaces.HomePage;

import java.io.IOException;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class DemoqaTest {

    @Managed(driver = "chrome")
    WebDriver driver;
    private Actor actor = Actor.named("Usuario");
    //private HomePage homePage = new HomePage();

    @Before
    public void setUp() {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario").can(BrowseTheWeb.with(driver));
    }

    @Dado("^que se necesita agregar un nuevo registro$")
    public void queSeNecesitaAgregarUnNuevoRegistro() {
        theActorInTheSpotlight().attemptsTo(AbrirNavegador.on(HomePage.URL));
        theActorInTheSpotlight().attemptsTo(JavaScriptClick.on(HomePage.ELEMENT_BUTTON));
        theActorInTheSpotlight().attemptsTo(JavaScriptClick.on(HomePage.WEBTABLES_BUTTON));
        theActorInTheSpotlight().attemptsTo(JavaScriptClick.on(HomePage.ADD_BUTTON));
    }

    @Cuando("^se agrega un nuevo registro a la tabla$")
    public void seAgregaUnNuevoRegistroALaTabla() throws IOException {
        theActorInTheSpotlight().attemptsTo(LlenarCampos.propiedadesDeArchivo());
    }

    @Entonces("^se debe visualizar la tabla con todos los registros$")
    public void seDebeVisualizarLaTablaConTodosLosRegistros() {

    }

    @Dado("^que la tabla tiene registros ingresados$")
    public void queLaTablaTieneRegistrosIngresados() {
        theActorInTheSpotlight().attemptsTo(AbrirNavegador.on(HomePage.URL));
        theActorInTheSpotlight().attemptsTo(JavaScriptClick.on(HomePage.ELEMENT_BUTTON));
        theActorInTheSpotlight().attemptsTo(JavaScriptClick.on(HomePage.WEBTABLES_BUTTON));

    }

    @Cuando("^necesito borrar un registro existente$")
    public void necesitoBorrarUnRegistroExistente() throws IOException{
        theActorInTheSpotlight().attemptsTo(BorrarRandom.successful());
    }

    @Entonces("^el registro es eliminado exitosamente$")
    public void elRegistroEsEliminadoExitosamente() {

    }

    @Dado("^que el usuario necesita establecer una agenda$")
    public void queElUsuarioNecesitaEstablecerUnaAgenda() {
        theActorInTheSpotlight().attemptsTo(AbrirNavegador.on(HomePage.URL));
        theActorInTheSpotlight().attemptsTo(JavaScriptClick.on(HomePage.WIDGETS_BUTTON));
        theActorInTheSpotlight().attemptsTo(JavaScriptClick.on(HomePage.DATEPICKER_BUTTON));

    }

    @Cuando("^necesita escoger la fecha del compromiso$")
    public void necesitaEscogerLaFechaDelCompromiso() throws IOException{
        theActorInTheSpotlight().attemptsTo(LlenarFecha.propiedadesDeArchivo());

    }

    @Entonces("^el sistema debe indicar la fecha seleccionada$")
    public void elSistemaDebeIndicarLaFechaSeleccionada() {

    }

    @Dado("^que el usuario da click en un boton$")
    public void queElUsuarioDaClickEnUnBoton() {
        theActorInTheSpotlight().attemptsTo(AbrirNavegador.on(HomePage.URL));
        theActorInTheSpotlight().attemptsTo(JavaScriptClick.on(HomePage.ALERT_BUTTON));
        theActorInTheSpotlight().attemptsTo(JavaScriptClick.on(HomePage.ALERTS_BUTTON));
    }

    @Cuando("^aparece la alerta$")
    public void apareceLaAlerta() throws IOException{
        theActorInTheSpotlight().attemptsTo(AlertaSimple.successful());
    }

    @Entonces("^el usuario debe confirmarla$")
    public void elUsuarioDebeConfirmarla() {

    }

    @Dado("^que el usuario da click en un boton y debe esperar (\\d+) segundos$")
    public void queElUsuarioDaClickEnUnBotonYDebeEsperarSegundos(int arg1) {
        theActorInTheSpotlight().attemptsTo(AbrirNavegador.on(HomePage.URL));
        theActorInTheSpotlight().attemptsTo(JavaScriptClick.on(HomePage.ALERT_BUTTON));
        theActorInTheSpotlight().attemptsTo(JavaScriptClick.on(HomePage.ALERTS_BUTTON));

    }
    @Cuando("^aparece la alerta en un tiempo esperado$")
    public void apareceLaAlertaEnUnTiempoEsperado() throws IOException {
        theActorInTheSpotlight().attemptsTo(AlertaConTiempo.successful());
    }

    @Entonces("^el usuario debe confirmarla manualmente$")
    public void elUsuarioDebeConfirmarlaManualmente() {

    }
    @Cuando("^aparece la alerta y la confirma$")
    public void apareceLaAlertaYLaConfirma() throws IOException{
        theActorInTheSpotlight().attemptsTo(AlertaConConfirmacion.successful());
    }

    @Entonces("^el sistema debe generar la confirmacion$")
    public void elSistemaDebeGenerarLaConfirmacion() {

    }

    @Cuando("^aparece la alerta y el usuario ingresa su nombre$")
    public void apareceLaAlertaYElUsuarioIngresaSuNombre() throws IOException{
        theActorInTheSpotlight().attemptsTo(AlertaConTexto.successful());

    }

    @Entonces("^el sistema debe confirmar el ingreso del nombre del usuario$")
    public void elSistemaDebeConfirmarElIngresoDelNombreDelUsuario() {

    }
}
