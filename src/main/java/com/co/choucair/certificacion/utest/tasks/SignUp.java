package com.co.choucair.certificacion.utest.tasks;

import com.co.choucair.certificacion.utest.UI.HomePage;
import com.co.choucair.certificacion.utest.UI.SignUpPersonalPage;
import com.co.choucair.certificacion.utest.models.NewAccountData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.List;

public class SignUp implements Task {

    List<NewAccountData> newAccountDataList;

    public SignUp(List<NewAccountData> newAccountDataList) {
        this.newAccountDataList = newAccountDataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.JOIN_TODAY_BTN),
                Enter.theValue(newAccountDataList.get(0).getFirstname()).into(SignUpPersonalPage.FIRST_NAME_TXT),
                Enter.theValue(newAccountDataList.get(0).getLastname()).into(SignUpPersonalPage.LAST_NAME_TXT),
                Enter.theValue(newAccountDataList.get(0).getEmail()).into(SignUpPersonalPage.EMAIL_ADDRESS_TXT),
                SelectFromOptions.byVisibleText(newAccountDataList.get(0).getBirthmonth()).from(SignUpPersonalPage.BIRTH_MONTH_SLT),
                SelectFromOptions.byVisibleText(newAccountDataList.get(0).getBirthday()).from(SignUpPersonalPage.BIRTH_DAY_SLT),
                SelectFromOptions.byVisibleText(newAccountDataList.get(0).getBirthyear()).from(SignUpPersonalPage.BIRTH_YEAR_SLT),
                SendKeys.of(Keys.TAB).into(SignUpPersonalPage.BIRTH_YEAR_SLT),
                Enter.theValue(newAccountDataList.get(0).getLanguage()).into(SignUpPersonalPage.SPOKEN_LANGUAGES_TXT).thenHit(Keys.ENTER),
                Click.on(SignUpPersonalPage.NEXT_LOCATION_BTN));
    }

    public static SignUp theAccount(List<NewAccountData> newAccountDataList) {
        return Tasks.instrumented(SignUp.class, newAccountDataList);
    }
}
