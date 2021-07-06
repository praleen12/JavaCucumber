$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/hooksDemo.feature");
formatter.feature({
  "name": "Login check search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@leenatest"
    }
  ]
});
formatter.step({
  "name": "User navigate to tyhe application url",
  "keyword": "And "
});
formatter.step({
  "name": "User enters the \u003cid\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "User is logged in",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "id",
        "password"
      ]
    },
    {
      "cells": [
        "Raghav",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@leenatest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to tyhe application url",
  "keyword": "And "
});
formatter.match({
  "location": "hooksStep.HooksDemoSteps.user_navigate_to_tyhe_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Raghav and 12345",
  "keyword": "And "
});
formatter.match({
  "location": "hooksStep.HooksDemoSteps.user_enters_the_Raghav_and(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "hooksStep.HooksDemoSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "hooksStep.HooksDemoSteps.user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});