package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.EnvioPage;
import userinterface.InicioPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FinalizarCompra implements Task {


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(EnvioPage.BTN_FINALIZAR));
	}
	public static FinalizarCompra conlosProductos() {
		return instrumented(FinalizarCompra.class);
	}
}
