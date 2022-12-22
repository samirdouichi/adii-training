@echo off
SET mypath=%cd%
SET PLATFORM=mypath\..\platform
cd "%PLATFORM%"
docker-compose "down"
docker "image" "prune"
docker "rmi" "springboot-kafka-connect-debezium-ksqldb-kafka-connect:v1"