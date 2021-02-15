$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/login.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Validate Invalid User",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@invalidlogin"
    }
  ]
});
formatter.step({
  "name": "user opened kpcu application",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Steps.user_opened_kpcu_application()"
});
formatter.result({
  "error_message": "net.thucydides.core.pages.WrongPageError: The page object class com.pageobjects.LoginPage looks dodgy:\nFailed to instantiate page (net.thucydides.core.webdriver.DriverConfigurationError: Could not instantiate class io.appium.java_client.AppiumDriver)\r\n\tat net.thucydides.core.pages.Pages.thisPageObjectLooksDodgy(Pages.java:296)\r\n\tat net.thucydides.core.pages.Pages.getCurrentPageOfType(Pages.java:224)\r\n\tat net.thucydides.core.pages.Pages.getPage(Pages.java:91)\r\n\tat net.thucydides.core.steps.PageObjectDependencyInjector.instantiatePageObjectIfNotAssigned(PageObjectDependencyInjector.java:58)\r\n\tat net.thucydides.core.steps.PageObjectDependencyInjector.injectDependenciesInto(PageObjectDependencyInjector.java:36)\r\n\tat net.serenitybdd.core.Serenity.injectDependenciesInto(Serenity.java:63)\r\n\tat net.serenitybdd.core.Serenity.initializeWithNoStepListener(Serenity.java:104)\r\n\tat cucumber.runtime.SerenityObjectFactory.newInstance(SerenityObjectFactory.java:68)\r\n\tat cucumber.runtime.SerenityObjectFactory.cacheNewInstance(SerenityObjectFactory.java:51)\r\n\tat cucumber.runtime.SerenityObjectFactory.getInstance(SerenityObjectFactory.java:41)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:40)\r\n\tat cucumber.api.TestStep.executeStep(TestStep.java:102)\r\n\tat cucumber.api.TestStep.run(TestStep.java:83)\r\n\tat cucumber.api.TestCase.run(TestCase.java:58)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:118)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:56)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:127)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n\tat ✽.user opened kpcu application(Features/login.feature:15)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter \"dfdfdfgdg\",\"dfgfhghh\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Steps.user_enter(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should see login \"error\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Steps.user_should_see_login_message(String)"
});
formatter.result({
  "status": "skipped"
});
});