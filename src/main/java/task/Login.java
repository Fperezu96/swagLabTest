package task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.LoginPage;

public class Login implements Task {

	private static String usuario;
	private static String contrasena;

	public Login(String usuario, String contrasena) {
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(usuario).into(LoginPage.USUARIO),
				Enter.theValue(contrasena).into(LoginPage.CONTRASENA),
				Click.on(LoginPage.BTN_INGRESAR));
	}
	public static Login enLaPagina(String usuario, String contrasena) {
		return instrumented(Login.class, usuario, contrasena);
	}
}
