#!/usr/bin/env bash

echo 'The following Maven command installs your Maven-built Java application'
set -x
mvn package
java -jar target/${NAME}-${VERSION}.jar &
set +x
