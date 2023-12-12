package com.co.choucair.certificacion.utest.stepsdefinition;

import com.co.choucair.certificacion.utest.exceptions.GeneralException;
import com.co.choucair.certificacion.utest.models.NewAccountData;
import com.co.choucair.certificacion.utest.questions.TheFinalMessage;
import com.co.choucair.certificacion.utest.tasks.AddAddress;
import com.co.choucair.certificacion.utest.tasks.AddDevices;
import com.co.choucair.certificacion.utest.tasks.AddPassword;
import com.co.choucair.certificacion.utest.tasks.SignUp;
import com.co.choucair.certificacion.utest.utils.Constants;
import com.co.choucair.certificacion.utest.utils.ValidationErrorMessages;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.*;

public class CreateNewUserStepDefinition {

    @Managed
    private WebDriver myDriver;
    Actor Lu;

    @Before
    public void setUp(){

       // WebDriverManager.chromedriver().setup();
        //myDriver=new ChromeDriver();


        OnStage.setTheStage(Cast.ofStandardActors());
        Lu=OnStage.theActorCalled("Lu");
        Lu.can(BrowseTheWeb.with(myDriver));
    }
    @Given("^the User has accessed the main page$")
    public void theUserHasAccessedTheMainPage() {
        Lu.wasAbleTo(Open.url(Constants.URL));
    }


    @When("^the User tries to register his account$")
    public void theUserTriesToRegisterHisAccount(List<NewAccountData>newAccountDataList) {
        Lu.attemptsTo(SignUp.theAccount(newAccountDataList));
    }

    @When("^the user adds the address$")
    public void theUserAddsTheAddress(List<NewAccountData>newAccountDataList) {
        Lu.attemptsTo(AddAddress.withData(newAccountDataList));
    }


    @When("^the user adds his devices$")
    public void theUserAddsHisDevices(List<NewAccountData>newAccountDataList) {
        Lu.attemptsTo(AddDevices.withData(newAccountDataList));
    }

    @When("^the user adds one password$")
    public void theUserAddsOnePassword(List<NewAccountData>newAccountDataList) {
        Lu.attemptsTo(AddPassword.withData(newAccountDataList));
    }

    @Then("^the User will see his account created$")
    public void theUserWillSeeHisAccountCreated() {
        Lu.should(seeThat(TheFinalMessage.ofSignUp(),
                is(equalTo(Constants.FinalMessageExpected))).orComplainWith(GeneralException.class,
                ValidationErrorMessages.WRONG_FINAL_SIGN_UP_MESSAGE));
    }



}
