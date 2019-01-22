# Spring Cassandra Template

A quick project template for getting started with Spring Boot and Cassandra. Includes a few REST endpoints for creating/getting/deleting an object.

# Required

  - [Maven] to build the project
  - Cassandra  (I use a [Docker] container with the following command)
```sh
docker run --name cassandra -d -p 9042:9042 cassandra:3.0
```

### Setting up cassandra DB

You can create the table neccessary to run the app by running the following CQL (I used [TablePlus] to connect and run CQL):

```sh
CREATE TABLE testkeyspace.person_table ( 
   id UUID PRIMARY KEY, 
   first_name text, 
   last_name text);
```


### REST Endpoints
The user object represented in JSON looks like the following:
```sh
{
    "id": "08216465-222e-4487-b3e0-f8c024cd4c9c",
    "firstName": "Bob",
    "lastName": "Loblaw"
}
```
#### Create/Update User

POST localhost:9090/users
With Body: 
```sh
{
    "id": "08216465-222e-4487-b3e0-f8c024cd4c9c",
    "firstName": "Bob",
    "lastName": "Loblaw"
}
```

#### Get User

GET localhost:9090/users/{id}

#### Delete User

DELETE localhost:9090/users/{id}




   [Maven]: <https://www.mkyong.com/maven/how-to-install-maven-in-windows/>
   [Docker]: <https://www.docker.com/>
   [TablePlus]: <https://tableplus.io/>
  
