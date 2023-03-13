package org.example.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.Task.GoTo;
import org.example.Task.Iniciar;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;



public class StepDefinitions {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that Cris go to page")
    public void givenThatCrisGoTPage(){
        theActorCalled("actor").wasAbleTo(GoTo.theUrl());

    }
    @When("Cris using the credentials on register {string} {string}")
    public void whenCrisUsingTheCredentialsOnRegister(String user, String pass){
        theActorInTheSpotlight().attemptsTo(Iniciar.Sesion(user,pass));
    }
    @Then("Cris see the homepage")
    public void thenCrisSeeTheHomepage(){

    }
}
