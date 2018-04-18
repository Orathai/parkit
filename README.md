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

### Future plan for API management is to use API gateway, for example Kong https://getkong.org/

### References

- Spring-boot : https://projects.spring.io/spring-boot


