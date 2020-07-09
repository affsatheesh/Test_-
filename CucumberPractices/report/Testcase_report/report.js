$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFile/Testcase3_login.feature");
formatter.feature({
  "line": 1,
  "name": "open the Browser enter The test Url and Login",
  "description": "",
  "id": "open-the-browser-enter-the-test-url-and-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Homepage must be displayed",
  "description": "",
  "id": "open-the-browser-enter-the-test-url-and-login;homepage-must-be-displayed",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Enter the login",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters \"\u003cname\u003e\" and password \"\u003cpass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "click the Submit button",
  "keyword": "And "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "open-the-browser-enter-the-test-url-and-login;homepage-must-be-displayed;",
  "rows": [
    {
      "cells": [
        "name",
        "pass"
      ],
      "line": 8,
      "id": "open-the-browser-enter-the-test-url-and-login;homepage-must-be-displayed;;1"
    },
    {
      "cells": [
        "affsatheesh@gmail.com",
        "Timeover"
      ],
      "line": 9,
      "id": "open-the-browser-enter-the-test-url-and-login;homepage-must-be-displayed;;2"
    },
    {
      "cells": [
        "affsatheesh@gmail.com",
        "Timeend"
      ],
      "line": 10,
      "id": "open-the-browser-enter-the-test-url-and-login;homepage-must-be-displayed;;3"
    },
    {
      "cells": [
        "sath@gmail.com",
        "Timeover"
      ],
      "line": 11,
      "id": "open-the-browser-enter-the-test-url-and-login;homepage-must-be-displayed;;4"
    },
    {
      "cells": [
        "sath@gmail.com",
        "Timeeend"
      ],
      "line": 12,
      "id": "open-the-browser-enter-the-test-url-and-login;homepage-must-be-displayed;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "Homepage must be displayed",
  "description": "",
  "id": "open-the-browser-enter-the-test-url-and-login;homepage-must-be-displayed;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Enter the login",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters \"affsatheesh@gmail.com\" and password \"Timeover\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "click the Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Testcase_3.enter_the_login()"
});
formatter.result({
  "duration": 12834883234,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "affsatheesh@gmail.com",
      "offset": 13
    },
    {
      "val": "Timeover",
      "offset": 50
    }
  ],
  "location": "Testcase_3.user_enters_and_password(String,String)"
});
formatter.result({
  "duration": 5664337742,
  "status": "passed"
});
formatter.match({
  "location": "Testcase_2.click_the_Submit_button()"
});
formatter.result({
  "duration": 737482,
  "error_message": "java.lang.NullPointerException\r\n\tat Steps.Testcase_2.click_the_Submit_button(Testcase_2.java:54)\r\n\tat ✽.And click the Submit button(FeatureFile/Testcase3_login.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 10,
  "name": "Homepage must be displayed",
  "description": "",
  "id": "open-the-browser-enter-the-test-url-and-login;homepage-must-be-displayed;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Enter the login",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters \"affsatheesh@gmail.com\" and password \"Timeend\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "click the Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Testcase_3.enter_the_login()"
});
formatter.result({
  "duration": 7665453496,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "affsatheesh@gmail.com",
      "offset": 13
    },
    {
      "val": "Timeend",
      "offset": 50
    }
  ],
  "location": "Testcase_3.user_enters_and_password(String,String)"
});
formatter.result({
  "duration": 4270006822,
  "error_message": "java.lang.NullPointerException\r\n\tat Steps.Testcase_3.user_enters_and_password(Testcase_3.java:73)\r\n\tat ✽.When User enters \"affsatheesh@gmail.com\" and password \"Timeend\"(FeatureFile/Testcase3_login.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Testcase_2.click_the_Submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "Homepage must be displayed",
  "description": "",
  "id": "open-the-browser-enter-the-test-url-and-login;homepage-must-be-displayed;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Enter the login",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters \"sath@gmail.com\" and password \"Timeover\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "click the Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Testcase_3.enter_the_login()"
});
formatter.result({
  "duration": 11376152407,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sath@gmail.com",
      "offset": 13
    },
    {
      "val": "Timeover",
      "offset": 43
    }
  ],
  "location": "Testcase_3.user_enters_and_password(String,String)"
});
formatter.result({
  "duration": 22449596120,
  "error_message": "java.lang.NullPointerException\r\n\tat Steps.Testcase_3.user_enters_and_password(Testcase_3.java:73)\r\n\tat ✽.When User enters \"sath@gmail.com\" and password \"Timeover\"(FeatureFile/Testcase3_login.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Testcase_2.click_the_Submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 12,
  "name": "Homepage must be displayed",
  "description": "",
  "id": "open-the-browser-enter-the-test-url-and-login;homepage-must-be-displayed;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Enter the login",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters \"sath@gmail.com\" and password \"Timeeend\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "click the Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Testcase_3.enter_the_login()"
});
formatter.result({
  "duration": 15540237968,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sath@gmail.com",
      "offset": 13
    },
    {
      "val": "Timeeend",
      "offset": 43
    }
  ],
  "location": "Testcase_3.user_enters_and_password(String,String)"
});
formatter.result({
  "duration": 10350846370,
  "error_message": "java.lang.NullPointerException\r\n\tat Steps.Testcase_3.user_enters_and_password(Testcase_3.java:73)\r\n\tat ✽.When User enters \"sath@gmail.com\" and password \"Timeeend\"(FeatureFile/Testcase3_login.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Testcase_2.click_the_Submit_button()"
});
formatter.result({
  "status": "skipped"
});
});