FROM bellsoft/liberica-openjdk-alpine-musl:11.0.3
WORKDIR /usr/local/app
ADD build/libs/dockercompose-0.0.1-SNAPSHOT.jar app.jar
CMD java -jar ./app.jar