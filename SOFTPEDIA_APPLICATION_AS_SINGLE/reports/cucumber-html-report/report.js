$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/BLTuser.BLT215/Desktop/SOFTPEDIA_APPLICATION_AS_SINGLE/src/main/resources/feature/TestScenario.feature");
formatter.feature({
  "line": 2,
  "name": "SoftPedia Application",
  "description": "",
  "id": "softpedia-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@softpedia"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "To Create a account",
  "id": "softpedia-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_reg"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "launch and registration",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_softpedia.launch_and_registration()"
});
formatter.result({
  "duration": 93271565257,
  "status": "passed"
});
formatter.match({
  "location": "Definition_softpedia.close_the_browser()"
});
formatter.result({
  "duration": 3034027530,
  "error_message": "org.openqa.selenium.NoSuchSessionException: invalid session id\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027BLT215\u0027, ip: \u0027192.168.1.215\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\BLTUSE~1.BLT\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:58453}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 46c1b3d13cf7f4f301bf5f68c19a3a42\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:442)\r\n\tat com.Pages.Page_softpedia.quit(Page_softpedia.java:94)\r\n\tat com.StepDefinition.Definition_softpedia.close_the_browser(Definition_softpedia.java:25)\r\n\tat ✽.And close the browser(C:/Users/BLTuser.BLT215/Desktop/SOFTPEDIA_APPLICATION_AS_SINGLE/src/main/resources/feature/TestScenario.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "Login account",
  "id": "softpedia-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@tc_02_login"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "launch application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "click the user icon and enter username password",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_softpedia.launch_application()"
});
formatter.result({
  "duration": 16076276644,
  "status": "passed"
});
formatter.match({
  "location": "Definition_softpedia.click_the_user_icon_and_enter_username_password()"
});
formatter.result({
  "duration": 2452886126,
  "status": "passed"
});
formatter.match({
  "location": "Definition_softpedia.click_login_button()"
});
formatter.result({
  "duration": 6382071196,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "Search for application",
  "id": "softpedia-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@tc_03_search"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "launch the softpedia application",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Enter the word for search",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Click go button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "download the application",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Check file is exist or not",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_softpedia.launch_the_softpedia_application()"
});
formatter.result({
  "duration": 7502985151,
  "status": "passed"
});
formatter.match({
  "location": "Definition_softpedia.enter_the_word_for_search()"
});
formatter.result({
  "duration": 95550985,
  "status": "passed"
});
formatter.match({
  "location": "Definition_softpedia.clickgo_button()"
});
formatter.result({
  "duration": 7929367494,
  "status": "passed"
});
formatter.match({
  "location": "Definition_softpedia.download_the_application()"
});
formatter.result({
  "duration": 12046773678,
  "status": "passed"
});
formatter.match({
  "location": "Definition_softpedia.Check_file_is_exist_or_not()"
});
formatter.result({
  "duration": 3219720501,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "",
  "description": "Send feedback through contact us",
  "id": "softpedia-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@tc_04_contactus"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "click i named icon and contact us",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "click radio button from the list",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "enter a message and mail id",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "click send button",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_softpedia.launch_the_browser()"
});
formatter.result({
  "duration": 16895458673,
  "status": "passed"
});
formatter.match({
  "location": "Definition_softpedia.click_i_named_icon_and_contact_us()"
});
formatter.result({
  "duration": 114166918875,
  "status": "passed"
});
formatter.match({
  "location": "Definition_softpedia.click_radio_button_from_the_list()"
});
