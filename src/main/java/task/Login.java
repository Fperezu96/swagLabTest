package task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.LoginPage.*;

import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.LoginPage;

public class Login implements Task {

	private static String username;
	private static String password;

	public Login(String user, String pass) {
		this.username = user;
		this.password = pass;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(username).into(USERNAME),
				Enter.theValue(password).into(PASSWORD),
				Click.on(BTN_LOGIN));
	}
	public static Login intoHomePage(String user, String pass) {
		return instrumented(Login.class, user, pass);
	}
}
