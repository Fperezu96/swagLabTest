package questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.CartPage;

import static userinterface.FinishPage.MESSAGE;

public class SuccessfulSend implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MESSAGE).viewedBy(actor).asString();
    }

    public static SuccessfulSend is() {
        return new SuccessfulSend();
    }

}
