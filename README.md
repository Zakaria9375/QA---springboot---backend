# QA-backend

This repository is a Java application developed using the powerful Spring Framework, designed to serve as a backend for my frontend repository [QA-React](https://github.com/Zakaria9375/Q-A-react) 

## Technologies

The technologies used in this project are:

* Java
* Spring Framework with the following dependencies
  * Spring data jpa
  * Spring data rest
  * Postgresql Driver
  * Lombok
  * Spring devtools
  * Spring web
* Postgresql

## Prerequisites

Before you begin to work with this repo in your local machine, ensure you have met the following requirements:
- Java Development Kit (JDK) 11 or later
- Maven 3.6.3 or later
- Docker (optional, for containerization)

## Setup

To run this app in development mode open the terminal and write the following:

```sh
git clone https://github.com/Zakaria9375/QA-springboot-backend

cd QA-springboot-backend

./mvnw clean package

./mvnw spring-boot:run

java -jar target/qa-0.0.1-SNAPSHOT.jar
```

## Endpoints

The API is available at `https://inevitable-odelle-zaportfolio-3128ae44.koyeb.app/`

<details>
<summary>API-endpoints</summary>

### Questions

#### List of questions by page

> GET `/questions`

#### Search for a question by title

> GET `/questions/search/findByTitleContaining?title=${searchTerm}`

### Answers 

#### List of answers for a specific questions

> GET `/answers/search/findAllByQuestionId?questionId=${questionId}`

#### Edit an answer by ID

> PUT `/answers/:id`

The request body needs to be in JSON format and include the following properties:
* content: required
* userId: optional
* questionId: required
* createdAt: required

``` json
{
  "content": "This is an edited answer",
  "userId": "/users/2",
  "questionId": "/questions/5",
  "createdAt": "Data of creaion"
}
```

#### Add a new answer

> POST `/answers`

The request body needs to be in JSON format and include the following properties:
* content: required
* userId: optional
* questionId: required

``` json
{
  "content": "This is a new answer",
  "userId": "/users/2",
  "questionId": "/questions/5"
}
```

#### Delete an answer by ID

> DELETE `/answers/:id`

### Users

#### Get a user by ID

> GET `/users/:id` 

</details>

## Docker Image

You can also run this application using the Docker image available on Docker Hub.

Docker Hub Repository: [zakaria9375/qa](https://hub.docker.com/repository/docker/zakaria9375/qa)

To pull and run the Docker image, use the following command:

``` shell
docker pull zakaria9375/qa:1.0

docker run -d -p 8050:8050 zakaria9375/qa:1.0
```

## Database

Postgresql database has been used in this application. Here is the flowchart that illustrates the database tables:

<img src="/EDR.PNG" alt="Entity-Relationship Diagram">

## Retrospectives

> What went well ?

This app has successfully managed to perform CRUD operation on the Postgresql database and creating the necessary api endpoints for a successful communication with the frontend.

> What could be improved ?

Securing the api endpoints. (ToDo)

## About the Author

>  In every project I develop, I focus on improving code quality and incorporating new techniques into my development process. I strive to learn from my mistakes by addressing them directly and applying those lessons to future projects. My goal is to continuously refine and enhance ***my standard approach to project development***.

* Portfolio - [Zakaria Ali](https://zaportfolio.netlify.app/)
* Frontend Mentor Profile - [@Zakaria9375](https://www.frontendmentor.io/profile/Zakaria9375)
* Project by - [Frontend Mentor team](https://www.frontendmentor.io/)

## Contributing

**Want to contribute?** *Great!* Here’s how you can help:

1. Fork the repo and create your branch from `main`.
2. Make your changes and test.
3. Issue that "pull" request!
