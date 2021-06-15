package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.SuccessfulSend;
import questions.TotalValue;
import task.*;
import userinterface.SwagLabHomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;


public class automatedTestsStepDefinitions {

    @Managed(driver="chrome")
    private WebDriver hisBrowser;
    private Actor actor = Actor.named("Felipe");
    private SwagLabHomePage swagLabHomePage;

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^I have valid credentials as (.+) and (.+)$")
    public void valid_login(String user, String pass) {
        actor.wasAbleTo(tasks.OpenTheBrowser.on(swagLabHomePage));
        actor.attemptsTo(Login.intoHomePage(user, pass));
    }

    @When("^Adding backpack to my cart$")
    public void adding_backpack()  {
        actor.attemptsTo(AddingBackpack.toCart());
    }

    @Then("^I should see a succesful message$")
    public void should_see_succesful_message()  {
        actor.attemptsTo(Finish.purchase());
        actor.should(seeThat(SuccessfulSend.is(), equalTo("Your order has been dispatched, and will arrive just as fast as the pony can get there!")));
    }
    @When("^Adding the max and min value articles to buy$")
    public void adding_max_and_min_value_articles()  {
        actor.attemptsTo(AddingMinAndMaxValueArticles.toCart(hisBrowser));
    }

    @Then("^I should see (.+) price in my cart$")
    public void should_see_articles_in_my_cart(Double value)  {
        actor.should(seeThat(TotalValue.is(), equalTo(value)));
    }

    @And("^finishing my purchase entering deliver information as (.+) (.+) (.+)$")
    public void entering_delivery_info(String nombre, String apellido, String codigoPostal) {
        actor.attemptsTo(Purchase.confirmation(nombre, apellido, codigoPostal));
    }

}