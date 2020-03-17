$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/BLTuser.BLT215/Desktop/SoftPedia_Application/src/main/resources/feature/TestScenario.feature");
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
  "description": "Create a account",
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
  "location": "Definition_Register.launch_and_registration()"
});
formatter.result({
  "duration": 170700875103,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Register.close_the_browser()"
});
formatter.result({
  "duration": 3375457671,
  "status": "passed"
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
  "location": "Definition_Login.launch_application()"
});
formatter.result({
  "duration": 13500398601,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Login.click_the_user_icon_and_enter_username_password()"
});
formatter.result({
  "duration": 1577511512,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Login.click_login_button()"
});
formatter.result({
  "duration": 5517709516,
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
  "location": "Definition_Search.launch_the_softpedia_application()"
});
formatter.result({
  "duration": 6614587529,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Search.enter_the_word_for_search()"
});
formatter.result({
  "duration": 105189861,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Search.click_go_button()"
});
formatter.result({
  "duration": 5095396626,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Search.download_the_application()"
});
formatter.result({
  "duration": 16657881503,
  "status": "passed"
});
formatter.match({
  "location": "Definition_Search.Check_file_is_exist_or_not()"
});
formatter.result({
  "duration": 3424699570,
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
  "location": "Definition_ContactUs.launch_the_browser()"
});
formatter.result({
  "duration": 13156056506,
  "status": "passed"
});
formatter.match({
  "location": "Definition_ContactUs.click_i_named_icon_and_contact_us()"
});
formatter.result({
  "duration": 3099906779,
  "status": "passed"
});
formatter.match({
  "location": "Definition_ContactUs.click_radio_button_from_the_list()"
});
formatter.result({
  "duration": 211737849,
  "status": "passed"
});
formatter.match({
  "location": "Definition_ContactUs.enter_a_message_and_mail_id()"
});
formatter.result({
  "duration": 609074615,
  "status": "passed"
});
formatter.match({
  "location": "Definition_ContactUs.click_send_button()"
});
formatter.result({
  "duration": 6616968898,
  "status": "passed"
});
});