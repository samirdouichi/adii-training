#!/bin/bash

APPS=$(pwd)/../apps
PLATFORM=$(pwd)/../platform


## build image of generator for kafka app (consumer)
cd "$APPS/kafka/consumer"
##mvn clean spring-boot:build-image -Dspring-boot.build-image.imageName=consumer:v1 -DskipTests
mvn clean  install -DskipTests

## build image of generator for kafka app (producer)
cd "$APPS/kafka/producer"
##mvn clean spring-boot:build-image -Dspring-boot.build-image.imageName=producer:v1 -DskipTests
mvn clean  install -DskipTests



## build image of domain-crawler kstream
cd "$APPS/kstream/domain-crawler"
##mvn clean spring-boot:build-image --projects read-article-service -Dspring-boot.run.jvmArguments="-Dserver.port=9083"
##mvn clean spring-boot:build-image -Dspring-boot.build-image.imageName=domain-crawler:v1 -DskipTests
mvn clean  install -DskipTests

## build image of fraud checker ktable kafka  service
cd "$APPS/kstream/domian-processor"
## mvn clean spring-boot:build-image  -Dspring-boot.build-image.imageName=domain-processor:v1 -DskipTests
mvn clean  install -DskipTests


## build image of fraud checker ktable kafka  service
cd "$APPS/kstream/domain-service"
## mvn clean spring-boot:build-image  -Dspring-boot.build-image.imageName=domain-service:v1 -DskipTests
mvn clean  install -DskipTests

## build image of fraud checker ktable kafka  service
cd "$APPS/ksql/datagen"
## mvn clean spring-boot:build-image  -Dspring-boot.build-image.imageName=domain-service:v1 -DskipTests
mvn clean  install -DskipTests

## Launch platform
cd "$PLATFORM"
docker-compose up -d

echo ""
echo "Create superset user...."
docker exec -it superset superset fab create-admin \
               --username admin \
               --firstname Superset \
               --lastname Admin \
               --email admin@superset.com \
               --password admin

echo ""
echo "Migrate superset local DB to latest and  Setup superset roles...."
docker exec -it superset superset db upgrade
docker exec -it superset superset init
echo ""
echo "Waiting for platform to be ready...."
##(docker-compose logs fraud-checker -f -t &) | grep -q 'Started FraudCheckerApplication'

echo "Platform ready!"
echo "Now you can execute the next script to send movements automatically to the broker or sending manually"
