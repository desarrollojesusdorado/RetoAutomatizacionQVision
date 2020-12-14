package co.com.ProyectoBase.Screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaResultadosHotels {

    public static final Target LISTA_PRECIOS = Target.the("Lista de precios en resultados de hoteles").located(By.xpath("//div[@class='night-button']//descendant::p"));
    public static final Target LISTA_BOTONES = Target.the("lista de botones en resultados de hoteles").located(By.xpath("//span[contains(text(), 'Book it')]"));


}
