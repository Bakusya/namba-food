$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Namba Food Login",
  "description": "",
  "id": "namba-food-login",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Я как пользователь должен зайти на сайт nambafood",
  "keyword": "Given "
});
formatter.match({
  "location": "Welcomepage_steps.я_как_пользователь_должен_зайти_на_сайт_nambafood()"
});
formatter.result({
  "duration": 50844735700,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Я как пользователь должен войти в систему с валидными данными",
  "description": "",
  "id": "namba-food-login;я-как-пользователь-должен-войти-в-систему-с-валидными-данными",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Пользователь должен нажать на кнопку ВОЙТИ",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Пользователь войдет в систему с этими данными",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10
    },
    {
      "cells": [
        "baktygulakimbekova@gmail.com",
        "Aseinova8"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Пользователь должен успешно войти в систему",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_steps.пользователь_должен_нажать_на_кнопку_ВОЙТИ()"
});
formatter.result({
  "duration": 3356916600,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.пользователь_войдет_в_систему_с_этими_данными(LoginDataContainer\u003e)"
});
formatter.result({
  "duration": 925637400,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.пользователь_должен_успешно_войти_в_систему()"
});
formatter.result({
  "duration": 2774720400,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Здравствуйте, Бактыгул ]\u003e but was:\u003c[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat step_definitions.Login_steps.пользователь_должен_успешно_войти_в_систему(Login_steps.java:41)\r\n\tat ✽.Then Пользователь должен успешно войти в систему(features/Login.feature:12)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2941206200,
  "status": "passed"
});
});