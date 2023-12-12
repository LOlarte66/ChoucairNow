package com.co.choucair.certificacion.utest.questions;

import com.co.choucair.certificacion.utest.UI.SignUpLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheFinalMessage implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        String mess= Text.of(SignUpLastStepPage.FINAL_MESSAGE_LBL).viewedBy(actor).asString();
        return mess;}

        public static TheFinalMessage ofSignUp(){return new TheFinalMessage();}
}

