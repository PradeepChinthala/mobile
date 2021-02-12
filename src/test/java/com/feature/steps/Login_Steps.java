package com.feature.steps;

import com.pageobjects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

public class Login_Steps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	LoginPage oLogin;
	
	@Given("^user opened kpcu application$")
	public void user_opened_kpcu_application() {
		oLogin.open_KPCU_Application();
	}

	@When("^user enter \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enter(String userName, String password) throws InterruptedException {
		oLogin.enterUserNameandPassword(userName,password);
	}

	@Then("^user should see login \"([^\"]*)\" message$")
	public void user_should_see_login_message(String message) throws InterruptedException {
		oLogin.verifyMessge(message);
	}
}
