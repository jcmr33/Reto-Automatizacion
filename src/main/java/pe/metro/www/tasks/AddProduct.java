package pe.metro.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pe.metro.www.userinterfaces.MetroHomePage;


/**
 * Clase para agregar el producto al carrito, busca el producto entre los resultados de la busqueda
 * y agrega el producto que corresponde con el nombre del producto buscado
 *
 * @author Juan Camilo Munoz R
 */
public class AddProduct implements Task {

    @Override
    @Step("{0} espera que la informacion del producto este visible, hace scroll hacia abajo y da clic en el boton"
    		+ " agregar al carrito")
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