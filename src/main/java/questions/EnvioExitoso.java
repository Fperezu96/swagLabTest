package questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.EnvioPage;

public class EnvioExitoso implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(EnvioPage.MENSAJE_DE_ENVIO).viewedBy(actor).asString();
    }

    public static EnvioExitoso es() {
        return new EnvioExitoso();
    }

}
