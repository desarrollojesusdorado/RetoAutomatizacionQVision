package co.com.ProyectoBase.Screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDiligenciarFormulario {

    public  static final Target UBICACION = Target.the("Selecciona ubicacion").located(By.xpath("(//input[@role='combobox'])[last()-5]"));
    public  static final Target LISTA_UBICACION = Target.the("Selecciona de la lista ubicacion").located(By.xpath("//div[@class='dx-scrollable-wrapper']/div/div[1]"));
    public  static final Target FECHA_INGRESO = Target.the("ingresa fecha entrada").located(By.xpath("(//input[@role=\"combobox\"])[last()-4]"));
    public  static final Target FECHA_SALIDA = Target.the("ingresa fecha salida").located(By.xpath("(//input[@role=\"combobox\"])[last()-3]"));
    public  static final Target NUM_HABITACIONES = Target.the("Click num habitaciones").located(By.xpath("(//input[@role=\"combobox\"])[last()-2]"));
    public  static final Target LISTA_NUM_HABITACIONES = Target.the("Selecciona num h. de la lista").located(By.xpath("/html/body/div/div[2]/div"));
    public  static final Target NUM_ADULTOS = Target.the("Click num adultos").located(By.xpath("(//input[@role=\"combobox\"])[last()-1]"));
    public  static final Target LISTA_NUM_ADULTOS = Target.the("Selecciona de la lista num adultos").located(By.xpath("/html/body/div/div[2]/div"));
    public  static final Target NUM_NINOS = Target.the("click num ninos").located(By.xpath("(//input[@role=\"combobox\"])[last()-0]"));
    public  static final Target LISTA_NUM_NINOS = Target.the("Selecciona de la lista num ninos").located(By.xpath("/html/body/div/div[2]/div"));
    public  static final Target BUSCAR = Target.the("Click boton buscar").located(By.xpath("//div[@class='dx-button-content']//span[contains(text(), 'SEARCH')]"));
}
