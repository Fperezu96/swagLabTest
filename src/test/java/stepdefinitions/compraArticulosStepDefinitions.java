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
import questions.EnvioExitoso;
import task.AlCarrito;
import task.EnElCarrito;
import task.FinalizarCompra;
import task.Login;
import userinterface.SwagLabHomePage;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;


public class compraArticulosStepDefinitions {

    @Managed(driver="chrome")
    private WebDriver hisBrowser;
    private Actor actor = Actor.named("Felipito");
    private SwagLabHomePage swagLabHomePage;

    @Before
    public void inicializar() {
        actor.can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^Un (.+) con (.+) se autentique exitosamente$")
    public void un_con_se_autentique_existosamente(String usuario, String contrasena) {
        actor.wasAbleTo(tasks.OpenTheBrowser.on(swagLabHomePage));
        actor.attemptsTo(Login.enLaPagina(usuario, contrasena));
    }

    @Cuando("^Confirma la compra de algunos articulos$")
    public void confirma_la_compra_de_algunos_articulos()  {
        actor.attemptsTo(AlCarrito.losProductos());
    }

    @Entonces("^Debe ver un mensaje de envio exitoso$")
    public void debe_ver_un_mensaje_de_envio_exitoso()  {
        actor.attemptsTo(FinalizarCompra.conlosProductos());
        actor.should(seeThat(EnvioExitoso.es(), equalTo("Your order has been dispatched, and will arrive just as fast as the pony can get there!")));
    }

    @Y("^La informacion de envio para (.+) (.+) en (.+)$")
    public void la_informacion_de_envio(String nombre, String apellido, String codigoPostal) {
        actor.attemptsTo(EnElCarrito.paraConfirmar(nombre, apellido, codigoPostal));
    }

}