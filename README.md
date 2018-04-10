# spring-boot-actuator

See http://www.baeldung.com/spring-boot-actuators

http://localhost:8080/actuator/features
http://localhost:8080/actuator/info
  - app and java information
  - git information
  - custom dynamic user info contributor information
  
Change the log level at runtime.
curl -i http://localhost:8080/actuator/loggers
curl -i http://localhost:8080/actuator/loggers/com.springboot.service.LogOutputGeneratorService
curl -i -X POST -H 'Content-Type: application/json' -d '{"configuredLevel": "TRACE"}' http://localhost:8080/actuator/loggers/com.springboot.service.LogOutputGeneratorService