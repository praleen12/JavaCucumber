$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/dockerExample.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate docker run on chromwe",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@docker"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Docker run Open Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.DockerExampleSteps.docker_run_Open_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Docker run user is on search page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.DockerExampleSteps.docker_run_user_is_on_search_p_age()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});