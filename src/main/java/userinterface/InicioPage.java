package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InicioPage {
	
	public static final Target BTN_COMPRA_1 = Target.the("Añadir al carrito").located(By.xpath("//*[@id='inventory_container']/div/div[1]/div[3]/button"));
	public static final Target BTN_COMPRA_2 = Target.the("Añadir al carrito").located(By.xpath("//*[@id='inventory_container']/div/div[2]/div[3]/button"));
	public static final Target BTN_CARRITO = Target.the("Ver el carrito").located(By.xpath("//*[@id='shopping_cart_container']/a"));

}
