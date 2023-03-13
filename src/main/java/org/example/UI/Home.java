package org.example.UI;

import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target Profile = Target.the("Profile").locatedBy(".flex .login");
    public static final Target User = Target.the("User").locatedBy("#email");
    public static final Target Pass = Target.the("Pass").locatedBy("#passwd");

}
