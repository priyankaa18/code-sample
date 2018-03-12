# Charter Enterprise MOTD Sample Project
A small project to help assess candidate experience.

## Instructions
Create a webservice that provides a "message of the day", similar to what you might see logging into a Unix system.  
This service will likely only do two things; first it should retrieve the message of the day and send it back,
 and second it should be possible to change the 
message.  No message history or any other advanced functionality is needed, unless there is something you'd like to show
off.  The message can be stored in the service using any mechanism you like, but aim for simplicity.  You don't need to 
implement a persistent store
like MySQL or Hypersonic, but iterative requests for the MOTD should return a changed message, if it has been changed.
Be sure to edit this README.md so we understand what you've done.

### Getting Started
In this section of the README.md, provide instructions on how to compile and run any of your code.  These instructions
 will require information
on installing any tools you choose that aren't Java or Maven.

Push your answer to this Github repo as a feature branch and create a pull request so we know you're done.

### Prerequisites
* We are a Spring Boot shop.   Any use of Spring is ideal, but our goal isn't for you to spend a ton of
time on this.   Use whatever stack you're most familiar with.
* Our main tools are Maven and Git, but again, feel free to use what is most efficient for you.
  
### Deployment
If you whiz through this sample, try adding a deployment.   We are a Docker and AWS shop.  Getting something into an
AWS or Heroku, or whatever you're comfortable with will be an "A+"

### Project hints and questions
* Stuck getting started?
  * The official Spring Boot "hello world" example is a great starting point.
* Still need help?
  * Further hints are available, Feel free to ask questions here.  Edit this file in your branch by adding to the 
questions section, push it, and we will update the file with answers. 