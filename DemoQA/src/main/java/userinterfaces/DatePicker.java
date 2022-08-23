package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatePicker {

    public static final Target FECHA = Target.the("").located(By.id("datePickerMonthYearInput"));
    public static final Target FECHAYHORA = Target.the("").located(By.id("dateAndTimePickerInput"));
}
