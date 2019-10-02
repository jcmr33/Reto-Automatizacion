package pe.metro.www.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pe.metro.www.userinterface.MetroHomePage;

/**
 * Clase para agregar el producto al carrito.
 *
 * @author Juan Camilo Munoz R
 */
public class AddProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MetroHomePage.LABEL_PRODUCT_NAME, isPresent()),
                Scroll.to(MetroHomePage.BTN_ADD) );
        MetroHomePage.BTN_ADD.resolveAllFor(actor).get(1).click();
       
    }

    public static AddProduct inShoppingCart() {
        return instrumented(AddProduct.class);
    }

}