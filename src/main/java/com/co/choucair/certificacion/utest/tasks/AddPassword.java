package com.co.choucair.certificacion.utest.tasks;

import com.co.choucair.certificacion.utest.UI.SignUpLastStepPage;
import com.co.choucair.certificacion.utest.models.NewAccountData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class AddPassword implements Task {

    List<NewAccountData> newAccountDataList;

    public AddPassword(List<NewAccountData> newAccountDataList) {
        this.newAccountDataList = newAccountDataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(newAccountDataList.get(0).getPassword()).into(SignUpLastStepPage.PASSWORD_TXT),
                Enter.theValue(newAccountDataList.get(0).getPassword()).into(SignUpLastStepPage.CONFIRM_PASSWORD_TXT),
                Click.on(SignUpLastStepPage.BOX_TERMS1_BTN),
                Click.on(SignUpLastStepPage.BOX_TERMS2_BTN),
                Click.on(SignUpLastStepPage.COMPLETE_SETUP_BTN),
                WaitUntil.the(SignUpLastStepPage.FINAL_MESSAGE_LBL, WebElementStateMatchers
                        .isVisible())
        );
    }


    public static AddPassword withData(List<NewAccountData>newAccountDataList){
        return Tasks.instrumented(AddPassword.class,newAccountDataList);
    }
}
