package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static String URL = "https://demoqa.com/";



    public static final Target ELEMENT_BUTTON = Target.the("").located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
    public static final Target WEBTABLES_BUTTON = Target.the("").located(By.id("item-3"));
    public static final Target ADD_BUTTON = Target.the("").located(By.id("addNewRecordButton"));

    public static final Target WIDGETS_BUTTON = Target.the("").located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]"));
    public static final Target DATEPICKER_BUTTON = Target.the("").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[3]"));

    public static final Target ALERT_BUTTON = Target.the("").located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
    public static final Target ALERTS_BUTTON = Target.the("").located(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]"));

}
