# Charter Enterprise MOTD Sample Project
A small project to help assess candidate experience with web services and our technology stack.

## Instructions
We have provided a web service that provides a "message of the day", similar to what you might see logging into a 
Unix system. Unfortunately, at Charter things don't always go as planned and we need to change the message.  We need you
 to add the ability to change the 
message.  A message history should be kept for auditing purposes, so a second new endpoint will be needed to retrieve the 
history.  The message can be stored in the service using any mechanism you like but aim for simplicity.  A persistent store
like MySQL or Hypersonic could be overkill for this new requirement (hint: just use a private member variable in the
 controller class, it's not great design, but this isn't a real piece of software either!).
Iterative requests for the MOTD should return the new message, if it has been changed.
Be sure to edit this README.md so we understand what you've done.

Also, a rogue developer has left the code base broken.  To get anything done, you're doing to have to fix the tests first!
And, no, -DskipTests is not a solution!

Push your answer to this GitHub repo as a feature branch and create a pull request so we know you're done.

### Getting Started
* To compile
```mvn clean package```

* To run
```mvn spring-boot:run```

* To see the message:
```curl localhost:8080```

* To see the history:
```curl localhost:8080/history```

### Prerequisites
* Java 1.8
* Maven
* cURL
  
### Deployment
If you whiz through this sample, try adding a deployment.   We are a Docker and AWS shop.  Getting something into an
AWS or Heroku, or whatever you're comfortable with will be an "A+"

### Project hints and questions
* Stuck getting started?
  * The official Spring Boot "hello world" example is a great starting point.
* Still need help?
  * Further hints are available, feel free to ask questions here.  Edit this file in your branch by adding to the 
questions section, push it, and we will update the file with answers. 

