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


## Sources
- https://github.com/camunda/docker-camunda-bpm-platform/blob/next/test/docker-compose.yml
- https://docs.camunda.org/manual/latest/reference/rest/process-instance/