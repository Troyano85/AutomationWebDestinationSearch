package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class EscapeDestinatinationsUI {

    public static final Target TXT_ICONO = Target.the("icon culture")
            .locatedBy("(//*[contains (text(), '{0}')]  )[2]");

    public static final Target TXT_RESULT_ICONO = Target.the("result culture")
            .locatedBy("//*[contains (text(), '{0}')] ");

}