# Spring Boot avec Kafka Producer microservice

Ce projet couvre l'utilisation de Spring Boot avec Spring Kafka pour consommer des messages
JSON/String à partir de sujets Kafka.
![](images/im1.png)
## Publier vers le topic Kafka via le message JSON de la console
-  `docker exec -it broker sh`
-   `cd /bin`
- `./kafka-console-producer --broker-list localhost:9092 --topic Kafka_Example`
## Publier vers le topic Kafka via le message String de la console
-  `docker exec -it broker sh`
- `cd /bin
- `./kafka-console-producer --broker-list localhost:9092 --topic Kafka_Example_json`


