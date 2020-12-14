package co.com.ProyectoBase.Screenplay.questions;

import static co.com.ProyectoBase.Screenplay.interactions.SeleccionarMenorPrecio.*;
import co.com.ProyectoBase.Screenplay.model.DatosUsuario;
import static co.com.ProyectoBase.Screenplay.userinterface.PaginaResumenReserva.PRECIO_TOTAL;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class VerificaPrecioTotal implements Question<Boolean> {

    private List<DatosUsuario> datosFecha;

    public VerificaPrecioTotal(List<DatosUsuario> datosFecha) {
        this.datosFecha = datosFecha;
    }

    public static VerificaPrecioTotal conLos(List<DatosUsuario> datosFecha) {
        return new VerificaPrecioTotal(datosFecha);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        int diaInicial = Integer.parseInt(datosFecha.get(0).getFechaIngreso().substring(3, 5));
        int diaFinal = Integer.parseInt(datosFecha.get(0).getFechaSalida().substring(3, 5));
        int diasVacaciones = (diaFinal - diaInicial) + 1;
        int precioTotal = precioMenor * diasVacaciones;
        int precioTotalPagina = Integer.parseInt(Text.of(PRECIO_TOTAL).
                viewedBy(actor).asString().replace("$", "").replace(".00",""));
        if (precioTotal ==precioTotalPagina){
            return true;
        }
        else return false;
    }
}
