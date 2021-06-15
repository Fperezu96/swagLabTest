package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	
	public static final Target USERNAME = Target.the("Username").located(By.id("user-name"));
	public static final Target PASSWORD = Target.the("Password").located(By.id("password"));
	public static final Target BTN_LOGIN = Target.the("Login Button").located(By.id("login-button"));


}
