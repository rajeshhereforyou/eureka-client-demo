# What is this?

This is a simple Spring boot 2 app acting as a eureka client and registering itself with a sample eureka server. 

## Pre-requisite

1. Before running this app, you have to make sure that you have the a sample Eureka server is up and running. 
You can find the instructions and code to build and deploy a sample Eureka server using Spring Boot 2 at 

https://github.com/rajeshhereforyou/eureka-server-demo

## How to clone, build and deploy this app?

Step 1: Clone this repo at https://github.com/rajeshhereforyou/eureka-client-demo.git

Step 2: Once you cloned the repo,all the gradle dependencies should be resolved and available in your classpath to run the app as an Eureka Client

Step 3: Now, you can run the app using Spring boot 'bootRun' command

Step 4: Once you have the app up and running, you can the health of the app using 'http://localhost:8080/actuator/health'. This should return '{"status":"UP"}'

Step 5: That's it, it's so simple to build and deploy a sample Eureka Client.

### If you want to see if this app is registered as a client with the Eureka server mentioned in the 'pre-requisite' section, Please follow the instructions mentioned at  

https://github.com/rajeshhereforyou/eureka-server-demo

If you are interested to see the eureka client  configuration, you can see the code at '/src/main/resources/application.yml' in this repo


### Here are couple of REST endpoints if you are interested to see your app details as a eureka client


http://localhost:8080/service-instances/EurekaClientDemoApplication

http://localhost:8080/services