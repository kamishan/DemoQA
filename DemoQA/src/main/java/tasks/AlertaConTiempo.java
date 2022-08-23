package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AlertaConTiempo implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait esperar = new WebDriverWait(driver, 6);

        driver.findElement(By.id("timerAlertButton")).click();
        esperar.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public static AlertaConTiempo successful(){
        return instrumented(AlertaConTiempo.class);
    }
}
