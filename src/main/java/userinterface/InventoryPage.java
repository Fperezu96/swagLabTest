package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InventoryPage {
	
	public static final Target ADD_TO_CART_BACKPACK = Target.the("Adding Backpack to cart").located(By.id("add-to-cart-sauce-labs-backpack"));
	public static final Target BTN_CART = Target.the("Cart").located(By.xpath("//*[@class='shopping_cart_link']"));

}
