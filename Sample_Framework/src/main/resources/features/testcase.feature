@carwale_feature
Feature: carwale website

@tc_01_login
Scenario:
	Check the login credentials
	
	Given the user launched the chrome browser 
	
	Then click the user login icon
	Then enter username and password then click login
	
	
@tc_02_search
Scenario:
	Search for cars 
	
	Given the user launched the chrome 
	When the user enter the search product
	Then select the car from dropdown list
	Then the user select the version
	Then the user select the city
	And click the offer button 
	



	
	
	
