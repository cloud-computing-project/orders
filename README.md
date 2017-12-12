# RSO: Orders microservice

## Prerequisites

```bash
docker run -d --name orders -e POSTGRES_USER=dbuser -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=order -p 5433:5432 postgres:latest
```

## Run application in Docker

```bash
docker run -p 8081:8081 ejmric/orders
```

## Travis status 
[![Build Status](https://travis-ci.org/cloud-computing-project/orders.svg?branch=master)](https://travis-ci.org/cloud-computing-project/orders)