package com.co.choucair.certificacion.utest.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpAddressPage {


    public static final Target CITY_TXT= Target.the("the field to type the city")
            .locatedBy("//*[@id='city']/ngf-single-select/ngf-autocomplete-input/ngf-input-container/div/div[2]/input");

    public static final Target X_BTN= Target.the("the button to delete the ubication selected")
            .locatedBy("//*[@id='city']/ngf-single-select/ngf-autocomplete-input/ngf-input-container/div/div[2]/button/mat-icon");

    public static final Target lOCATION_BTN= Target.the("the ubication selected")
            .locatedBy("//*[@id='cdk-overlay-0']/ngf-options-container/ngf-option/div");

    public static final Target ZIP_BTN= Target.the("the zip code")
            .located(By.id("zip"));

    public static final Target COUNTRY_TXT= Target.the("the filed to type the country")
            .locatedBy("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]");

    public static final Target NEXT_DEVICE_BTN= Target.the("the button to continue the register")
            .locatedBy("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a");

}
