package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.InventoryPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.CartPage.BTN_CHECKOUT;
import static userinterface.InventoryPage.*;

public class AddingBackpack implements Task {


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ADD_TO_CART_BACKPACK),
				Click.on(BTN_CART),
				Click.on(BTN_CHECKOUT));
	}
	public static AddingBackpack toCart() {
		return instrumented(AddingBackpack.class);
	}
}
