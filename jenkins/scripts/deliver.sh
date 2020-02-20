#!/usr/bin/env bash

echo 'The following Maven command installs your Maven-built Java application'
set -x
mvn package
java -jar target/adodenhaag-backend-0.0.1-SNAPSHOT.jar > outputbe.txt &
echo 'done
exit 0
