FROM openjdk:17-alpine
WORKDIR /app
COPY target/activej-http.jar ./
EXPOSE 8080
ENTRYPOINT java $SYS_PROPS -jar activej-http.jar

# Note : run it with `docker build -t <your_image_name> -f src/docker/Dockerfile .`
