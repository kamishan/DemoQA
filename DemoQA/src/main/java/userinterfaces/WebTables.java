package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebTables {

    public static final Target NOMBRES = Target.the("").located(By.id("firstName"));
    public static final Target APELLIDOS = Target.the("").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("").located(By.id("userEmail"));
    public static final Target EDAD = Target.the("").located(By.id("age"));
    public static final Target SALARIO = Target.the("").located(By.id("salary"));
    public static final Target DEPARTAMENTO = Target.the("").located(By.id("department"));
    public static final Target SUBMIT_BUTTON = Target.the("").located(By.id("submit"));
}
