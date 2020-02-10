package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ConfirmarInformacionPage;
import userinterface.InicioPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnElCarrito implements Task {

	private static String nombre;
	private static String apellido;
	private static String codigoPostal;

	public EnElCarrito(String nombre, String apellido, String codigoPostal) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigoPostal = codigoPostal;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ConfirmarInformacionPage.BTN_CONFIRMAR_CARRITO),
				Enter.theValue(nombre).into(ConfirmarInformacionPage.PRIMER_NOMBRE),
				Enter.theValue(apellido).into(ConfirmarInformacionPage.APELLIDO),
				Enter.theValue(codigoPostal).into(ConfirmarInformacionPage.CODIGO_POSTAL),
				Click.on(ConfirmarInformacionPage.BTN_CONTINUAR));
	}
	public static EnElCarrito paraConfirmar(String nombre, String apellido, String codigoPostal) {
		return instrumented(EnElCarrito.class, nombre,apellido,codigoPostal);
	}
}
