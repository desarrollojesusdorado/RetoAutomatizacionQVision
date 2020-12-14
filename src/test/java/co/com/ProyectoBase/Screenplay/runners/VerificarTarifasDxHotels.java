package co.com.ProyectoBase.Screenplay.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/verificar_tarifas_dxhotels.feature",
        tags = "@Escenario",
        glue = {"co.com.ProyectoBase.Screenplay.stepdefinitions", "co.com.ProyectoBase.Screenplay.util"},
        snippets = SnippetType.CAMELCASE
)
public class VerificarTarifasDxHotels {
}
