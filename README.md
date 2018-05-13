# Charter Enterprise MOTD Sample Project
 	
 	This is a sample project to view and publish the message
 	
 	Created a Web service with GET(to retrieve the message) and PUT(Update the new message) operations
 	
# Prerequisites	
 
 	Java 1.8
 	Spring Boot
 	Maven
 	Docker
 	
 	
# Getting Started 	

	To compile 
	
	mvn clean package
	
	The Web Service will return a error if we try to set the empty message.
	
	The web service will return the new updated message if we do the PUT operations multiple times
	
# To run

	mvn spring-boot:run	
	
		
# Test

	Used Postman rest client to test the web service.		
	
# Deployment

	Building the Docker Image
		docker build --tag=motd-server --build-arg JAR_FILE=motd-code-sample-1.0-SNAPSHOT.jar	
		
		