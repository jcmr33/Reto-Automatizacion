package pe.metro.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Clase para el  mapeo de los elementos de la automatizacion
 *
 * @author Juan Camilo Munoz R
 */

public class MetroHomePage extends PageObject {
	
	public static final Target CANCEL_POPUP = Target.the("Cancel popup")
			.located(By.id("onesignal-popover-cancel-button"));
    public static final Target INPUT_SEARCH = Target.the("Input for search the product")
            .located(By.id("search-autocomplete-input"));
    public static final Target LABEL_RESULT_SEARCH = Target.the("Search result products")
            .located(By.className("product-item__name"));
    public static final Target LABEL_PRODUCT_NAME = Target.the("Label product name")
    		.located(By.className("info-wrapper"));
    public static final Target BTN_ADD = Target.the("Add button the product")
            .located(By.className("product-add-to-cart--product-view"));
    public static final Target BTN_MINICART = Target.the("Button minicart")
            .located(By.className("minicart__action--toggle-open"));
    public static final Target LABEL_NAME_CART = Target.the("Label product name in the minicart")
            .located(By.className("product-item__name"));
}

