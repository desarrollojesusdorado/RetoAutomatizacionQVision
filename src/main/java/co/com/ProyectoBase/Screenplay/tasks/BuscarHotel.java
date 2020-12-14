package co.com.ProyectoBase.Screenplay.tasks;

import co.com.ProyectoBase.Screenplay.interactions.SeleccionarListaUbicacion;
import co.com.ProyectoBase.Screenplay.model.DatosUsuario;
import static co.com.ProyectoBase.Screenplay.userinterface.PaginaDiligenciarFormulario.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class BuscarHotel implements Task {

    private DatosUsuario datosUsuario;

    public BuscarHotel(DatosUsuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    public static BuscarHotel conSus(DatosUsuario datosUsuario) {
     return Tasks.instrumented(BuscarHotel.class, datosUsuario);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UBICACION),
                WaitUntil.the((LISTA_UBICACION), isVisible()).forNoMoreThan(10).seconds(),
                SeleccionarListaUbicacion.Desde(LISTA_UBICACION, datosUsuario.getUbicacion()),
                Enter.theValue(datosUsuario.getFechaIngreso()).into(FECHA_INGRESO).thenHit(Keys.ENTER),
                Enter.theValue(datosUsuario.getFechaSalida()).into(FECHA_SALIDA).thenHit(Keys.ENTER),
                Click.on(NUM_HABITACIONES),
                SeleccionarListaUbicacion.Desde(LISTA_NUM_HABITACIONES, datosUsuario.getNumHabitaciones()),
                Click.on(NUM_ADULTOS),
                SeleccionarListaUbicacion.Desde(LISTA_NUM_ADULTOS, datosUsuario.getNumAdultos()),
                Click.on(NUM_NINOS),
                SeleccionarListaUbicacion.Desde(LISTA_NUM_NINOS, datosUsuario.getNumNinos()),
                Click.on(BUSCAR)
        );
    }
}
