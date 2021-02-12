package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( plugin = {"pretty", "html:target/cucumber-html-report"},
features="Features",glue={"com.feature.steps"},tags={"@login"},monochrome = true,dryRun=false)
public class TestRunner {

}
