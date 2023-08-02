package tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollToTarget;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterface.EscapeDestinatinationsUI.TXT_ICONO;
//import static userInterface.EscapeDestinations.TXT_ICONO;

public class SelectDestination implements Task {


    private String data;


    public SelectDestination(String data) {
        this.data = data;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(TXT_ICONO.of(data)),
                Click.on(TXT_ICONO.of(data)) );

    }

    public static SelectDestination irDestino(String data) {
        return instrumented(SelectDestination.class, data);
    }


}
