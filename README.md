#RESTFul webservice

### prerequisite

- Java 8 : https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html
- Maven : https://maven.apache.org/install.html

1. Run with Maven

```
❯ mvn clean install
❯ mvn spring-boot:run

```
2. check out

```
curl http://localhost:8080/api/price?minutes=<INTEGER>&zone=<M1,M2>

```
Optional:

Build Docker image and run the container locally

```
mvn clean package docker:build

❯ docker images
REPOSITORY                                  TAG                 IMAGE ID            CREATED             SIZE
io.dynamicus/parkit                         latest              164c2ae5cac9        2 hours ago         768 MB

docker run -it --rm -p 9000:9000 io.dynamicus/parkit:latest

```
Check running container

```
❯ docker ps -a
CONTAINER ID        IMAGE                        COMMAND                  CREATED             STATUS                  PORTS                    NAMES
b397ac5a94ab        io.dynamicus/parkit:latest   "sh -c 'java $JAVA..."   16 seconds ago      Up 15 seconds           0.0.0.0:9000->9000/tcp   goofy_ramanujan
```


### Future plan for API management is to use API gateway, for example Kong https://getkong.org/

### References

- Spring-boot : https://projects.spring.io/spring-boot


