package com.co.choucair.certificacion.utest.tasks;

import com.co.choucair.certificacion.utest.UI.SignUpDevicePage;
import com.co.choucair.certificacion.utest.models.NewAccountData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class AddDevices implements Task {
    List<NewAccountData> newAccountDataList;

    public AddDevices(List<NewAccountData> newAccountDataList) {
        this.newAccountDataList = newAccountDataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SignUpDevicePage.X_COMP_BTN),
                Click.on(SignUpDevicePage.COMPUTER_TXT),
                Enter.theValue(newAccountDataList.get(0).getComputer()).into(SignUpDevicePage.COMPUTER1_TXT)
                        .thenHit(Keys.ENTER),
                Click.on(SignUpDevicePage.VERSION_TXT),
                Enter.theValue(newAccountDataList.get(0).getVersionpc()).into(SignUpDevicePage.VERSION1_TXT).thenHit(Keys.ENTER),
                Click.on(SignUpDevicePage.LANGUAGE_TXT),
                Enter.theValue(newAccountDataList.get(0).getLanguagepc()).into(SignUpDevicePage.LANGUAGE1_TXT).thenHit(Keys.ENTER),
                Click.on(SignUpDevicePage.MOBILE_TXT),
                Enter.theValue(newAccountDataList.get(0).getMobile()).into(SignUpDevicePage.MOBILE1_TXT).thenHit(Keys.ENTER),
                Click.on(SignUpDevicePage.MODEL_MOBILE_TXT),
                Enter.theValue(newAccountDataList.get(0).getModelmobile()).into(SignUpDevicePage.MODEL_MOBILE1_TXT).thenHit(Keys.ENTER),
                Click.on(SignUpDevicePage.OPERATING_SYSTEM_TXT),
                Enter.theValue(newAccountDataList.get(0).getOsmobile()).into(SignUpDevicePage.OPERATING_SYSTEM1_TXT).thenHit(Keys.ENTER),
                Click.on(SignUpDevicePage.LAST_STEP_BTN)
        );
    }

    public static AddDevices withData(List<NewAccountData> newAccountDataList) {
        return Tasks.instrumented(AddDevices.class, newAccountDataList);
    }
}
