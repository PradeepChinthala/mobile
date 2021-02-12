$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/test.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify successful login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
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
  "status": "passed"
});
formatter.step({
  "name": "user enter \"pradeep\",\"123456\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Steps.user_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see login \"error\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Steps.user_should_see_login_message(String)"
});
formatter.result({
  "status": "passed"
});
});