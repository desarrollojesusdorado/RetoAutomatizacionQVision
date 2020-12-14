package co.com.ProyectoBase.Screenplay.util;


import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PrepararEscenario {
	
	@Before
	public void prepararEscenario() {
		OnStage.setTheStage(new OnlineCast());
	}
	
}
