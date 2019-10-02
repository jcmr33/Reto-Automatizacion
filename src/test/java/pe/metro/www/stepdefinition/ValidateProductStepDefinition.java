package pe.metro.www.stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import pe.metro.www.question.TheResult;
import pe.metro.www.task.AddProduct;
import pe.metro.www.task.ClicMinicart;
import pe.metro.www.task.OpenBrowser;
import pe.metro.www.task.SearchProduct;
import pe.metro.www.userinterface.MetroHomePage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import org.openqa.selenium.WebDriver;

public class ValidateProductStepDefinition {

    private Actor juan = Actor.named("Juan");
    private MetroHomePage metroHomePage;

    @Managed(driver = "chrome")
    public WebDriver webDriver;
   
    
    @Before
    public void setUp(){
        juan.can(BrowseTheWeb.with(webDriver));
      
    }


    @Given("^Enter the website$")
    public void enterTheWebsite() {
    	juan.attemptsTo(OpenBrowser.page(metroHomePage));
    	
    }

    @When("^Search the (.*)$")
    public void searchTheProduct(String nameProduct) {
    	juan.attemptsTo(SearchProduct.theProduct(nameProduct));
    }

    @And("^Add (.*) in shopping cart$")
    public void addProductInShoppingCart(String nameProduct) {
    	juan.attemptsTo(AddProduct.inShoppingCart());
    }
    @And("^Clic in the minicart$")
    public void clicInTheMinicart() {
    	juan.attemptsTo(ClicMinicart.openMinicart());
    }

    @Then("^Validate that (.*) is in shopping cart$")
    public void validateThatProductIsInShoppingCart(String expectResult) {
    	juan.should(seeThat(TheResult.validateProduct(), equalTo(expectResult)));
    }
   
}