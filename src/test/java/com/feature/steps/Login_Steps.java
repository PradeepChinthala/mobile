package com.feature.steps;

import org.junit.Assert;

import com.pageobjects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.ScenarioSteps;

public class Login_Steps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	LoginPage oLogin;	
	

	public static void Verify(String StepDetails, String sStatus) {
        if (sStatus.equalsIgnoreCase("PASSED")) {
            System.out.println(StepDetails);
            Serenity.recordReportData().withTitle(StepDetails).andContents(sStatus);
            Assert.assertTrue(StepDetails, true);
        } else {
            Serenity.recordReportData().withTitle(StepDetails).andContents(sStatus);
            Serenity.takeScreenshot();
            System.out.println(StepDetails);
            Assert.assertTrue(StepDetails, false);
        }
    }
	
	@Given("^user opened kpcu application$")
	public void user_opened_kpcu_application() {		
		oLogin.open_KPCU_Application();
		Verify("PASSED","Test Case");
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
