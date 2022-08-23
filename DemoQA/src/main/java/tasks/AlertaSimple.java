package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AlertaSimple implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().findElement(By.id("alertButton")).click();
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

    }

    public static AlertaSimple successful(){
        return instrumented(AlertaSimple.class);
    }
}
