#!/bin/bash

docker build  -t scottkurz/java-openliberty-odo --build-arg stacklabel=$1 -f ./Dockerfile .
