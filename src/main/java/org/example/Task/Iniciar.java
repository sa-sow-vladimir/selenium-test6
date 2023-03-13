package org.example.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.UI.Home;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static org.example.UI.Home.Profile;
import static org.example.UI.Home.User;

public class Iniciar implements Task {

    private String user;
    private String pass;
    public Iniciar(String user, String pass){
        this.user = user;
        this.pass = pass;
    }




    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(Profile.resolveFor(actor)),
                WaitUntil.the(User,isCurrentlyVisible()).forNoMoreThan(28).seconds(),
                Enter.theValue(user).into(Home.User),
                Enter.theValue(pass).into(Home.Pass)

        );
    }

    public static Iniciar Sesion(String user, String pass){
        return Tasks.instrumented(Iniciar.class, user,pass);
    }
}
