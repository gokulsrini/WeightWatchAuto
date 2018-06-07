$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WWatchers.feature");
formatter.feature({
  "line": 1,
  "name": "Weight Watchers Assessment",
  "description": "",
  "id": "weight-watchers-assessment",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Program-2",
  "description": "",
  "id": "weight-watchers-assessment;program-2",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Weightwatchers page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "verify the given text",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on find a meeting link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "verify if title contains desired text",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "search for meeting with zipcode",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "print the title of the result",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on the first search result and verify location",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "print todays hours of operation",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "weight-watchers-assessment;program-2;",
  "rows": [
    {
      "cells": [
        ""
      ],
      "line": 22,
      "id": "weight-watchers-assessment;program-2;;1"
    },
    {
      "cells": [
        ""
      ],
      "line": 23,
      "id": "weight-watchers-assessment;program-2;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "Program-2",
  "description": "",
  "id": "weight-watchers-assessment;program-2;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on Weightwatchers page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "verify the given text",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on find a meeting link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "verify if title contains desired text",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "search for meeting with zipcode",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "print the title of the result",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on the first search result and verify location",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "print todays hours of operation",
  "keyword": "Then "
});
formatter.match({
  "location": "Wwisteps.user_is_on_Weightwatchers_page()"
});
formatter.result({
  "duration": 4624823681,
  "status": "passed"
});
formatter.match({
  "location": "Wwisteps.verify_the_given_text()"
});
formatter.result({
  "duration": 2030604758,
  "status": "passed"
});
formatter.match({
  "location": "Wwisteps.click_on_find_a_meeting_link()"
});
formatter.result({
  "duration": 5447939383,
  "status": "passed"
});
formatter.match({
  "location": "Wwisteps.verify_if_title_contains_desired_text()"
});
formatter.result({
  "duration": 2027273111,
  "status": "passed"
});
formatter.match({
  "location": "Wwisteps.search_for_meeting_with_zipcode()"
});
formatter.result({
  "duration": 32778713203,
  "status": "passed"
});
formatter.match({
  "location": "Wwisteps.print_the_title_of_the_result()"
});
formatter.result({
  "duration": 2444615030,
  "status": "passed"
});
formatter.match({
  "location": "Wwisteps.click_on_the_first_search_result_and_verify_location()"
});
formatter.result({
  "duration": 7790490659,
  "status": "passed"
});
formatter.match({
  "location": "Wwisteps.print_todays_hours_of_operation()"
});
formatter.result({
  "duration": 2406703697,
  "status": "passed"
});
});