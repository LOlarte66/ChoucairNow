package com.co.choucair.certificacion.utest.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPersonalPage {

    public static final Target FIRST_NAME_TXT= Target.the("the field to type the first name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME_TXT= Target.the("the field to type the last name")
            .located(By.id("lastName"));

    public static final Target EMAIL_ADDRESS_TXT= Target.the("the field to type the email")
            .located(By.id("email"));

    public static final Target BIRTH_MONTH_SLT= Target.the("the list to choose the birth month")
            .located(By.id("birthMonth"));

    public static final Target BIRTH_DAY_SLT= Target.the("the list to choose the birth day")
            .located(By.id("birthDay"));

    public static final Target BIRTH_YEAR_SLT= Target.the("the list to choose the birth year")
            .located(By.id("birthYear"));

    public static final Target SPOKEN_LANGUAGES_TXT= Target.the("the field to type the languages learned")
            .locatedBy("//*[@id='languages']/div[1]/input");

    public static final Target NEXT_LOCATION_BTN= Target.the("the button to continue the processes")
            .locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a");

}
