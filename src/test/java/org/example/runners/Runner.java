package org.example.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"org.example.stepdefinitions"},
        features = {"src/test/resources/Features/FeatureEX.feature"},
        tags = ""
)
public class Runner {

}