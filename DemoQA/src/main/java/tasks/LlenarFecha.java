package tasks;

import interactions.EsperarHasta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;
import userinterfaces.DatePicker;
import userinterfaces.HomePage;
import utils.MetodosEspeciales;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarFecha implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        MetodosEspeciales.configurarPropiedades();
        actor.attemptsTo(

                Enter.theValue(MetodosEspeciales.properties.getProperty("fecha")).into(DatePicker.FECHA),
                Enter.keyValues(Keys.ENTER).into(DatePicker.FECHA),
                Enter.theValue(MetodosEspeciales.properties.getProperty("fechaYHora")).into(DatePicker.FECHAYHORA),
                Enter.keyValues(Keys.ENTER).into(DatePicker.FECHAYHORA),

                new EsperarHasta(2)
        );
    }

    public static LlenarFecha propiedadesDeArchivo(){
        return instrumented(LlenarFecha.class);
    }
}
