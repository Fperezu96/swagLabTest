package task;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.CartPage.BTN_CHECKOUT;
import static userinterface.InventoryPage.*;

public class AddingMinAndMaxValueArticles implements Task {

	private static WebDriver browser;

	public AddingMinAndMaxValueArticles(WebDriver browser) {
		this.browser = browser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		List<WebElement> prices=browser.findElements(By.xpath("//*[@class='inventory_item_price']"));
		int indexMax=0;
		int indexMin=0;

		String[] value=prices.get(0).getText().split("$");
		Double min=Double.parseDouble(value[0].replace("$", "").trim());
		Double max=Double.parseDouble(value[0].replace("$", "").trim());

		for(int i=1;i<prices.size();i++)
		{
			String[] strPrices=prices.get(i).getText().split("$");
			Double price=Double.parseDouble(strPrices[0].replace("$", "").trim());
			if(price>max){
				max=price;
				indexMax=i;
			}
			if(price<min){
				min=price;
				indexMin=i;
			}

		}

		browser.findElements(By.xpath("//*[@class='pricebar']//button")).get(indexMin).click();
		browser.findElements(By.xpath("//*[@class='pricebar']//button")).get(indexMax).click();

		actor.attemptsTo(Click.on(BTN_CART),
				Click.on(BTN_CHECKOUT));
	}


	public static AddingMinAndMaxValueArticles toCart(WebDriver browser) {
		return instrumented(AddingMinAndMaxValueArticles.class, browser);
	}
}
