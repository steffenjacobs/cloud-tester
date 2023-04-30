# Cloud Tester

This application serves as a very simple test application. There are two endpoints. 
The first one creates a random UUID, stores it to the DB and returns it. 
The second endpoint returns all ids from the database.

To differentiate which instance generated each UUID, an instance id is generated on startup.
This instance id is also stored to the database.

## Setup
1. Make sure Java >= 20 is installed
2. Make sure docker is installed
3. `./gradlew buildDockerImage`

## Deployment
`cd deployment && docker-compose up -d`

## Usage

HTTP GET http://localhost:8080/api/uid

`{"uuid":"e8c3fdc7-cb42-4a58-95a7-7e3a521ea6a7","instanceId":-4169380026490812220}`

HTTP GET http://localhost:8080/api/uid/log

`[
{
"uuid":"c99234e2-b6af-4c6d-adcd-0e18270a45d3",
"instanceId":-4169380026490812220
},
{
"uuid":"e8c3fdc7-cb42-4a58-95a7-7e3a521ea6a7",
"instanceId":-4169380026490812220
}
]`

