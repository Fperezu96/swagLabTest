package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.ConfirmationPage.*;

public class Purchase implements Task {

	private static String name;
	private static String lastname;
	private static String postalCode;

	public Purchase(String name, String lastname, String postalCode) {
		this.name = name;
		this.lastname = lastname;
		this.postalCode = postalCode;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(NAME, isVisible()),
				Enter.theValue(name).into(NAME),
				Enter.theValue(lastname).into(LASTNAME),
				Enter.theValue(postalCode).into(POSTAL_CODE),
				Click.on(BTN_CONTINUE));
	}
	public static Purchase confirmation(String name, String lastname, String postalCode) {
		return instrumented(Purchase.class, name,lastname,postalCode);
	}
}
