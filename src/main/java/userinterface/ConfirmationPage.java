package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmationPage {
	public static final Target SUBTOTAL = Target.the("Subtotal").located(By.xpath("//*[@class='summary_subtotal_label']"));
	public static final Target NAME = Target.the("Name").located(By.id("first-name"));
	public static final Target LASTNAME = Target.the("Lastname").located(By.id("last-name"));
	public static final Target POSTAL_CODE = Target.the("Postal Code").located(By.id("postal-code"));
	public static final Target BTN_CONTINUE = Target.the("Continue button").located(By.id("continue"));
	public static final Target BTN_FINISH = Target.the("Finish button").located(By.id("finish"));

}
