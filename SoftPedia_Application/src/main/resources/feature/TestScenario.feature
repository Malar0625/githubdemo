@softpedia
Feature: SoftPedia Application

@tc_01_reg
Scenario:
	Create a account
	Given launch and registration
	And close the browser

@tc_02_login
Scenario:
	Login account
	Given launch application
	Then click the user icon and enter username password
	And click login button
	
@tc_03_search
Scenario:
	Search for application
	Given launch the softpedia application
	Then Enter the word for search
	Then Click go button
	Then download the application
	And Check file is exist or not
	
@tc_04_contactus
Scenario:
	Send feedback through contact us
	Given launch the browser
	Then click i named icon and contact us
	Then click radio button from the list
	Then enter a message and mail id
	And click send button
	
@tc_05_SubmitApplication	
Scenario:
	Alert Handling in submit Application
	Given launch browser
	Then click i named icon and submit application
	Then click submit form	And  Handle the alert message
	
@tc_06_PhoneFinder
Scenario:
	Finding the phone based on requirements
	Given launch the Softpedia application in browser
	Then scroll down to the page and click on find your phone
	Then select brand flatform battery and availability 
	And click go button
	
	