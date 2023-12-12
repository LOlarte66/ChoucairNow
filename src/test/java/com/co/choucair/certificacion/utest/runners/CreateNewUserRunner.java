package com.co.choucair.certificacion.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features/create_new_user.feature",
                 glue = "com.co.choucair.certificacion.utest.stepsdefinition",
                 snippets = SnippetType.CAMELCASE,
                 dryRun = false)
public class CreateNewUserRunner {
}
