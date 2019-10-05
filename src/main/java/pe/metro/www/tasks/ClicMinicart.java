package pe.metro.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pe.metro.www.exceptions.ExceptionsMessage;
import pe.metro.www.userinterfaces.MetroHomePage;
import pe.metro.www.utils.constants.ErrorMessage;

/**
 * Clase para abrir el minicart
 *
 * @author Juan Camilo Munoz R
 */
public class ClicMinicart implements Task{



	@Override
	 @Step("{0} hace clic en el minicart y espera que este en producto agregado")
	    public <T extends Actor> void performAs(T actor) {
		 actor.attemptsTo(
	                Click.on(MetroHomePage.BTN_MINICART));
	    }
 
	    public static ClicMinicart openMinicart() {
	        return instrumented(ClicMinicart.class);
	    }

}