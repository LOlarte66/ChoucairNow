package com.co.choucair.certificacion.utest.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target JOIN_TODAY_BTN=Target.the("button to sign up").
            located(By.className("unauthenticated-nav-bar__sign-up"));
}
