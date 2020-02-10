package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmarInformacionPage {
	
	public static final Target BTN_CONFIRMAR_CARRITO = Target.the("Confirmar Carrito").located(By.xpath("//*[@id='cart_contents_container']/div/div[2]/a[2]"));
	public static final Target PRIMER_NOMBRE = Target.the("Primer Nombre").located(By.id("first-name"));
	public static final Target APELLIDO = Target.the("Apellido").located(By.id("last-name"));
	public static final Target CODIGO_POSTAL = Target.the("Codigo Postal").located(By.id("postal-code"));
	public static final Target BTN_CONTINUAR = Target.the("Continuar").located(By.xpath("//*[@value='CONTINUE']"));


}
