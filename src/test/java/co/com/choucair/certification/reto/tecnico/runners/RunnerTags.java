package co.com.choucair.certification.reto.tecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/reto.feature",
        tags = "@caso1",
        glue = "co.com.choucair.certification.reto.tecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
