package pe.metro.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Clase encargada de ejecutar las pruebas.
 *
 * @author Juan Camilo Munoz R
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/pe/metro/www/features/ValidateProduct.feature",
        glue = "pe.metro.www.stepdefinitions",
        tags = "@TestCase1",
        snippets = SnippetType.CAMELCASE
)
public class ValidateProductRunner {

}