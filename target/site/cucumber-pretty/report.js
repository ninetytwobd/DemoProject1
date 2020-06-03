$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify user can login successfully",
  "description": "",
  "id": "login;verify-user-can-login-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open page \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on SignIN Button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on SignIN Link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter user name Enter Password Click on Signin",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify user can login successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 11
    }
  ],
  "location": "LoginStepDep.Open_page(String)"
});
formatter.result({
  "duration": 6304229400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDep.click_on_SignIN_Button()"
});
formatter.result({
  "duration": 432636900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDep.click_on_SignIN_Link()"
});
formatter.result({
  "duration": 5371529500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDep.enter_user_name_Enter_Password_Click_on_Signin()"
});
formatter.result({
  "duration": 4331715300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDep.verify_user_can_login_successfully()"
});
formatter.result({
  "duration": 407358000,
  "status": "passed"
});
});