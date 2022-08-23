package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;


public class AbrirNavegador implements Interaction {

    private String URL;
    public AbrirNavegador(String URL){
        this.URL = URL;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL));
    }

    public static AbrirNavegador on (String URL){
        return new AbrirNavegador(URL);
    }
}