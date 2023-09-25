$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/test.feature");
formatter.feature({
  "name": "Testing tagged hooks",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "name": "Test the search results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Google is open in the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.test.google_is_open_in_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for Lambda Test",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.test.user_searches_for_lambda_test()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cinput class\u003d\"gNO89b\" value\u003d\"Google Search\" aria-label\u003d\"Google Search\" name\u003d\"btnK\" role\u003d\"button\" tabindex\u003d\"0\" type\u003d\"submit\" data-ved\u003d\"0ahUKEwi9ur_tk8L5AhXq-jgGHSKzCEoQ4dUDCAs\"\u003e is not clickable at point (554, 271). Other element would receive the click: \u003cspan\u003e...\u003c/span\u003e\n  (Session info: chrome\u003d104.0.5112.81)\nBuild info: version: \u00273.10.0\u0027, revision: \u0027176b4a9\u0027, time: \u00272018-03-02T19:03:16.397Z\u0027\nSystem info: host: \u0027DESKTOP-7URC45I\u0027, ip: \u0027192.168.0.217\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 104.0.5112.81, chrome: {chromedriverVersion: 104.0.5112.79 (3cf3e8c8a07d..., userDataDir: C:\\Users\\Home\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:53650}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f569f7e5472b29321ea7f29f61d7f04f\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat StepDef.test.user_searches_for_lambda_test(test.java:31)\r\n\tat ✽.User searches for Lambda Test(file:///D:/WorkSpace_Repo/Automation_01/src/test/resources/Features/test.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.test.results_are_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test the search results again",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Google is open in the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.test.google_is_open_in_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for Selenium cross browser testing",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.test.user_searches_for_Selenium_cross_browser_testing()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cinput class\u003d\"gNO89b\" value\u003d\"Google Search\" aria-label\u003d\"Google Search\" name\u003d\"btnK\" role\u003d\"button\" tabindex\u003d\"0\" type\u003d\"submit\" data-ved\u003d\"0ahUKEwiHg5Lwk8L5AhWd-DgGHUokCLYQ4dUDCAs\"\u003e is not clickable at point (554, 271). Other element would receive the click: \u003cspan\u003e...\u003c/span\u003e\n  (Session info: chrome\u003d104.0.5112.81)\nBuild info: version: \u00273.10.0\u0027, revision: \u0027176b4a9\u0027, time: \u00272018-03-02T19:03:16.397Z\u0027\nSystem info: host: \u0027DESKTOP-7URC45I\u0027, ip: \u0027192.168.0.217\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 104.0.5112.81, chrome: {chromedriverVersion: 104.0.5112.79 (3cf3e8c8a07d..., userDataDir: C:\\Users\\Home\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:53702}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d52b227fbcdcf23b099cde3c54790953\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat StepDef.test.user_searches_for_Selenium_cross_browser_testing(test.java:38)\r\n\tat ✽.User searches for Selenium cross browser testing(file:///D:/WorkSpace_Repo/Automation_01/src/test/resources/Features/test.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.test.results_are_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test the search results for more than two keywords",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@E2E"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Google is open in the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.test.google_is_open_in_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters more than two keywords",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.test.user_enters_more_than_two_keywords()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.test.results_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});