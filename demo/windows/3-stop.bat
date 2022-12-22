@echo off

SET PLATFORM=%undefined%\..\platform
cd "%PLATFORM%"
docker-compose "down"
docker "image" "prune"