package pe.metro.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Clase para el  mapeo de los elementos de la automatizacion
 *
 * @author Juan Camilo Munoz R
 */

public class MetroHomePage extends PageObject {
	
	public static final Target CANCEL_POPUP = Target.the("Cancela el popup")
			.located(By.id("onesignal-popover-cancel-button"));
    public static final Target INPUT_SEARCH = Target.the("Ingresa el producto en el buscador")
            .located(By.id("search-autocomplete-input"));
    public static final Target LABEL_RESULT_SEARCH = Target.the("Resultado del buscador")
            .located(By.className("product-item__name"));
    public static final Target LABEL_PRODUCT_NAME = Target.the("contenedor de informacion del producto en el PDP")
    		.located(By.className("info-wrapper"));
    public static final Target BTN_ADD = Target.the("agrega producto al carrito")
            .located(By.className("product-add-to-cart--product-view"));
    public static final Target BTN_MINICART = Target.the("clic en minicart")
            .located(By.className("minicart__action--toggle-open"));
    public static final Target LABEL_NAME_CART = Target.the("Nombre del producto en el carrito-para la validacion")
            .located(By.className("product-item__name"));
}

