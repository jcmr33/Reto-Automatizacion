package pe.metro.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.metro.www.userinterfaces.MetroHomePage;

public class ValidateProductSearch implements Question<String> {
    
	@Override
    public String answeredBy(Actor actor) {
        return Text.of(MetroHomePage.LABEL_RESULT_SEARCH).viewedBy(actor).asString();
    }

	public static ValidateProductSearch searchResult() {
        return new ValidateProductSearch();
    }
} 

