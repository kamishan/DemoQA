package tasks;

import interactions.EsperarHasta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import userinterfaces.HomePage;
import userinterfaces.WebTables;
import utils.MetodosEspeciales;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarCampos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        MetodosEspeciales.configurarPropiedades();

        actor.attemptsTo(

                Enter.theValue(MetodosEspeciales.properties.getProperty("nombres")).into(WebTables.NOMBRES),
                Enter.theValue(MetodosEspeciales.properties.getProperty("apellidos")).into(WebTables.APELLIDOS),
                Enter.theValue(MetodosEspeciales.properties.getProperty("email")).into(WebTables.EMAIL),
                Enter.theValue(MetodosEspeciales.properties.getProperty("edad")).into(WebTables.EDAD),
                Enter.theValue(MetodosEspeciales.properties.getProperty("salario")).into(WebTables.SALARIO),
                Enter.theValue(MetodosEspeciales.properties.getProperty("departamento")).into(WebTables.DEPARTAMENTO),

                JavaScriptClick.on(WebTables.SUBMIT_BUTTON),
                new EsperarHasta(2)
        );
    }

    public static LlenarCampos propiedadesDeArchivo(){
        return instrumented(LlenarCampos.class);
    }
}
