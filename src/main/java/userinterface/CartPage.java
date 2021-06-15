package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

	public static final Target BTN_CHECKOUT = Target.the("Checkout").located(By.id("checkout"));
}
