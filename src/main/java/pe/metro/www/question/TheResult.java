package pe.metro.www.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.metro.www.userinterface.MetroHomePage;

/**
 * Question para validar que el producto que esta en el carrito, corresponde al producto buscado
 *
 * @author Juan Camilo Munoz R
 */
public class TheResult implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MetroHomePage.LABEL_NAME_CART).viewedBy(actor).asString();
    }

    public static TheResult validateProduct() {
        return new TheResult();
    }
}