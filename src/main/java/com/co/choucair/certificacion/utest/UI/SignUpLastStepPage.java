package com.co.choucair.certificacion.utest.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpLastStepPage {

    public static final Target PASSWORD_TXT= Target.the("the field to type the password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_TXT= Target.the("the field to type the confirm password")
            .located(By.id("confirmPassword"));

    public static final Target BOX_TERMS1_BTN= Target.the("the button to continue to the last step")
            .locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]");

    public static final Target BOX_TERMS2_BTN= Target.the("the button to continue to the last step")
            .locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]");

    public static final Target COMPLETE_SETUP_BTN= Target.the("the button to continue to the last step")
            .locatedBy("//*[@id='laddaBtn']");

    public static final Target FINAL_MESSAGE_LBL= Target.the("the label that indicate check the mail (formyself, the final)")
            .locatedBy("//*[contains(text(), 'First, please check your email inbox')]");



}
