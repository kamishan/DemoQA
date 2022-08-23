package interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class EsperarHasta implements Interaction {
    private long segundos;

    public EsperarHasta(long segundos) {this.segundos = segundos *1000; }

    @Override
    public  <T extends Actor> void performAs(T actor){
        InternalSystemClock clock = new InternalSystemClock();
        clock.pauseFor(segundos);
    }
    public static EsperarHasta inSeconds(long segundos) {
        return new EsperarHasta(segundos);
    }
}