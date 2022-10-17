# alanda.io - Homework Project

## Introduction

- Camunda Run is used for this exercise
- Networking is done via docker links/hostname

---

## Setup

 Simply start by building the Spring Boot Image and pulling up the docker stack:

    ./mvnw clean spring-boot:build-image && docker-compose up

---

## Verifying Installation

#### Verify database initialisation

Check whether tables are created properly

    docker exec -it alandaio-postgres-1 /usr/bin/psql -U camunda

#### Verify API connectivity

Check REST response from http://localhost:8080/engine-rest/process-instance/count

#### Verify WebApp Functionality

All webapps can be accessed through the following link: http://localhost:8080/camunda-welcome/index.html

The cockpit may be reached through http://localhost:8080/camunda/app/cockpit/default/#/dashboard

The username & password for any authentication is "demo" by default.

#### Verify bpmn mounting

    docker exec -it alandaio-spring-app-1 /bin/sh

## Sources
- https://github.com/camunda/docker-camunda-bpm-platform/blob/next/test/docker-compose.yml
- https://docs.camunda.org/manual/latest/reference/rest/process-instance/
- https://www.youtube.com/watch?v=fLeUaVwpuZw
- https://stackoverflow.com/questions/68562246/access-remote-camunda-service-programmatically
- https://github.com/camunda-community-hub/camunda-platform-7-rest-client-java
- https://stackoverflow.com/questions/31746182/docker-compose-wait-for-container-x-before-starting-y/41854997#41854997
- https://stackoverflow.com/questions/65325129/execute-spring-buildpacks-when-calling-docker-compose-build-command