package co.com.ProyectoBase.Screenplay.tasks;

import static co.com.ProyectoBase.Screenplay.userinterface.PaginaResultadosHotels.*;
import co.com.ProyectoBase.Screenplay.interactions.SeleccionarMenorPrecio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class BuscarPrecio implements Task {

    public static BuscarPrecio menor() {
        return Tasks.instrumented(BuscarPrecio.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarMenorPrecio.desdeLaPagina(LISTA_PRECIOS, LISTA_BOTONES)
        );
    }
}
