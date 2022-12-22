#!/bin/bash

PLATFORM=$(pwd)/../platform

# remove infrastructure
cd "$PLATFORM"
docker-compose down

# remove <none> images
docker image prune
docker rmi read-article-service:v1
docker rmi springboot-kafka-connect-debezium-ksqldb-kafka-connect:v1