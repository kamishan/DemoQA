package tasks;

import interactions.EsperarHasta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import userinterfaces.BorrarRegistro;
import userinterfaces.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BorrarRandom implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(BorrarRegistro.DELETE_BUTTON),
                new EsperarHasta(2)
        );
    }

    public static BorrarRandom successful(){
        return instrumented(BorrarRandom.class);
    }

}
