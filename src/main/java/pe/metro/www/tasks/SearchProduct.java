package pe.metro.www.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;

import org.hamcrest.Matcher;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pe.metro.www.exceptions.ExceptionsMessage;
import pe.metro.www.questions.ValidateProductSearch;
import pe.metro.www.questions.TheResult;
import pe.metro.www.userinterfaces.MetroHomePage;
import pe.metro.www.utils.constants.ErrorMessage;

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
    @Step("{0} cancela el popup, busca el producto #nameProduct, lo selecciona de la lista de resultados y entra al PDP del producto")
    public <T extends Actor> void performAs(T actor) {
    	  actor.attemptsTo(
    			  WaitUntil.the(MetroHomePage.CANCEL_POPUP, isPresent()),
                  Click.on(MetroHomePage.CANCEL_POPUP),
                Enter.theValue(nameProduct).into(MetroHomePage.INPUT_SEARCH));
    	  
    	  actor.should(seeThat(ValidateProductSearch.searchResult(), equalTo(nameProduct))
	  			  .orComplainWith(ExceptionsMessage.class, ErrorMessage.PRODUCT_NOT_FOUND));
    	  
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