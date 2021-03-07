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
  "name": "Validate User login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@lyy"
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
  "error_message": "java.lang.AssertionError: PASSED\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.feature.steps.Login_Steps.Verify(Login_Steps.java:33)\r\n\tat com.feature.steps.Login_Steps.user_opened_kpcu_application(Login_Steps.java:40)\r\n\tat ✽.user opened kpcu application(Features/login.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter \"testaapple\",\"Welcome2kpcu!\"",
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