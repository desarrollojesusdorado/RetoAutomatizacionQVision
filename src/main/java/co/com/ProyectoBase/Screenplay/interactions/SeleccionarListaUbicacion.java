package co.com.ProyectoBase.Screenplay.interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleccionarListaUbicacion implements Interaction {

    private Target lista;
    private String opcion;
    public SeleccionarListaUbicacion(Target lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElement> listaObjeto = lista.resolveFor(actor).findElements(By.tagName("div"));
        for (int i=0; i < listaObjeto.size(); i++) {
            if(listaObjeto.get(i).getText().equals(opcion)) {
                listaObjeto.get(i).click();
                break;
            }
        }
    }
    public static SeleccionarListaUbicacion Desde(Target lista, String opcion) {
        return new SeleccionarListaUbicacion(lista, opcion);
    }


}

