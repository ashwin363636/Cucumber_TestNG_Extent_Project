package com.cucumber.testng.stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

    @Given("^Open Application and Enter url$")
    public void open_Application_and_Enter_url() throws Throwable {
        System.out.println("Hit the Application URL");
    }

    @When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter(String username, String password) throws Throwable {
        System.out.println("Enter username" + username + " and password "+ password);
    }

    @Then("^verify I see Logout Link$")
    public void verify_I_see_Logout_Link() throws Throwable {
        System.out.println("Verifying logout link");
    }
}
