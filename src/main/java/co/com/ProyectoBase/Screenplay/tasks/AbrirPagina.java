package co.com.ProyectoBase.Screenplay.tasks;

import co.com.ProyectoBase.Screenplay.userinterface.PaginaPrincipalDxHotels;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private PaginaPrincipalDxHotels paginaPrincipalDxHotels;

    public static AbrirPagina deDxHotels() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaPrincipalDxHotels));
    }
}
