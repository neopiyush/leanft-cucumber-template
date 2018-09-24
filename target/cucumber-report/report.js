$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Successful Register on newtours portal",
  "description": "",
  "id": "registration;successful-register-on-newtours-portal",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on \"Home\" Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Register Link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter Contact information \"\u003cfirstname\u003e\" , \"\u003clastname\u003e\" , \"\u003cphone\u003e\" and \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter mailing information \"\u003caddress\u003e\" , \"\u003ccity\u003e\" , \"\u003cstate\u003e\" , \"\u003cpostal\u003e\" and \"\u003ccountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter user information \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "UserName should be generated",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Generated UserName should be same as \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "registration;successful-register-on-newtours-portal;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "phone",
        "email",
        "address",
        "city",
        "state",
        "postal",
        "country",
        "username",
        "password"
      ],
      "line": 15,
      "id": "registration;successful-register-on-newtours-portal;;1"
    },
    {
      "cells": [
        "neo",
        "automation",
        "9999911111",
        "neo@test.com",
        "14th cross",
        "Indore",
        "MP",
        "12",
        "INDIA",
        "neoautomation",
        "neo@test"
      ],
      "line": 16,
      "id": "registration;successful-register-on-newtours-portal;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4755847728,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Successful Register on newtours portal",
  "description": "",
  "id": "registration;successful-register-on-newtours-portal;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on \"Home\" Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Register Link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter Contact information \"neo\" , \"automation\" , \"9999911111\" and \"neo@test.com\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter mailing information \"14th cross\" , \"Indore\" , \"MP\" , \"12\" and \"INDIA\"",
  "matchedColumns": [
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter user information \"neoautomation\" and \"neo@test\"",
  "matchedColumns": [
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "UserName should be generated",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Generated UserName should be same as \"neo@test.com\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 12
    }
  ],
  "location": "StepDefinitions.user_is_on_Page(String)"
});
formatter.result({
  "duration": 5209723568,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_Register_Link()"
});
formatter.result({
  "duration": 345108531,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "neo",
      "offset": 27
    },
    {
      "val": "automation",
      "offset": 35
    },
    {
      "val": "9999911111",
      "offset": 50
    },
    {
      "val": "neo@test.com",
      "offset": 67
    }
  ],
  "location": "StepDefinitions.enter_Contact_information_and(String,String,String,String)"
});
formatter.result({
  "duration": 2843527135,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "14th cross",
      "offset": 27
    },
    {
      "val": "Indore",
      "offset": 42
    },
    {
      "val": "MP",
      "offset": 53
    },
    {
      "val": "12",
      "offset": 60
    },
    {
      "val": "INDIA",
      "offset": 69
    }
  ],
  "location": "StepDefinitions.enter_mailing_information_and(String,String,String,String,String)"
});
formatter.result({
  "duration": 1102290931,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "neoautomation",
      "offset": 24
    },
    {
      "val": "neo@test",
      "offset": 44
    }
  ],
  "location": "StepDefinitions.enter_user_information_and(String,String)"
});
formatter.result({
  "duration": 764377235,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.click_on_Register_button()"
});
formatter.result({
  "duration": 199232909,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.username_should_be_generated()"
});
formatter.result({
  "duration": 25461739393,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "neo@test.com",
      "offset": 38
    }
  ],
  "location": "StepDefinitions.generated_UserName_should_be_same_as_neoautomation(String)"
});
formatter.result({
  "duration": 138956721,
  "status": "passed"
});
formatter.after({
  "duration": 1601940782,
  "status": "passed"
});
});