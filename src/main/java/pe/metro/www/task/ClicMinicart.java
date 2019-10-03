package pe.metro.www.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pe.metro.www.userinterface.MetroHomePage;

/**
 * Clase para abrir el minicart
 *
 * @author Juan Camilo Munoz R
 */
public class ClicMinicart implements Task{

	
	 @Override
	    public <T extends Actor> void performAs(T actor) {
		 actor.attemptsTo(
	                Click.on(MetroHomePage.BTN_MINICART),
	                WaitUntil.the(MetroHomePage.LABEL_NAME_CART, isPresent())
	        );
	    }
 
	    public static ClicMinicart openMinicart() {
	        return instrumented(ClicMinicart.class);
	    }

}