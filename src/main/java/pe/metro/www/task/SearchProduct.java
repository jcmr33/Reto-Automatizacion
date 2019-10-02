package pe.metro.www.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pe.metro.www.userinterface.MetroHomePage;

/**
 * Clase que busca el producto y entre los resultados de la busqueda
 * los recorre para seleccionar el producto que corresponde y abre el detalle del producto.
 *
 * @author Juan Camilo Munoz R
 */

public class SearchProduct implements Task {

    private String nameProduct;
    public SearchProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    @Step("{0} search the product")
    public <T extends Actor> void performAs(T actor) {
    	  actor.attemptsTo(
    			  WaitUntil.the(MetroHomePage.INPUT_SEARCH, isPresent()),
                  Click.on(MetroHomePage.CANCEL_POPUP),
                Enter.theValue(nameProduct).into(MetroHomePage.INPUT_SEARCH));

        List<WebElementFacade> listResult = MetroHomePage.LABEL_RESULT_SEARCH.resolveAllFor(actor);
        for (WebElementFacade productResult : listResult) {
            if(nameProduct.equalsIgnoreCase(productResult.getText())) {
                productResult.click();
                break;
            }
        }
    }

    public static SearchProduct theProduct(String nameProduct) {
        return instrumented(SearchProduct.class, nameProduct);
    }

}