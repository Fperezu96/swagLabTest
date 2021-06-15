package questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.ConfirmationPage.SUBTOTAL;

public class TotalValue implements Question<Double> {

    @Override
    public Double answeredBy(Actor actor) {
        String price = Text.of(SUBTOTAL).viewedBy(actor).asString();
        int dollarSign = price.indexOf("$");
        int dotSign = price.indexOf(".");
        return Double.parseDouble(price.substring(dollarSign+1,dotSign+3));
    }

    public static TotalValue is() {
        return new TotalValue();
    }

}
