Feature: site 
	As a user 
I want to open a website
so that i can check menu
Scenario: check Menu of com.jbk 
	Given open a browser 
	When I open a Sites
	#When I open a Url #file:///F:/Selenium%20prgm/Offline%20Website/index.html
	Then AdminLTE menu should appears