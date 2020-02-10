package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	
	public static final Target USUARIO = Target.the("Usuario").located(By.id("user-name"));
	public static final Target CONTRASENA = Target.the("Contraseña").located(By.id("password"));
	public static final Target BTN_INGRESAR = Target.the("Boton de Ingreso").located(By.xpath("//*[@value='LOGIN']"));


}
