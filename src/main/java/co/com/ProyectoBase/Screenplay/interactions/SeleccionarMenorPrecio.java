package co.com.ProyectoBase.Screenplay.interactions;

import co.com.ProyectoBase.Screenplay.userinterface.PaginaPrincipalDxHotels;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import java.util.ArrayList;
import java.util.List;

public class SeleccionarMenorPrecio implements Interaction {
    private Target listaPreciosPagina;
    private Target listaBotonesPagina;
    public static Integer precioMenor;

    public SeleccionarMenorPrecio(Target listaPreciosPagina, Target listaBotonesPagina) {
        this.listaPreciosPagina = listaPreciosPagina;
        this.listaBotonesPagina = listaBotonesPagina;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        int posicion=0;
        List<WebElementFacade> listaPrecios = listaPreciosPagina.resolveAllFor(actor);
        List<WebElementFacade> listaBotones = listaBotonesPagina.resolveAllFor(actor);
        List<Integer> miLista = new ArrayList<>();
        precioMenor=Integer.parseInt(listaPrecios.get(0).getText().substring(1));
        for (int i=0; i<listaPrecios.size(); i++){
            miLista.add(Integer.parseInt(listaPrecios.get(i).getText().substring(1)));
        }
        for (int i = 0; i < miLista.size(); i++) {
            if (miLista.get(i) < precioMenor){
                precioMenor= miLista.get(i);
                posicion=i;
            }
        }
        listaBotones.get(posicion).click();
    }
    public static SeleccionarMenorPrecio desdeLaPagina(Target listaPreciosPagina, Target listaBotonesPagina) {
        return new SeleccionarMenorPrecio(listaPreciosPagina, listaBotonesPagina);
    }

}
