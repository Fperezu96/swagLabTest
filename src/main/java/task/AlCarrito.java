package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.InicioPage;
import userinterface.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AlCarrito implements Task {


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioPage.BTN_COMPRA_1),
				Click.on(InicioPage.BTN_COMPRA_2),
				Click.on(InicioPage.BTN_CARRITO));
	}
	public static AlCarrito losProductos() {
		return instrumented(AlCarrito.class);
	}
}
