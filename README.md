# Microservices Practice

## Program launch order:
- naming-server
- api-gateway
- currency-exchange
- currency-conversion

## URLs:
- Currency Exchange Service: http://localhost:8000/currency-exchange/from/USD/to/JPY
- Currency Conversion Service: http://localhost:8100/currency-conversion/from/USD/to/JPY/quantity/10  
or http://localhost:8100/currency-conversion-feign/from/USD/to/JPY/quantity/10
- Eureka: http://localhost:8761/
- API Gateway: http://localhost:8765/currency-exchange/from/EUR/to/JPY  
http://localhost:8765/currency-conversion/from/USD/to/JPY/quantity/10  
http://localhost:8765/currency-conversion-feign/from/USD/to/JPY/quantity/10
- Zipkin: http://localhost:9411/

## Running Zipkin on Windows
- Download Zipkin jar
```bash
https://search.maven.org/remote_content?g=io.zipkin&a=zipkin-server&v=LATEST&c=exec
```

## The project include the following features:
- Develop and design REST API and REST WEB SERVICES with Spring Boot
- Orchestrate microservices with KUBERNETES
- Implement Exception Handling, Validation, HATEOAS and filtering for RESTful Web Services.
- Setup Centralized Microservices Configuration with Spring Cloud Config Server
- Implement Fault Tolerance for microservices with Hystrix
- Understand how to monitor RESTful Services with Spring Boot Actuator
- Understand the best practices in designing RESTful web services
- Simplify communication with other Microservices using Feign REST Client
- Develop MICROSERVICES with Spring Boot and Spring Cloud
- Create containers for microservices with DOCKER
- Implement client side load balancing (Ribbon), Dynamic scaling(Eureka Naming Server) and an API Gateway (Zuul)
- Learn to implement Distributed tracing for microservices with Spring Cloud Sleuth and Zipkin
- Understand how to version your RESTful Web Services
- Understand how to document RESTful Web Services with Swagger
- Using Spring Cloud Bus to exchange messages about Configuration updates

## Technologies:
- Spring Boot
- Spring Cloud
- Eureka
- Ribbon
- Zuul
- Spring Security
- Spring Cloud Sleuth
- Spring Cloud Config
- Hystrix
- Cloud platform - GCP
