@echo off
SET mypath=%cd%
SET APPS=mypath\..\apps
SET PLATFORM=mypath\..\platform
cd "%APPS%/kafka/consumer"
mvn "clean" "install" "-DskipTests"
cd "%APPS%/kafka/producer"
mvn "clean" "install" "-DskipTests"
cd "%APPS%/kstream/domain-crawler"
mvn "clean" "install" "-DskipTests"
cd "%APPS%/kstream/domian-processor"
mvn "clean" "install" "-DskipTests"
cd "%APPS%/kstream/domain-service"
mvn "clean" "install" "-DskipTests"
cd "%APPS%/ksql/datagen"
mvn "clean" "install" "-DskipTests"
cd "%PLATFORM%"
docker-compose "up" "-d"
echo ""
echo "Create superset user...."
docker "exec" "-it" "superset" "superset" "fab" "create-admin" "--username" "admin" "--firstname" "Superset" "--lastname" "Admin" "--email" "admin@superset.com" "--password" "admin"
echo ""
echo "Migrate superset local DB to latest and  Setup superset roles...."
docker "exec" "-it" "superset" "superset" "db" "upgrade"
docker "exec" "-it" "superset" "superset" "init"
echo ""
echo "Waiting for platform to be ready...."
echo "Platform ready!"
echo "Now you can execute the next script to send movements automatically to the broker or sending manually"