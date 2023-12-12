package com.co.choucair.certificacion.utest.tasks;

import com.co.choucair.certificacion.utest.UI.SignUpAddressPage;
import com.co.choucair.certificacion.utest.models.NewAccountData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class AddAddress implements Task {
    List<NewAccountData> newAccountDataList;

    public AddAddress(List<NewAccountData> newAccountDataList) {
        this.newAccountDataList = newAccountDataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SignUpAddressPage.X_BTN),
                Enter.theValue(newAccountDataList.get(0).getCity())
                        .into(SignUpAddressPage.CITY_TXT)
                        .thenHit(Keys.ENTER), Click.on(SignUpAddressPage.lOCATION_BTN),
                Enter.theValue(newAccountDataList.get(0).getZip()).into(SignUpAddressPage.ZIP_BTN).thenHit(Keys.TAB).thenHit(Keys.DELETE),
                Enter.theValue(newAccountDataList.get(0).getCountry()).into(SignUpAddressPage.COUNTRY_TXT).thenHit(Keys.ENTER),
                Click.on(SignUpAddressPage.NEXT_DEVICE_BTN));
    }

    public static AddAddress withData(List<NewAccountData> newAccountDataList) {
        return Tasks.instrumented(AddAddress.class, newAccountDataList);
    }
}
