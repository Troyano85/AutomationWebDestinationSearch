package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.SelectDestination;

import static constants.Url.QA_ESCAPADAS;

import static userInterface.EscapeDestinatinationsUI.TXT_ICONO;
import static userInterface.EscapeDestinatinationsUI.TXT_RESULT_ICONO;

public class EscapeDestinationsStep {
    Actor actor = Actor.named("user");

    @Managed
    WebDriver MyDriver;

    @Before
    public void setupActor() {
        actor.can(BrowseTheWeb.with((MyDriver)));
    }

    @Given("user is on the getaways page")
    public void userIsOnTheGetawaysPage() {
        actor.attemptsTo(
                Open.url(QA_ESCAPADAS)
        );

    }

    @When("user selects the {string}")
    public void userSelectsThe(String data) {
        actor.attemptsTo(SelectDestination.irDestino(data));
    }

    @Then("user sees the {string}")
    public void userSeesThe(String dato) {
        EnsureFieldVisible.ensureThat(actor).canSee(TXT_RESULT_ICONO.of(dato).resolveFor(actor));

    }
}
