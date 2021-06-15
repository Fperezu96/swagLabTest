package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FinishPage {

	public static final Target MESSAGE = Target.the("Checkout").located(By.xpath("//*[@class='complete-text']"));
}
