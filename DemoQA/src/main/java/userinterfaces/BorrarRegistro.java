package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BorrarRegistro {

    final private static int aleatorio = (int) ((Math.random()*3)+1);
    final private static String randomId = "delete-record-"+aleatorio;

    public static final Target DELETE_BUTTON = Target.the("").located(By.id(randomId));
}
