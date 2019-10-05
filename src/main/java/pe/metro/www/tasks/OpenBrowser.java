package pe.metro.www.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase para abrir el navegador
 * @author Juan Camilo Munoz R
 */
public class OpenBrowser implements Task {

    private PageObject pageObject;
    public OpenBrowser(PageObject pageObject) {
        this.pageObject = pageObject;
    }

    @Override
    @Step("{0} abre el navegador")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pageObject));
     
    }
        

    public static OpenBrowser page (PageObject pageObject) {
        return instrumented(OpenBrowser.class, pageObject);
    }

}