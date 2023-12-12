package com.co.choucair.certificacion.utest.UI;

import net.serenitybdd.screenplay.targets.Target;

public class SignUpDevicePage {

    public static final Target COMPUTER_TXT= Target.the("the field to type the computer")
            .locatedBy("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span");

    public static final Target COMPUTER1_TXT= Target.the("the field to type the computer")
            .locatedBy("//*[@id='web-device']/div[1]/div[2]/div/input[1]");

    public static final Target X_COMP_BTN= Target.the("the button to delete the computer selected")
            .locatedBy("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span/a/i");

    public static final Target VERSION_TXT= Target.the("the button to type the version pc")
            .locatedBy("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span");

    public static final Target VERSION1_TXT= Target.the("the button to type the version pc")
            .locatedBy("//*[@id='web-device']/div[2]/div[2]/div/input[1]");

    public static final Target LANGUAGE_TXT= Target.the("the button to type the langau pc")
            .locatedBy("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span");

    public static final Target LANGUAGE1_TXT= Target.the("the button to type the langau pc")
            .locatedBy("//*[@id='web-device']/div[3]/div[2]/div/input[1]");

 public static final Target MOBILE_TXT= Target.the("the field to type the mobile device brand")
            .locatedBy("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span");

 public static final Target MOBILE1_TXT= Target.the("the field to type the mobile device brand")
            .locatedBy("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]");

 public static final Target MODEL_MOBILE_TXT= Target.the("the field to choose the device model")
            .locatedBy("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span");

 public static final Target MODEL_MOBILE1_TXT= Target.the("the field to choose the device model")
            .locatedBy("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]");

 public static final Target OPERATING_SYSTEM_TXT= Target.the("the field to choose the SO mobile")
            .locatedBy("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span");

 public static final Target OPERATING_SYSTEM1_TXT= Target.the("the field to choose the SO mobile")
            .locatedBy("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]");


 public static final Target LAST_STEP_BTN= Target.the("the button to continue to the last step")
            .locatedBy("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a");




}
