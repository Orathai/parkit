FROM openjdk:8

VOLUME /tmp

ADD parkit-1.0-SNAPSHOT.jar parkit.jar

RUN sh -c 'touch /parkit.jar'

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /parkit.jar" ]