# jwtapp
JWT based spring security REST API
REST Api with DB & CRUD operations with such entities:

User (id, username, password, created, updated, lastPasswordChangeDate, Status status)

Skill (id, name)

Developer (id, firstName, lastName, specialty, Set skills, Account account)

Account(id, accountData)

enum Status {... ACTIVE, DELETED, BANNED ...}

Requirements:

All CRUD operations for every entity

MVC pattern

Use Maven & Spring (IoC, Security, Data, etc.)

For connection with DB use - Spring Data

Initializing DB should be with liquibase

User interaction needs to be implemented with Postman (https://www.getpostman.com/)

Repository should have badge travis(https://travis-ci.com/)

App should have 3 roles: ROLE_ADMIN (has full access to all entities)

ROLE_MODERATOR (has read and write access for all entities Developer + Account)

ROLE_USER (has read access for entities Developer, Account, Skill)

Application should use heroku(https://heroku.com/)

Service layer and controllers must be covered by unit tests

Technologies: Java, MySQL, Spring (MVC, Web, Data, Security, Boot), Lombok, Maven, Liquibase.
