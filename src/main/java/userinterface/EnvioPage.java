package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EnvioPage {
	
	public static final Target BTN_FINALIZAR = Target.the("Finalizar Compra").located(By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[8]/a[2]"));
	public static final Target MENSAJE_DE_ENVIO = Target.the("Mensaje de envio").located(By.xpath("//*[@id='checkout_complete_container']/div[1]"));

}
