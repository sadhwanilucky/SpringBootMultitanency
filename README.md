# Multi Tenancy with Spring Boot, Hibernate & Liquibase

## Overview

Multi Tenancy usually plays an important role in the business case for
SAAS solutions. Spring Data and Hibernate provide out-of-the-box support
for different Multi-tenancy strategies. Configuration however becomes more
complicated, and the available examples are few.

This project complements my blog series on Multi Tenancy
(see https://callistaenterprise.se/blogg/teknik/2020/09/19/multi-tenancy-with-spring-boot-part1/),
and contains working examples of different Multi Tenant strategies implemented with
Spring Boot, Hibemate and Liquibase, complete with support for database
migrations as well as dynamically set up new tenants on the fly.

## How to use the examples

The master branch contains a common, minimal example project skeleton. The
different Multi-tenancy strategy examples are in separate branches.

### Database per tenant

The `database` branch implements the *Database per tenant* strategy.

### Schema per tenant

The `schema` branch implements the *Schema per tenant* strategy.

### Shared Database with Discriminator, using Hibernate Filters

The `shared_database_hibernate` branch implements the *Shared Database with Discriminator*
strategy, using Hibernate's experimental support for discriminator-based multi-tenancy
(see e.g. https://hibernate.atlassian.net/browse/HHH-6054)

### Shared Database with Discriminator, using PostgreSQL's Row Level Security

The `shared_database_postgres_rls` branch implements the *Shared Database with Discriminator*
strategy, using PostgreSQL's Row Level Security.

## How to start a Dockerized postgres database

All the examples require a postgres database running at localhost:5432. Run the following command 
to use the provided `docker-compose.yml` configuration to start a dockerized postgres
container:

```
docker-compose up -d
```

Close it down with the following command when done, or if you need to recreate the database:

```
docker-compose down
```

