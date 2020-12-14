package co.com.ProyectoBase.Screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaResumenReserva {
    public static final Target PRECIO_TOTAL = Target.the("").located(By.xpath("//*[@class='sum']//child::h4[1]"));
}
