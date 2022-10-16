# alanda.io - Homework Project

## Introduction

- Tomcat is used as webserver as no specific

---

## Setup

 Simply start by pulling up the docker stack:

    docker-compose up

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

## Sources
- https://github.com/camunda/docker-camunda-bpm-platform/blob/next/test/docker-compose.yml
- https://docs.camunda.org/manual/latest/reference/rest/process-instance/
- https://www.youtube.com/watch?v=fLeUaVwpuZw
- https://stackoverflow.com/questions/68562246/access-remote-camunda-service-programmatically
- https://github.com/camunda-community-hub/camunda-platform-7-rest-client-java