#!/bin/bash

docker build -t ajymau/java-openliberty-odo -t ajymau/java-openliberty-odo:0.2 -t ajymau/java-openliberty-odo:0.2.2 --build-arg stacklabel=$1 -f ./Dockerfile .
