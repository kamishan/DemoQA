package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AlertaConTexto implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(actor).getDriver().findElement(By.id("promtButton")).click();
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().sendKeys("Test User");
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();


    }

    public static AlertaConTexto successful(){
        return instrumented(AlertaConTexto.class);
    }
}
