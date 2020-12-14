package co.com.ProyectoBase.Screenplay.stepdefinitions;

import co.com.ProyectoBase.Screenplay.model.DatosUsuario;
import co.com.ProyectoBase.Screenplay.questions.VerificaPrecioTotal;
import co.com.ProyectoBase.Screenplay.tasks.AbrirPagina;
import static co.com.ProyectoBase.Screenplay.util.Constantes.CERO;
import co.com.ProyectoBase.Screenplay.tasks.BuscarHotel;
import co.com.ProyectoBase.Screenplay.tasks.BuscarPrecio;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class VerificarTarifaDxHotelsStepDefinitions {

    @Dado("^que (.*) ingresa a la pagina de DxHotels$")
    public void queJesusIngresaALaPaginaDeDxHotels(String jesus) {
        theActorCalled(jesus).wasAbleTo(AbrirPagina.deDxHotels());
    }
    @Cuando("^el diligencia el formulario para buscar un hotel con menor precio$")
    public void elDiligenciaElFormularioParaBuscarUnHotel(List<DatosUsuario> datos) {
        theActorInTheSpotlight().attemptsTo(BuscarHotel.conSus(datos.get(CERO)), BuscarPrecio.menor());
    }
    @Entonces("^el verifica que el cobro total sea el correcto$")
    public void elVerificaQueElCobroTotalSeaElCorrecto(List<DatosUsuario> datosFecha) {
        theActorInTheSpotlight().should(seeThat(VerificaPrecioTotal.conLos(datosFecha)));
    }
}
